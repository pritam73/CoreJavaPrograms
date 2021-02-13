package com.corejava.practice;

public class BinaryGap {

	public static int solution(int N) {
		String binary = Integer.toBinaryString(N);
		int count = 0;
		int tmpCount = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '0') {
				if (i > 0 && binary.charAt(i - 1) == '1') {
					tmpCount++;
				} else {
					if (tmpCount > 0)
						tmpCount++;
				}
			} else if (binary.charAt(i) == '1') {
				if (tmpCount > 0 && tmpCount > count) {
					count = tmpCount;
				}
				tmpCount = 0;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		solution(532);
	}
}

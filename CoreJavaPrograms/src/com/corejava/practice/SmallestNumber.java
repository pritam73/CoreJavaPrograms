package com.corejava.practice;

public class SmallestNumber {

	static int solution(int x, int y, int z) {
		int n = 0;
		while (x != 0 && y != 0 && z != 0) {
			x = x - 1;
			y = y - 1;
			z = z - 1;
			n++;
		}
		return n;
	}

	public static void main(String args[]) {
		int x = 100, y = 15, z = 18;
		System.out.println(solution(x, y, z));
	}
}

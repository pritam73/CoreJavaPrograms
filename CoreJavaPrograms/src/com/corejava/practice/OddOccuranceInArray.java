package com.corejava.practice;

public class OddOccuranceInArray {

	public static void main(String args[]) {
		int[] arr = new int[] {9,3,9,3,9,7,9,7,5,5,5};
		solution(arr);
	}

	public static int solution(int[] A) {
		int result = 0;
		for (int x : A) {
			result ^= x;
		}
		System.out.println(result);
		return result;
	}
}

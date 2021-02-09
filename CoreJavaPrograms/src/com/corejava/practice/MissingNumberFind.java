package com.corejava.practice;

public class MissingNumberFind {

	public static void main(String args[]) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 8 };
		solution(arr);
	}

	public static int solution(int[] arr) {
		int sum = 0, max = 0;
		for (int n : arr) {
			sum += n;
			if (n > max)
				max = n;
		}
		System.out.println((max * (max + 1) / 2) - sum);
		return (max * (max + 1) / 2) - sum;
	}
}

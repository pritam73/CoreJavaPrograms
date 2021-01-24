package com.corejava.practice;

import java.util.Arrays;
import java.util.Collections;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		solution(arr, 3);
		solution2(arr, 2);
	}

	public static int[] solution(int[] arr, int n) {
		int[] finalArray = new int[arr.length];
		for (int i = 0; i < n; i++) {
			int j, last;
			last = arr[arr.length - 1];
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		for (int i = 0; i < arr.length; i++) {
			finalArray[i] = arr[i];
			System.out.print(arr[i] + " ");
		}
		return finalArray;
	}

	// Using Collections
	public static void solution2(int[] arr, int n) {
		Collections.rotate(Arrays.asList(arr), n);
		System.out.println(Arrays.toString(arr));
	}
}

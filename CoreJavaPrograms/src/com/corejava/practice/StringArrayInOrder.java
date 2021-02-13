package com.corejava.practice;

import java.util.Arrays;

public class StringArrayInOrder {

	static String[] solutions(String myArray[]) {
		int size = myArray.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i].compareTo(myArray[j]) > 0) {
					String temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		return myArray;
	}

	public static void main(String args[]) {
		String[] myArray = { "Ball", "Apple", "Cat", "Egg", "Solve", "Neon" };
		System.out.println(Arrays.toString(solutions(myArray)));
	}
}

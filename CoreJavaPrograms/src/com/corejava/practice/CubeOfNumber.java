package com.corejava.practice;

import java.util.Scanner;

public class CubeOfNumber {
	public static void main(String args[]) {
		System.out.println("Enter a number ::");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Cube of the given number is " + (num * num * num));
		sc.close();
	}
}
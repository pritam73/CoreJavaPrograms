package com.corejava.practice;

public class ReverseString {

	static String solution(String data) {

		int i, len = data.length();
		StringBuilder dest = new StringBuilder(len);
		for (i = (len - 1); i >= 0; i--) {
			dest.append(data.charAt(i));
		}
		return dest.toString();
	}

	public static void main(String args[]) {
		String data = "Java is a programing language	";
		System.out.println(solution(data));
	}

}

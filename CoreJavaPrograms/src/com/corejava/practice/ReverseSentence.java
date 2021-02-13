package com.corejava.practice;

public class ReverseSentence {

	static String solution(String data) {
		String[] split = data.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
			result += (split[i] + " ");
		}
		return result.trim();
	}

	public static void main(String args[]) {
		String data = "Java is a programing language";
		System.out.println(solution(data));
	}

}

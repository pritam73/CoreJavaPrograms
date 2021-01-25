package com.corejava.practice;

public class FrogJump {

	public static void main(String args[]) {
		int x = 10;
		int y = 100;
		int d = 20;
		frogMinimumCount(x, y, d);
	}

	public static int frogMinimumCount(int X, int Y, int D) {
		int numberOfJumps = 0;

		if ((Y - X) < D) {
			numberOfJumps = 1;
		}
		if ((Y - X) % D == 0) {
			numberOfJumps = (Y - X) / D;
		} else {
			numberOfJumps = ((Y - X) / D) + 1;
		}
		return numberOfJumps;
	}
}

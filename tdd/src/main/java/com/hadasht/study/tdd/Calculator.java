package com.hadasht.study.tdd;

public class Calculator {

	private Calculator() {
		throw new IllegalStateException("Calculator is Utility class");
	}

	public static int plus(int x, int y) {
		return x + y;
	}

}

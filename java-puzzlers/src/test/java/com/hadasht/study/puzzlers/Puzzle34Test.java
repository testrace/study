package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("Count")
class Puzzle34Test {

	/*

	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		final int START = 2000000000;//(2,000,000,000)
		int count = 0;
		for (float f = START; f < START + 50; f++) {
			count++;
		}
		System.out.println("count = " + count);
	}


	/*
		부동소수점 타입을 반복변수로 사용하면 안된다.

	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		final int START = 2000000000;//(2,000,000,000)
		int count = 0;
		for (int f = START; f < START + 50; f++) {
			count++;
		}
		System.out.println("count = " + count);
	}

}

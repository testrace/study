package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("InfinityLoop")
class Puzzle29Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int i = 0;
		while ( i != i ) {
			System.out.println("i = " + i);
		}
	}


	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		double d = Double.NaN;
		while ( d != d ) {
			System.out.println("d = " + d);
		}
	}

}

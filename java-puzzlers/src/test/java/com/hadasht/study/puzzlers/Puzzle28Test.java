package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("InfinityLoop")
class Puzzle28Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int i = 0;
		while ( i == i+1 ) {
			System.out.println("i = " + i);
		}
	}


	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
//		double d = 1.0 / 0.0;
		double d = Double.POSITIVE_INFINITY;
		while ( d == d+1 ) {
			System.out.println("d = " + d);
		}
	}

}

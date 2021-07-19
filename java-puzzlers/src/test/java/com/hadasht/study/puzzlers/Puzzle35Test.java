package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Clock")
class Puzzle35Test {

	/*

	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int minutes = 0;
		for (int ms = 0; ms < 60 * 60 * 1000; ms++) {
			if (ms % 60*1000 == 0) {
				minutes++;
			}
		}
		assertThat(minutes).isEqualTo(60);

	}


	/*
		우선순위가 같은 연산자의 경우 순서대로 계산된다.

	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		final int MS_PER_HOUR = 60 * 60 * 1000;
		final int MS_PER_MINUTE = 60 *  1000;
		int minutes = 0;
		for (int ms = 0; ms <MS_PER_HOUR; ms++) {
			if (ms % MS_PER_MINUTE == 0) {
				minutes++;
			}
		}
		assertThat(minutes).isEqualTo(60);
	}

}

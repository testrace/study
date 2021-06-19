package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * long 자료형을 사용할 때는 소문자 엘(l)이 아닌 대문자 엘(L)을 사용한다.
 */
@DisplayName("초등학교 수준의 문제")
class Puzzle04Test {


	@Test
	@DisplayName(PUZZLE_NAME)
	void elementary() throws Exception {
		long puzzle = Puzzle04.elementary();
		assertThat(puzzle).isEqualTo(66666);
	}

	@Test
	@DisplayName(ANSWER_NAME)
	void elementary_Answer() throws Exception {
		long answer = Puzzle04.elementary_Answer();
		assertThat(answer).isEqualTo(17777);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void elementary_Solution() throws Exception {
		long solution = Puzzle04.elementary_Solution();
		assertThat(solution).isEqualTo(17777L);
	}


	public static class Puzzle04 {


		public static long elementary() {
			final long x = 12345;
			final long y = 5432l;
			return x + y;
		}

		public static long elementary_Answer() {
			final long x = 12345L;
			final long y = 5432L;
			return x + y;
		}

		public static long elementary_Solution() {
			final long x = 12345L;
			final long y = 5432L;
			return x + y;
		}

	}


}

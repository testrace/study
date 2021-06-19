package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.*;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("16진수의 즐거움")
class Puzzle05Test {


	@Test
	@DisplayName(PUZZLE_NAME)
	void elementary() throws Exception {
		String puzzle = Long.toHexString(Puzzle05.joyOfHex());
		assertThat(puzzle).isEqualTo("1cafebabe");
	}

	@Test
	@DisplayName(ANSWER_NAME)
	void elementary_Answer() throws Exception {
		String answer = Long.toHexString(Puzzle05.joyOfHex_Answer());
		assertThat(answer).isEqualTo("1cafebabe");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void elementary_Solution() throws Exception {
		String solution = Long.toHexString(Puzzle05.joyOfHex_Solution());
		assertThat(solution).isEqualTo("1cafebabe");
	}


	public static class Puzzle05 {


		public static long joyOfHex() {
			final long x = 0x100000000L;
			final long y = 0xcafebabe;
			return x + y;
		}

		public static long joyOfHex_Answer() {
			final long x = 0x100000000L;
			final long y = 0xcafebabeL;
			return x + y;
		}

		public static long joyOfHex_Solution() {
			final long x = 0x100000000L;
			final long y = 0xcafebabeL;
			return x + y;
		}

	}


}

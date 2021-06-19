package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.*;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("다중 자료형 변환")
class Puzzle06Test {


	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		long puzzle = Puzzle06.puzzle();
		assertThat(puzzle).isEqualTo(65535L);
	}

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle2() throws Exception {
		long puzzle = Puzzle06.puzzle2();
		assertThat(puzzle).isEqualTo(-1);
	}



	public static class Puzzle06 {


		/**
		 * int     -> byte    -> char    -> int
		 * <p>
		 * 부호있음 -> 부호있음 -> 부호없음 -> 부호있음
		 * </p>
		 * 부호확장 -> 부호확장 -> 0의확장  -> 0의확장
		 * <p>
		 * -1      ->  -1     -> 2^16 -1 -> 2^16 -1
		 * </p>
		 */
		public static long puzzle() {
			return (int) (char) (byte) -1;
		}

		public static long puzzle2() {
			return (long) (int) (byte) -1;
		}

	}


}

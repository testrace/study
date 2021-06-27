package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("BigDelight")
class Puzzle24Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		String puzzle = Puzzle24.puzzle();
		assertThat(puzzle).isEqualTo("Joy!");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		String solution = Puzzle24.solution();
		assertThat(solution).isEqualTo("Joy!");
	}

	public static class Puzzle24 {

		private static final byte TARGET = (byte) 0x90;

		/*
			0x90 은 byte의 범위(-128~127)를 벗어나는 int 타입의 상수이다.(+144)
			byte 타입은 부호를 가지기에 최상위 비트가 부호 비트이다.
			(byte)0x90 == 0x90 -> false
			자바는 byte 타입을 int 타입으로 기본자료형 확장변환을 수행하여 int 타입끼리 비교한다.
		 */
		public static String puzzle() {
			String result = null;
			for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
				if (b == 0x90) {
					result = "Joy!";
					break;
				}
			}

			return result;
		}

		public static String solution() {

			String result = null;
			for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
				if (b == TARGET) {
					result = "Joy!";
					break;
				}
			}

			return result;
		}

	}

}

package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("ABC")
class Puzzle12Test {


	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		String puzzle = Puzzle12.puzzle();
		assertThat(puzzle).isEqualTo("ABC easy as 123");
	}

	@Test
	@DisplayName(PUZZLE_NAME)
	void solution() throws Exception {
		String solution = Puzzle12.solution();
		assertThat(solution).isEqualTo("ABC easy as 123");
	}

	public static class Puzzle12 {

		private static final String letters = "ABC";
		private static final char[] numbers = {'1', '2', '3'};

		/**
		 * numbers 는 Object 클래스의 toString()을 상속 받아 처리된다.
		 * Object 의 toString 은 [클래스명@] 으로 시작한다.
		 * e.g. [C@1c8278c1
		 */
		public static String puzzle() {
			return letters + " easy as " + numbers;
		}

		public static String solution() {
			return letters + " easy as " + String.valueOf(numbers);
		}




	}
}

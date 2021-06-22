package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Last laugh")
class Puzzle11Test {


	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		String puzzle = Puzzle11.puzzle();
		assertThat(puzzle).isEqualTo("Ha");
	}

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle2() throws Exception {
		char puzzle = Puzzle11.puzzle2();
		assertThat(puzzle).isEqualTo(169);
	}

	public static class Puzzle11 {

		public static String puzzle() {
			return "H" + "a";
		}

		/**
		 *
		 * 72 + 97
		 * 기본 자료형 확장에 의해 char 타입이 int 타입으로 변형되어 계산(연산, 덧셈)된다.
		 *
		 */
		public static char puzzle2() {
			return 'H' + 'a';
		}




	}
}

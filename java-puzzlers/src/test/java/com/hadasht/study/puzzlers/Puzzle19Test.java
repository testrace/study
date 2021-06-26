package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Classy Fire")
class Puzzle19Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		String puzzle = Puzzle19.puzzle();
		assertThat(puzzle).isEqualTo("LETTER OPERATOR NUMERAL ");
	}



	public static class Puzzle19 {

		public static String puzzle() {
			return classify('n') + classify('+') + classify('2');
		}

		private static String classify(char ch) {
			if ("01234567890".indexOf(ch) >= 0) {
				return "NUMERAL ";
			}
			if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0) {
				return "LETTER ";
			}
			if ("+-*/&|!=".indexOf(ch) >= 0) {
				return "OPERATOR ";
			}
			return "UNKNOWN ";
		}

	}
}

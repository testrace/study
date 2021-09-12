package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Jeopardy")
class Puzzle72Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		assertThat(DoubleJeopardy.PRIZE).isEqualTo("$64,000");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		assertThat(DoubleJeopardySolution.prize()).isEqualTo("$64,000");
	}

	class Jeopardy {
		public static final String PRIZE = "$64,000";
	}

	class DoubleJeopardy extends Jeopardy {
		public static final String PRIZE = "2 cents";
	}

	static class JeopardySolution {
		private static final String PRIZE = "$64,000";
		public static final String prize() {
			return PRIZE;
		}
	}

	class DoubleJeopardySolution extends JeopardySolution {
		public static final String PRIZE = "2 cents";
	}

}

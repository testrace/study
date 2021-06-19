package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Dos Equis")
class Puzzle08Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		char puzzle = Puzzle08.puzzle();
		assertThat(puzzle).isEqualTo('X');

		int puzzle2 = Puzzle08.puzzle2();
		System.out.println("puzzle2 = " + puzzle2); // 88
		assertThat(puzzle2).isEqualTo('X');
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		char puzzle = Puzzle08.puzzle();
		assertThat(puzzle).isEqualTo('X');

		int solution = Puzzle08.solution();
		assertThat(solution).isEqualTo('X');
	}



	public static class Puzzle08 {

		public static char puzzle() {
			char x = 'X';
			return true ? x : 0;
		}

		public static int puzzle2() {
			char x = 'X';
			int i = 0;
			return false ? i : x;
		}

		public static char solution() {
			char x = 'X';
			int i = 0;
			return false ? (char) i : x;
		}

	}

}

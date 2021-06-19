package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("변수 교환")
class Puzzle07Test {


	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int[] puzzle = Puzzle07.puzzle();
		assertThat(puzzle[0]).isEqualTo(2001);
		assertThat(puzzle[1]).isEqualTo(1984);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		int[] puzzle = Puzzle07.solution();
		assertThat(puzzle[0]).isEqualTo(2001);
		assertThat(puzzle[1]).isEqualTo(1984);
	}



	public static class Puzzle07 {

		public static int[] puzzle() {
			int x = 1984; // 0x7c0
			int y = 2001; // 0x7d1
			x ^= y ^= x ^= y;
			return new int[]{x, y};
		}
		public static int[] solution() {
			int x = 1984; // 0x7c0
			int y = 2001; // 0x7d1
			int tmp = x;
			x = y;
			y = tmp;
			return new int[]{x, y};
		}


	}


}

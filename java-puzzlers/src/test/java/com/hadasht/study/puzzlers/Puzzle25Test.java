package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Increment")
class Puzzle25Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		var puzzle = Puzzle25.puzzle();
		assertThat(puzzle).isEqualTo(100);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		var solution = Puzzle25.solution();
		assertThat(solution).isEqualTo(100);
	}

	public static class Puzzle25 {

		/*
			후위 연산 ++ 은 수행되지 않는다.
			1. (j = j)++ 괄호안의 표현식만 수행된다. (값이 변하지 않음)
			2. j = (j++) 괄호안의 표현식만 수행된다. (변수에 저장하는 식은 이미 수행되어 1 증가된 값은 증발)
			하나의 표현식에서 같은 변수에 여러번 값을 할당하는 것은 바람직하지 않다.(읽기도 어렵다)
		 */
		public static int puzzle() {
			int j = 0;
			for (int i = 0; i < 100; i++) {
				j = j++;
			}
			return j;
		}

		public static int solution() {
			int j = 0;
			for (int i = 0; i < 100; i++) {
				j++;
			}
			return j;
		}

	}

}

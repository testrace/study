package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("InTheLoop")
class Puzzle26Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		var puzzle = Puzzle26.puzzle();
		assertThat(puzzle).isEqualTo(100);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		var solution = Puzzle26.solution();
		assertThat(solution).isEqualTo(100);
	}

	public static class Puzzle26 {

		static final int END = Integer.MAX_VALUE;
		static final int START = END - 100;

		/*
			반복문의 범위 조건이 '작거나 같다' 이다.

			int 타입은 MAX_VALUE 에서 +1 을 하게되면 MIN_VALUE 가 된다.
			그렇기에 i <= END 는 항상 true 상태가 되어 무한 루프가 된다.
		 */
		public static int puzzle() {
			int count = 0;
			for (int i = START; i <= END; i++) {
				count++;
			}
			return count;
		}

		/*
			반복문 안에서의 i 변수를 int 타입보다 큰 long 타입으로 변경하면 MIN_VALUE 로 돌아갈 일이 없다.
			하지만 long 타입의 반복 속도는 int 타입의 반복 속도보다 2배 정도 느린 것을 염두하여야 한다.
		 */
		public static int solution() {
			int count = 0;
			for (long i = START; i <= END; i++) {
				count++;
			}
			return count;
		}

	}

}

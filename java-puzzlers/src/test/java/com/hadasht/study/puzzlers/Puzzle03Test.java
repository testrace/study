package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.*;
import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("Long 자료형 나눗셈")
class Puzzle03Test {


	@Test
	@DisplayName(PUZZLE_NAME)
	void longDivision() throws Exception {
		long puzzle = Puzzle03.longDivision();
		assertThat(puzzle).isEqualTo(1000L);
	}

	@Test
	@DisplayName(ANSWER_NAME)
	void isOdd_Answer() throws Exception {
		long answer = Puzzle03.longDivision_Answer();
		assertThat(answer).isEqualTo(1000L);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void isOdd_Solution() throws Exception {
		long solution = Puzzle03.longDivision_Solution();
		assertThat(solution).isEqualTo(1000L);
	}


	public static class Puzzle03 {

		/**
		 * 타겟 타이핑
		 * <p>
		 * final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		 * <p>
		 * long = int * int 연산하는 경우 int 연산한 뒤 long 자료형으로 변환하여
		 * 오버플로우가 발생한다. ( Numeric overflow in expression )
		 * <p>
		 * 파이썬, 루비에서는 오버플로우가 발생되면 자동으로 형 변환을 한다.(타깃 타이핑)
		 * 자바는 개발자가 집적 해줘야한다.
		 */
		public static long longDivision() {
			final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
			final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
			return MICROS_PER_DAY / MILLIS_PER_DAY;
		}

		public static long longDivision_Answer() {
			final long MINUTE_PER_DAY = 24 * 60 * 60;
			final long MICROS_PER_DAY = MINUTE_PER_DAY * 1000 * 1000;
			final long MILLIS_PER_DAY = MINUTE_PER_DAY * 1000;
			return MICROS_PER_DAY / MILLIS_PER_DAY;
		}

		public static long longDivision_Solution() {
			final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
			final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
			return MICROS_PER_DAY / MILLIS_PER_DAY;
		}

	}


}

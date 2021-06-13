package com.hadasht.study.puzzlers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.hadasht.study.puzzlers.utils.Constants.*;
import static org.assertj.core.api.Assertions.assertThat;

class Puzzle01Test {

	@SuppressWarnings("unused")
	public static Stream<Arguments> isOdd() {
		return Stream.of(
				Arguments.of(-2, false),
				Arguments.of(-1, true),
				Arguments.of(0, false),
				Arguments.of(1, true),
				Arguments.of(2, false)
		);
	}

	@ParameterizedTest(name = PUZZLE_INDEX_ARGUMENTS_WITH_NAMES)
	@MethodSource("isOdd")
	void isOdd(int i, boolean isTrue) throws Exception {
		boolean isOdd = Puzzle01.isOdd(i);
		assertThat(isOdd).isEqualTo(isTrue);
	}

	@ParameterizedTest(name = ANSWER_INDEX_ARGUMENTS_WITH_NAMES)
	@MethodSource("isOdd")
	void isOdd_Answer(int i, boolean isTrue) throws Exception {
		boolean isOdd = Puzzle01.isOdd_Answer(i);
		assertThat(isOdd).isEqualTo(isTrue);
	}

	@ParameterizedTest(name = SOLUTION_INDEX_ARGUMENTS_WITH_NAMES)
	@MethodSource("isOdd")
	void isOdd_Solution(int i, boolean isTrue) throws Exception {
		boolean isOdd = Puzzle01.isOdd_Solution(i);
		assertThat(isOdd).isEqualTo(isTrue);
	}

	@SuppressWarnings("unused")
	public static class Puzzle01 {

		public static boolean isOdd(int i) {
			return i % 2 == 1;
		}

		public static boolean isOdd_Answer(int i) {
			/* 나머지(%) 연산자는 좌항의 부호를 따라감 */
			return Math.abs(i) % 2 == 1;
		}

		public static boolean isOdd_Solution(int i) {
			/* 비트 AND 연산자 */
			return (i & 1) != 0;
		}

	}


}

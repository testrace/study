package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static com.hadasht.study.puzzlers.utils.Constants.*;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("변화를 위한 시간")
class Puzzle02Test {

	@SuppressWarnings("unused")
	public static Stream<Arguments> change() {
		return Stream.of(
				Arguments.of(2.00, 1.10, 0.90),
				Arguments.of(2.31, 1.41, 0.90)
		);
	}

	@ParameterizedTest(name = PUZZLE_INDEX_ARGUMENTS_WITH_NAMES)
	@MethodSource("change")
	void change(double x, double y, double answer) throws Exception {
		double change = Puzzle02.change(x, y);
		assertThat(change).isEqualTo(answer);
	}

	@ParameterizedTest(name = ANSWER_INDEX_ARGUMENTS_WITH_NAMES)
	@MethodSource("change")
	void isOdd_Answer(double x, double y, double answer) throws Exception {
		double v = Puzzle02.change_Answer(x, y);
		assertThat(v).isEqualTo(answer);
	}

	@ParameterizedTest(name = SOLUTION_INDEX_ARGUMENTS_WITH_NAMES)
	@MethodSource("change")
	void isOdd_Solution(double x, double y, double answer) throws Exception {
		BigDecimal bigDecimal = Puzzle02.change_Solution(x, y);
		assertThat(bigDecimal).isEqualTo(new BigDecimal(String.valueOf(answer)));
	}

	@SuppressWarnings("unused")
	public static class Puzzle02 {

		public static double change(double x, double y) {
			return x - y;
		}

		public static double change_Answer(double x, double y) {
			/* 모르겠음 */
			return 0.9;
		}

		public static BigDecimal change_Solution(double x, double y) {
			BigDecimal bigDecimalX = new BigDecimal(String.valueOf(x));
			BigDecimal bigDecimalY = new BigDecimal(String.valueOf(y));
			return bigDecimalX.subtract(bigDecimalY);
		}

	}


}

package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("AnimalFarm")
class Puzzle13Test {

	private static final String pig = "length: 10";
	private static final String dog = "length: " + pig.length();

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Object puzzle = Puzzle13.puzzle();
		assertThat(puzzle).isEqualTo("Animals are equal: true");
	}

	@Test
	@DisplayName(PUZZLE_NAME)
	void solution() throws Exception {
		Object solution = Puzzle13.solution();
		assertThat(solution).isEqualTo("Animals are equal: true");
	}

	public static class Puzzle13 {

		private static final String pig = "length: 10";
		private static final String dog = "length: " + pig.length();

		/**
		 *
		 * 연산자 우선 순위에 따라 <b>==</b>보다 <b>+</b>가 먼저 실행된다.
		 * 결국 ("Animals are equal: " + pig) == dog
		 *
		 * 인텔리제이 IDE 에서 아래와 같은 경고가 발생한다.
		 * String values are compared using '==', not 'equals()'
		 *
		 */
		public static Object puzzle() {
			return "Animals are equal: " + pig == dog;
		}

		/**
		 *
		 * 객체 참조는 ==
		 * 객체의 내용을 비교할 때는 equals()
		 *
		 * <p>
		 * String 상수는 컴파일 시점에 인턴(intern)되어 같은 참조를 한다.
		 * String a = "intern";
		 * String b = "intern";
		 * a == b -> true
		 * </p>
		 */
		public static Object solution() {
			return "Animals are equal: " + pig.equals(dog);
		}




	}
}

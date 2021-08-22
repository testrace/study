package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("NullVoid")
class Puzzle54Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		((Null) null).greet();
	}

	/*
	인스턴스화 하지 않고도 메서드를 호출할 수 있다.
	정적 메서드를 호출 할 때 내부의 값은 전혀 의미가 없다.
	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		Null.greet();
	}

	static class Null {
		public static void greet() {
			System.out.println("Hello world!");
		}
	}

}

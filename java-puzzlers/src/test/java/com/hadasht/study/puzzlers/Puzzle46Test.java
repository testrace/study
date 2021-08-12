package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("Confusing")
class Puzzle46Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		new Confusing(null);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		new Confusing((Object)null);
	}

	/*
	자바는 오버로딩 메서드를 호출 할 때 가장 구체적인 형태의 메서드를 선택.
	컴파일러가 특정한 형태의 오버로딩 메서드를 호출하게 하고 싶다면 원하는 자료형으로 강제 변환해야 함
	 */
	class Confusing {

		public Confusing(Object o) {
			System.out.println("Object");
		}

		public Confusing(double[] dArray) {
			System.out.println("double array");
		}

	}

}

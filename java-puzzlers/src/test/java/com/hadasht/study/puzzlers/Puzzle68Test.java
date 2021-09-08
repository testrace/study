package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("ShadeOfGray")
class Puzzle68Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		assertThat(new ShadeOfGray().gray()).isEqualTo("White");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		assertThat(new ShadeOfGray().gray()).isEqualTo("White");
	}

	static class ShadeOfGray {
		public String gray() {
			return X.Y.Z;
		}
	}

	/*
	변수명와 클래스명이 같은경우(한 구문 안에서) 변수명을 우선적으로 사용한다.
	변수명이 클래스명을 모호화한다.
	 */
	static class X {
		static class Y {
			static String Z = "BLACK";
		}

		static C Y = new C();
	}

	static class C {
		String Z = "White";
	}

}

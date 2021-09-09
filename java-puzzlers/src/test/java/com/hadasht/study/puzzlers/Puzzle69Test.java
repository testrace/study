package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("FadeOfBlack")
class Puzzle69Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		assertThat(new FadeToBlack().black()).isEqualTo("BLACK");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		assertThat(new FadeToBlack().blackSolution()).isEqualTo("BLACK");
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

	class FadeToBlack {
		public String black() {
			return ((X.Y)null).Z;
		}

		/*
		상속을 이용해서 모호화된 클래스를 선택할 수 있다.
		 */
		class Xy extends X.Y {}

		public String blackSolution() {
			return Xy.Z;
		}

	}



}

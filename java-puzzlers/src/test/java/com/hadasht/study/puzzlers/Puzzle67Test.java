package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("StrungOut")
class Puzzle67Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
	}

	static class StrungOut {
		public static void main(String[] args) {
			String s = new String("Hello world");
			System.out.println("s = " + s);
		}
	}

	/*
	java.lang 패키지의 이름과 같은 이름의 클래스를 사용하는 것은 좋지 않다.
	JVM은 main메서드를 찾을 때 규칙이 있지만 아래 클래스를 만듦으로써 JVM이 main메서드를
	찾지 못하게 만드는 예이다.
	 */
	static class String {
		private final java.lang.String s;

		public String(java.lang.String s) {
			this.s = s;
		}

		@Override
		public java.lang.String toString() {
			return s;
		}
	}
}

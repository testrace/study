package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("LinePrinter")
class Puzzle16Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Puzzle16.puzzle();
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		Puzzle16.solution();

	}

	public static class Puzzle16 {

		/**
		 * 주석 중 u000A 유니코드가 먼저 변환되어 이후의 내용이 한 줄 아래로 내려가게 되어 컴파일 오류 발생함.
		 */
		public static void puzzle() {
			// Note : \\u000A is unicode representation of linefeed (LF)
			char c = 0x000A;
			System.out.println(c);
		}

		public static void solution() {
			char c = '\n';
			String cc = System.lineSeparator();

			System.out.println(c);
			System.out.println(cc);
		}




	}
}

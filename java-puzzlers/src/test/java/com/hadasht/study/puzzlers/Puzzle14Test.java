package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("EscapeRout")
class Puzzle14Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Object puzzle = Puzzle14.puzzle();
		assertThat(puzzle).isEqualTo(26);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		Object solution = Puzzle14.solution();
		assertThat(solution).isEqualTo(16);
	}

	public static class Puzzle14 {

		/**
		 * 유니코드 이스케이프 시퀀스
		 * 표기방식 = <b>\</b>u0000 ( 0000은 16진수 4자리 )
		 * <br/>
		 * 컴파일러는 프로그램을 파싱하기 전에 유니코드 부터 변환을 한다.
		 * <br/>
		 * 그래서 아래 문자열은 "a".length() + "b".length() 가 되어
		 * 결과값이 2이다.
		 *
		 */
		public static Object puzzle() {
			return "a\u0022.length() + \u0022b".length();
		}

		/**
		 *
		 * 문자 또는 문자열 내부에는 유니코드 이스케이프 시퀀스가 아닌
		 * 일반 이스케이프 시퀀스로 표현하면 된다.
		 * <br>
		 * 아스키 문자를 유니코드 이스케이프로 표현할 필요는 없다.
		 *
		 */
		public static Object solution() {
			return "a\".length() + \"b".length();
		}




	}
}

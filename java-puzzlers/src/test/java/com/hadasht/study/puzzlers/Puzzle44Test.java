package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Strange")
class Puzzle44Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		try {
			Missing m = new Missing();
		} catch (NoClassDefFoundError e) {
			System.out.println("Got it!");
		}
	}

	/*
	특정 클래스 유무를 검증하기 위해서는 일반 참조(생성자 호출 등)이 아닌 리플렉션을 활용.
	하지만, Error 클래스 또는 Error 클래스를 상속받는 에러를 별도 처리하려고 하지 말자.
	Error는 손쓸 수 없는 오류가 발생할 경우를 대비해서 만들어져 있는 것이다.
	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		try {
			Object m = Class.forName("Missing").newInstance();
		} catch (NoClassDefFoundError e) {
			System.out.println("Got it!");
		}
	}

	static class Missing {
		Missing(){}
	}
}

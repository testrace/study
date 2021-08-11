package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("Workout")
class Puzzle45Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		workHard();
		System.out.println("It's nap time.");
	}

	/*
	StackOverFlowError가 발생한다.
	코드만 보면 에러가 발생해야하지만, 실제로는 무한반복처럼 프로그램이 종료되지 않는다.
	이 프로그램이 에러가 발생해서 프로그램이 종료가 되려면 많은 시간이 필요하다
	스택의 크기를 1024로 제한 했을 때 호출은 (2^2015 - 1)회이고, 발생한 예외는 2^2014개이다.

	 */
	private void workHard() {
		try {
			workHard();
		} finally {
			workHard();
		}
	}

}

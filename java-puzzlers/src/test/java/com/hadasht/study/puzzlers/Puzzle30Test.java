package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("InfinityLoop")
class Puzzle30Test {

	/*
	무한 반복하는 반복문을 만들기 위해서는 i 변수를 어떻게 선언해야 할까
	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int i = 0;
		while ( i != i + 0) {
			System.out.println("i = " + i);
		}
	}


	/*
		+ 기호는 숫자의 덧셈으로도 쓰이지만, 문자열에 적용하면 연결 연산자로 사용된다.
		i 변수를 문자열로 선언하면 무한 반복 된다.
		변수 명이 i 이기 때문에 숫자라고 생각하기 쉽다.

		** 변수, 메소드, 클래스 명을 이해하기 쉽게 선언한다면 위와 같은 오해를 줄일 수 있다.

	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		String i = "this is string";
		while ( i != i + 0) {
			System.out.println("i = " + i);
		}
	}

}

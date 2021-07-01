package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("InfinityLoop")
class Puzzle31Test {

	/*
	무한 반복하는 반복문을 만들기 위해서는 i 변수를 어떻게 선언해야 할까
	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int i = 0;
		while ( i != 0) {
			i >>>= 1;
			System.out.println("i = " + i);
		}
	}


	/*
		시프트 연산자는 기본적으로 int 타입으로 변형한다.
		int 보다 작은 크기의 타입으로 시프트 연산을 하면 시프트 연산 수행 후 원래의 타입으로 돌아온다.
		이때 축소변환 되어 int 타입상태에서 시프트 연산한 값이 할당되지 않고 초기의 상태와 같아진다.

	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		byte i = -1;
		while ( i != 0) {
			i >>>= 1;
			System.out.println("i = " + i);
		}
	}

}

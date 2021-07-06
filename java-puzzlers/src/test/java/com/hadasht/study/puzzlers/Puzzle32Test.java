package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("InfinityLoop")
class Puzzle32Test {

	/*
	무한 반복하는 반복문을 만들기 위해서는 i 변수를 어떻게 선언해야 할까
	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int i = 0;
		int j = 0;
		while (i <= j && j<= i && i != j) {
			i >>>= 1;
			System.out.println("i = " + i);
		}
	}


	/*
		피 연산자가 박스 자료형(Byte, Short, Integer 등)일 때
		대소 비교 연산자(<, >)는 박싱된 숫자의 값을 비교
		동등 비교 연산자(==, !=)는 참조 비교

	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		Integer i = new Integer(0);
		Integer j = new Integer(0);
		while (i <= j && j<= i && i != j) {
			i >>>= 1;
			System.out.println("i = " + i);
		}
	}

}

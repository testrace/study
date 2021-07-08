package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("InfinityLoop")
class Puzzle33Test {

	/*
	무한 반복하는 반복문을 만들기 위해서는 i 변수를 어떻게 선언해야 할까
	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int i = 0;
		while (i == -i && i != 0) {
			i >>>= 1;
			System.out.println("i = " + i);
		}
	}


	/*
		int 타입을 나타낼 수 있는 숫자는 모두 2^32개이다 (짝수 개)
		0을 제외하면 홀수 개이다
		int 의 범위
			-2147483648
		     2147483647
		    그리고 0
		부호를 바꾸어도 바뀌지 않는 (바뀌었을 때 대응 되는 숫자가 없는) 것은 -2147483648
		즉, Integer.MIN_VALUE

	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		Integer i = Integer.MIN_VALUE;
		while (i == -i && i != 0) {
			i >>>= 1;
			System.out.println("i = " + i);
		}
	}

}

package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Thrown for a Loop")
class Puzzle42Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int[][] tests = {
				{6, 5, 4, 3, 2, 1},
				{1, 2},
				{1, 2, 3},
				{1, 2, 3, 4},
				{1}
		};
		int successCount = 0;

		try {
			int i = 0;
			while (true) {
				if (thirdElementIsThree(tests[i++])) {
					successCount++;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {

		}
		assertThat(successCount).isEqualTo(2);
	}

	/*
	try catch 블록은 예외를 처리하기 위해서만 사용하여야 한다.
	반복문을 제어하기 위한 try catch는 좋지 못하다.
	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		int[][] tests = {
				{6, 5, 4, 3, 2, 1},
				{1, 2},
				{1, 2, 3},
				{1, 2, 3, 4},
				{1}
		};
		int successCount = 0;

		for (int[] test : tests) {
			if (thirdElementIsThreeSolution(test)) {
				successCount++;
			}
		}

		assertThat(successCount).isEqualTo(2);
	}

	/*
	여기서 & 연산자는 비트 연산이 아닌 논리 연산을 하게 된다(피연산자가 boolean 타입)
	&& 연산자는 왼쪽 피연산자가 false로 확인되면 우측 피연산자를 확인하지 않지만,
	& 연산자는 왼쪽, 오른쪽 모두를 확인한다. 이때 ArrayIndexOutOfBoundsException 예외를 발생하게 된다.
	 */
	private static boolean thirdElementIsThree(int[] test) {
		return test.length >= 3 & test[2] == 3;
	}

	/*
	논리 연산을 위해서라면 당연히 && 연산자를 사용하면 된다.
	 */
	private static boolean thirdElementIsThreeSolution(int[] test) {
		return test.length >= 3 && test[2] == 3;
	}
}

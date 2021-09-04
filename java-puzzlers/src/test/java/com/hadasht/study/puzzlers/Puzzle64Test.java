package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Mod")
class Puzzle64Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		final int MODULUS = 3;
		int[] histogram = new int[MODULUS];

		int i = Integer.MIN_VALUE;
		do {
			histogram[Math.abs(i) % MODULUS]++;
		} while (i++ != Integer.MAX_VALUE);

		for (int j = 0; j < MODULUS; j++) {
			System.out.println("histogram[j] = " + histogram[j]);
		}

	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {

		final int MODULUS = 3;
		int[] histogram = new int[MODULUS];

		int i = Integer.MIN_VALUE;
		do {
			histogram[mod(MODULUS, i)]++;
		} while (i++ != Integer.MAX_VALUE);

		for (int j = 0; j < MODULUS; j++) {
			System.out.println("histogram[j] = " + histogram[j]);
		}

	}

	/*
	Math.abs() 는 Integer.MIN_VALUE 가 들어오게 되면 양수로 치환하지 않고 음수 그대로 리턴한다.

	 */
	private int mod(int modulus, int i) {
		int result = i % modulus;
		return result < 0 ? result + modulus : result;
	}

}

package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Differences")
class Puzzle59Test {

	/*
	자바는 0으로 시작하는 정수를 8진수로 해석한다.
	012(8) = 10(10)
	diffs의 사이즈가 배열의 길이와 동일해야하지만 012를 8진수로 해석하여 계산하기에
	예상하지 않은 뺄셈 결과가 diffs에 저장된다.
	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int[] vals = { 789, 678, 567, 456, 345, 234, 123, 012};
		Set<Integer> diffs = new HashSet<>();

		for (int i = 0; i < vals.length; i++) {
			for (int j = i; j < vals.length; j++) {
				diffs.add(vals[i] - vals[j]);
			}
		}

		assertThat(diffs).hasSize(8);

	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		int[] vals = { 789, 678, 567, 456, 345, 234, 123, 12};
		Set<Integer> diffs = new HashSet<>();

		for (int i = 0; i < vals.length; i++) {
			for (int j = i; j < vals.length; j++) {
				diffs.add(vals[i] - vals[j]);
			}
		}

		assertThat(diffs).hasSize(8);
	}

}

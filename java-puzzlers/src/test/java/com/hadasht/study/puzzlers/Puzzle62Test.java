package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Map;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("NameGame")
class Puzzle62Test {

	/*
	IdentityHashMap은 키를 비교할때 값이 아닌 레퍼런스를 비교.

	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Map<String, String> m = new IdentityHashMap<>();
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
		assertThat(m).hasSize(1);

	}

	/*
	레퍼런스 기반의 키 비교를 위해서는 IdentityHashMap를 사용
	레퍼런스 기반의 키 비교가 아닌 경우에는 IdentityHashMap를 사용하지 말 것
	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		Map<String, String> m = new IdentityHashMap<>();
		m.put(new String("Mickey"), "Mouse");
		m.put(new String("Mickey"), "Mantle");
		assertThat(m).hasSize(2);
	}

}

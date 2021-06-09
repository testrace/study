package com.hadasht.study.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringTest {

	@Test
	void substring() {
		//given
		String str = "a1b2c3d4";

		//when
		String expect = "b2";
		String actual = str.substring(2, 4);

		//then
		assertEquals(expect, actual);
	}

}

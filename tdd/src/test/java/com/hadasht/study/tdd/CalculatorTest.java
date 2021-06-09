package com.hadasht.study.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

	@Test
	void plus1and2() throws Exception {
		//given
		int result = Calculator.plus(1, 2);

		//when
		int expected = 3;

		//then
		assertEquals(expected, result);
	}

	@Test
	void plus1and3() throws Exception {
		//given
		int result = Calculator.plus(1, 3);

		//when
		int expected = 4;

		//then
		assertEquals(expected, result);
	}

}

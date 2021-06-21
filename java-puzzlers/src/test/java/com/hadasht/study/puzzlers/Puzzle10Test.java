package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Tweedledee")
class Puzzle10Test {


	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Object x = "Buy ";
		String i = "Effective Java";
		x = x + i;
		assertThat(x).isEqualTo("Buy Effective Java");
	}

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle2() throws Exception {
		Object x = "Buy ";
		String i = "Effective Java";
		x += i;
		assertThat(x).isEqualTo("Buy Effective Java");

	}

}

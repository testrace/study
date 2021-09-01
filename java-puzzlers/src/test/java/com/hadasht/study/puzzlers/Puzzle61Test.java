package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Calendar")
class Puzzle61Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, 12, 31);
		String actual = cal.get(Calendar.YEAR) + " ";

		Date d = cal.getTime();
		actual += d.getDay();

		assertThat(actual).isEqualTo("1999 31");

	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, Calendar.DECEMBER, 31);
		String actual = cal.get(Calendar.YEAR) + " ";

		actual += cal.get(Calendar.DAY_OF_MONTH);

		assertThat(actual).isEqualTo("1999 31");
	}

}

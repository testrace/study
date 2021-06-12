package com.hadasht.study.tdd.password;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthMeterTest {

	private final PasswordStrengthMeter passwordStrengthMeter = new PasswordStrengthMeter();

	private void assertStrength(String s, PasswordStrength strong) {
		//when
		PasswordStrength passwordStrength = passwordStrengthMeter.meter(s);

		//then
		assertEquals(strong, passwordStrength);
	}

	@Test
	@DisplayName("모두일치하는경우")
	void all_match_then_strong() throws Exception {
		assertStrength("123qwe!@#QWE", PasswordStrength.STRONG);
		assertStrength("abcABC123!!!", PasswordStrength.STRONG);
	}



	@Test
	@DisplayName("길이가 8자리 이하인 경우")
	void length_under_8_then_normal() throws Exception {
		assertStrength("12qw!@", PasswordStrength.NORMAL);
		assertStrength("s83B%!", PasswordStrength.NORMAL);
	}

	@Test
	@DisplayName("길이가 8자리 이상, 숫자가 없는 경우")
	void length_over_8_an_has_no_number_then_NORMAL() throws Exception {
		assertStrength("abcABC!@#", PasswordStrength.NORMAL);
	}

	@Test
	@DisplayName("널 경우")
	void invalid_if_null() throws Exception {
		assertStrength(null, PasswordStrength.INVALID);
	}

	@Test
	@DisplayName("값이 비어있는 경우")
	void invalid_if_empty() throws Exception {
		assertStrength("", PasswordStrength.INVALID);
	}

	@Test
	@DisplayName("대문자가 없는 경우")
	void hasNoUppercaseThenNORMAL() throws Exception {
		assertStrength("123qwe!@#", PasswordStrength.NORMAL);
	}


	@Test
	@DisplayName("길이만 8자 이상인 경우")
	void meetsOnlyLengthOver8ThenWEAK() throws Exception {
		assertStrength("abcdefghijklmnop", PasswordStrength.WEAK);
	}




}
package com.hadasht.study.tdd.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthMeterTest {

	private PasswordStrengthMeter passwordStrengthMeter = new PasswordStrengthMeter();

	private void assertStrength(String s, PasswordStrength strong) {
		//when
		PasswordStrength passwordStrength = passwordStrengthMeter.meter(s);

		//then
		assertEquals(strong, passwordStrength);
	}

	@Test
	void 모든조건을_충족하면_STRONG() throws Exception {
		assertStrength("123qwe!@#", PasswordStrength.STRONG);
		assertStrength("abcABC123!!!", PasswordStrength.STRONG);
	}



	@Test
	void 길이가8자리_미만이면_NORMAL() throws Exception {
		assertStrength("12qw!@", PasswordStrength.NORMAL);
		assertStrength("s83B%!", PasswordStrength.NORMAL);
	}

	@Test
	void 숫자없이_8자리_이상이면_NORMAL() throws Exception {
		assertStrength("abcABC!@#", PasswordStrength.NORMAL);
	}
}
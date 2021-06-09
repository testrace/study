package com.hadasht.study.tdd.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthMeterTest {

	private PasswordStrengthMeter passwordStrengthMeter = new PasswordStrengthMeter();

	@Test
	void 모든조건을_충족하면_STRONG() throws Exception {
		//given

		//when
		PasswordStrength passwordStrength = passwordStrengthMeter.meter("123qwe!@#");
		PasswordStrength passwordStrength2 = passwordStrengthMeter.meter("abcABC123!!!");

		//then
		assertEquals(PasswordStrength.STRONG, passwordStrength);
		assertEquals(PasswordStrength.STRONG, passwordStrength2);

	}

	@Test
	void 길이가8자리_미만이면_NORMAL() throws Exception {
		//given

		//when
		PasswordStrength passwordStrength = passwordStrengthMeter.meter("12qw!@");
		PasswordStrength passwordStrength2 = passwordStrengthMeter.meter("s83B%!");

		//then
		assertEquals(PasswordStrength.NORMAL, passwordStrength);
		assertEquals(PasswordStrength.NORMAL, passwordStrength2);

	}

	@Test
	void 숫자없이_8자리_이상이면_NORMAL() throws Exception {
		//given


		//when
		PasswordStrength passwordStrength = passwordStrengthMeter.meter("abcABC!@#");

		//then
		assertEquals(PasswordStrength.NORMAL, passwordStrength);


	}
}
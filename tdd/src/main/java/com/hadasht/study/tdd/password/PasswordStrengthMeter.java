package com.hadasht.study.tdd.password;

public class PasswordStrengthMeter {

	public PasswordStrength meter(String s) {
		if (s == null || s.isEmpty()) {
			return PasswordStrength.INVALID;
		}

		if (s.length() < 8) {
			return PasswordStrength.NORMAL;
		}

		boolean containsNumber = isContainsNumber(s);
		if (!containsNumber) {
			return PasswordStrength.NORMAL;
		}

		boolean containsUppercase = isContainsUppercase(s);
		if (!containsUppercase) {
			return PasswordStrength.NORMAL;
		}

		return PasswordStrength.STRONG;
	}

	private boolean isContainsUppercase(String s) {
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) {
				return true;
			}
		}
		return false;
	}

	private boolean isContainsNumber(String s) {
		for (char c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				return true;
			}
		}
		return false;
	}

}

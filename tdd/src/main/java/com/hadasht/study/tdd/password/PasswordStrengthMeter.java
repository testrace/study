package com.hadasht.study.tdd.password;

public class PasswordStrengthMeter {

	public PasswordStrength meter(String s) {
		if (s == null || s.isEmpty()) {
			return PasswordStrength.INVALID;
		}

		boolean lengthEnough = s.length() >= 8;
		boolean containsNumber = isContainsNumber(s);
		boolean containsUppercase = isContainsUppercase(s);

		if (lengthEnough && !containsNumber && !containsUppercase) {
			return PasswordStrength.WEAK;
		}
		if (!lengthEnough && containsNumber && !containsUppercase) {
			return PasswordStrength.WEAK;
		}
		if (!lengthEnough && !containsNumber && containsUppercase) {
			return PasswordStrength.WEAK;
		}

		if (!lengthEnough) {
			return PasswordStrength.NORMAL;
		}

		if (!containsNumber) {
			return PasswordStrength.NORMAL;
		}

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

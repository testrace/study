package com.hadasht.study.tdd.password;

public class PasswordStrengthMeter {

	public PasswordStrength meter(String s) {
		if (s == null || s.isEmpty()) {
			return PasswordStrength.INVALID;
		}

		var metCounts = 0;

		if (s.length() >= 8) {
			metCounts++;
		}
		if (isContainsNumber(s)) {
			metCounts++;
		}
		if (isContainsUppercase(s)) {
			metCounts++;
		}

		switch (metCounts) {
			case 1:
				return PasswordStrength.WEAK;
			case 2:
				return PasswordStrength.NORMAL;
			default:
				return PasswordStrength.STRONG;
		}

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

package com.hadasht.study.tdd.password;

public class PasswordStrengthMeter {

	public PasswordStrength meter(String s) {
		if (s == null || s.isEmpty()) {
			return PasswordStrength.INVALID;
		}

		int metCounts = getMetCounts(s);

		switch (metCounts) {
			case 0:
			case 1:
				return PasswordStrength.WEAK;
			case 2:
				return PasswordStrength.NORMAL;
			default:
				return PasswordStrength.STRONG;
		}

	}

	private int getMetCounts(String s) {
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
		return metCounts;
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

package com.hadasht.study.tdd.user;

public class UserRegister {

	private WeakPasswordChecker weakPasswordChecker;

	private String id;
	private String pw;
	private String email;

	public UserRegister(WeakPasswordChecker weakPasswordChecker) {
		this.weakPasswordChecker = weakPasswordChecker;
	}

	public void register(String id, String pw, String email) {
		throw new WeakPasswordException();
	}

}

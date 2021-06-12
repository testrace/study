package com.hadasht.study.tdd.user;

public class SpyEmailNotifier implements EmailNotifier {

	private String email;
	private boolean called;

	@Override
	public boolean isCalled() {
		return called;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void sendRegisterEmail(String email) {
		this.email = email;
		this.called = true;
	}

}

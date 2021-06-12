package com.hadasht.study.tdd.user;

public interface EmailNotifier {

	boolean isCalled();

	String getEmail();

	void sendRegisterEmail(String email);

}

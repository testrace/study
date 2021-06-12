package com.hadasht.study.tdd.user;

import lombok.Getter;

@Getter
public class User {

	private String id;
	private String pw;
	private String email;

	public User(String id, String pw, String email) {
		this.id = id;
		this.pw = pw;
		this.email = email;
	}

}

package com.hadasht.study.tdd.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegisterTest {

	private UserRegister userRegister;
	private final StubWeakPasswordChecker stubWeakPasswordChecker = new StubWeakPasswordChecker();

	@BeforeEach
	void setUp() {
		userRegister = new UserRegister(stubWeakPasswordChecker);
	}

	@Test
	@DisplayName("암호의 강도가 낮으면 가입 실패")
	void weakPassword() throws Exception {
		//given
		stubWeakPasswordChecker.setWeak(true);

		//when


		//then
		assertThrows(WeakPasswordException.class, () -> {
			userRegister.register("id", "pw", "email");
		});

	}


}
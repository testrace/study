package com.hadasht.study.tdd.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

class UserRegisterMockTest {

	private UserRegister userRegister;
	private final WeakPasswordChecker mockWeakPasswordChecker = Mockito.mock(WeakPasswordChecker.class);
	private final FakeUserRepository fakeUserRepository = new FakeUserRepository();
	private EmailNotifier mockEmailNotifier = Mockito.mock(EmailNotifier.class);

	@BeforeEach
	void setUp() {
		userRegister = new UserRegister(mockWeakPasswordChecker, fakeUserRepository, mockEmailNotifier);
	}

	@Test
	@DisplayName("암호의 강도가 낮으면 가입 실패")
	void weakPassword() throws Exception {
		//given
		given(mockWeakPasswordChecker.checkPasswordWeak("pw")).willReturn(true);

		//when

		//then
		assertThrows(WeakPasswordException.class, () -> userRegister.register("id", "pw", "email"));

	}


	@Test
	@DisplayName("회원가입시 암호검사 수행")
	void checkPassword() throws Exception {
		//given
		userRegister.register("id", "pw", "email");

		//when

		//then
		then(mockWeakPasswordChecker).should()
		                             .checkPasswordWeak("pw");

	}

	@Test
	@DisplayName("회원가입시 이메일 전송")
	void whenRegisterThenSendMail() throws Exception {
		//given
		userRegister.register("id", "pw", "email");

		//when
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		then(mockEmailNotifier)
				.should()
				.sendRegisterEmail(captor.capture());

		//then
		assertEquals("email", captor.getValue());
	}

}
package com.hadasht.study.tdd.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegisterTest {

	private UserRegister userRegister;
	private final StubWeakPasswordChecker stubWeakPasswordChecker = new StubWeakPasswordChecker();
	private final FakeUserRepository fakeUserRepository = new FakeUserRepository();

	@BeforeEach
	void setUp() {
		userRegister = new UserRegister(stubWeakPasswordChecker, fakeUserRepository);
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

	@Test
	@DisplayName("같은 ID가 존재하면 가입 실패")
	void dupIdExists() throws Exception {
		//given
		fakeUserRepository.save(new User("id", "pw", "abc@email.com"));

		//then
		assertThrows(DupIdException.class, () -> {
			userRegister.register("id", "pw", "email");
		});

	}

	@Test
	@DisplayName("같은 ID가 존재하지 않으면 가입 성공")
	void dupIdNotExists() throws Exception {
		//given
		fakeUserRepository.save(new User("id", "pw", "abc@email.com"));

		//then
		User user = fakeUserRepository.findOne("id");
		assertNotNull(user);
		assertEquals("id", user.getId());
		assertEquals("pw", user.getPw());

	}


}
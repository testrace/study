package com.hadasht.study.tdd.autodebit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AutoDebitRegisterTest {

	private AutoDebitRegister register;
	private StubCardNumberValidator stubValidator;
	private StubAutoDebitInfoRepository stubRepository;

	@BeforeEach
	void setUp() {
		stubValidator = new StubCardNumberValidator();
		stubRepository = new StubAutoDebitInfoRepository();
		register = new AutoDebitRegister(stubValidator, stubRepository);
	}

	@Test
	void validCard() throws Exception {
		//given
		stubValidator.setInvalidNo("123123123");

		//when
		AutoDebitReq req = new AutoDebitReq("user1", "123123123");
		RegisterResult result = this.register.register(req);

		//then
		assertEquals(CardValidity.INVALID, result.getValidity());
	}

	@Test
	void theftCard() throws Exception {
		//given
		stubValidator.setTheftNo("890890890");

		//when
		AutoDebitReq req = new AutoDebitReq("user1", "890890890");
		RegisterResult result = this.register.register(req);

		//then
		assertEquals(CardValidity.THEFT, result.getValidity());
	}

	@Test
	void alreadyRegistered_InfoUpdated() throws Exception {
		//given
		stubRepository.save(new AutoDebitInfo("user1", "1223344", LocalDateTime.now()));

		//when
		AutoDebitReq req = new AutoDebitReq("user1", "123123123");
		RegisterResult result = this.register.register(req);

		//then
		AutoDebitInfo user1 = stubRepository.findOne("user1");
		assertEquals("123123123", user1.getCardNumber());
	}

}
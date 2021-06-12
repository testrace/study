package com.hadasht.study.tdd.subscription;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 요구사항
 * 구독시스템
 * 1. 구독료는 매달 1만원 선불이며 납부일 기준 한 달 뒤 서비스 만료일이 된다.
 * 2. 2개월 이상 납부할 수 있다.
 * 3. 10만 원을 납부하면 서비스를 1년 제공한다.
 */
class ExpiryDateCalculatorTest {

	private final ExpiryDateCalculator calculator = new ExpiryDateCalculator();

	private void assertExpiryDate(LocalDate billingDate, int payAmount, LocalDate expected) {
		//when
		LocalDate expiryDate = calculator.calculateExpiryDate(billingDate, payAmount);

		//then
		assertEquals(expected, expiryDate);
	}

	@Test
	@DisplayName("만원 납부")
	void pay10000won() throws Exception {
		//given
		int payAmount = 10_000;

		//then
		assertExpiryDate(
				LocalDate.of(2021, 1, 1), payAmount,
				LocalDate.of(2021, 2, 1));
		assertExpiryDate(
				LocalDate.of(2021, 2, 1), payAmount,
				LocalDate.of(2021,3,1));

	}
}
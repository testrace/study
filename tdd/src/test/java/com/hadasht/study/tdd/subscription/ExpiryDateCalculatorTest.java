package com.hadasht.study.tdd.subscription;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 요구사항
 * 구독시스템
 * 1. 구독료는 매달 1만원 선불이며 납부일 기준 한 달 뒤 서비스 만료일이 된다.
 * 2. 2개월 이상 납부할 수 있다.
 * 3. 10만 원을 납부하면 서비스를 1년 제공한다.
 */
class ExpiryDateCalculatorTest {

	private final ExpiryDateCalculator calculator = new ExpiryDateCalculator();

	private void assertExpiryDate(PayData payData, LocalDate expected) {

		//when
		LocalDate expiryDate = calculator.calculateExpiryDate(payData);

		//then
		assertEquals(expected, expiryDate);
	}

	@Test
	@DisplayName("만원 납부")
	void pay10000won() throws Exception {
		//given
		PayData payData = PayData.builder()
		                         .billingDate(LocalDate.of(2021, 1, 1))
		                         .payAmount(10_000)
		                         .build();
		PayData payData2 = PayData.builder()
		                         .billingDate(LocalDate.of(2021, 2, 1))
		                         .payAmount(10_000)
		                         .build();


		//then
		assertExpiryDate(payData, LocalDate.of(2021, 2, 1));
		assertExpiryDate(payData2, LocalDate.of(2021, 3, 1));

	}

	@Test
	@DisplayName("납부일과 한달 뒤 일자가 같지 않음")
	void pay10000wonExpiryDate() throws Exception {
		//given
		PayData payData1 = PayData.builder()
		                          .billingDate(LocalDate.of(2019, 1, 31))
		                          .payAmount(10_000)
		                          .build();
		PayData payData2 = PayData.builder()
		                          .billingDate(LocalDate.of(2019, 5, 31))
		                          .payAmount(10_000)
		                          .build();
		PayData payData3 = PayData.builder()
		                          .billingDate(LocalDate.of(2020, 1, 31))
		                          .payAmount(10_000)
		                          .build();
		//then
		assertExpiryDate(payData1, LocalDate.of(2019, 2, 28));
		assertExpiryDate(payData2, LocalDate.of(2019, 6, 30));
		assertExpiryDate(payData3, LocalDate.of(2020, 2, 29));

	}


	@Test
	@DisplayName("첫 납부일과 만료 일자가 다른 경우 만 원 납부")
	void payAfterPay() throws Exception {
		//given
		PayData payData = PayData.builder()
		                          .firstBillingDate(LocalDate.of(2019, 1, 31))
		                          .billingDate(LocalDate.of(2019, 2, 28))
		                          .payAmount(10_000)
		                          .build();
		//then
		assertExpiryDate(payData, LocalDate.of(2019, 3, 31));

		//given
		PayData payData2 = PayData.builder()
		                         .firstBillingDate(LocalDate.of(2019, 1, 30))
		                         .billingDate(LocalDate.of(2019, 2, 28))
		                         .payAmount(10_000)
		                         .build();
		//then
		assertExpiryDate(payData2, LocalDate.of(2019, 3, 30));


		//given
		PayData payData3 = PayData.builder()
		                          .firstBillingDate(LocalDate.of(2019, 5, 31))
		                          .billingDate(LocalDate.of(2019, 6, 30))
		                          .payAmount(10_000)
		                          .build();
		//then
		assertExpiryDate(payData3, LocalDate.of(2019, 7, 31));
	}


	@Test
	@DisplayName("2만원 이상 납부")
	void pay10000wonOver() throws Exception {
		//given
		PayData payData = PayData.builder()
		                         .billingDate(LocalDate.of(2021, 1, 1))
		                         .payAmount(20_000)
		                         .build();
		PayData payData2 = PayData.builder()
		                          .billingDate(LocalDate.of(2021, 2, 1))
		                          .payAmount(30_000)
		                          .build();


		//then
		assertExpiryDate(payData, LocalDate.of(2021, 3, 1));
		assertExpiryDate(payData2, LocalDate.of(2021, 5, 1));

	}

	@Test
	@DisplayName("만료 일자가 다른 경우 2만원 이상 납부")
	void pay10000wonOverButDifferentDayOfMonth() throws Exception {
		//given
		PayData payData = PayData.builder()
		                         .firstBillingDate(LocalDate.of(2019, 1, 31))
		                         .billingDate(LocalDate.of(2019, 2, 28))
		                         .payAmount(20_000)
		                         .build();


		//then
		assertExpiryDate(payData, LocalDate.of(2019, 4, 30));

	}
}
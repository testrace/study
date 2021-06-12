package com.hadasht.study.tdd.subscription;

import java.time.LocalDate;

public class ExpiryDateCalculator {

	public LocalDate calculateExpiryDate(PayData payData) {
		return payData.getBillingDate().plusMonths(1L);
	}

}

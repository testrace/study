package com.hadasht.study.tdd.subscription;

import java.time.LocalDate;

public class ExpiryDateCalculator {

	public LocalDate calculateExpiryDate(LocalDate billingDate, int payAmount) {
		return billingDate.plusMonths(1L);
	}

}

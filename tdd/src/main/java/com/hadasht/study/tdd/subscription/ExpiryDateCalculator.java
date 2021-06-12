package com.hadasht.study.tdd.subscription;

import java.time.LocalDate;

public class ExpiryDateCalculator {

	public LocalDate calculateExpiryDate(PayData payData) {
		var monthsToAdd = payData.getPayAmount() / 10_000;
		if (payData.getFirstBillingDate() != null) {
			LocalDate candidateExp = payData.getBillingDate().plusMonths(monthsToAdd);
			if (payData.getFirstBillingDate().getDayOfMonth() != candidateExp.getDayOfMonth()) {
				return candidateExp.withDayOfMonth(payData.getFirstBillingDate().getDayOfMonth());
			}
		}

		return payData.getBillingDate().plusMonths(monthsToAdd);
	}

}

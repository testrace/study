package com.hadasht.study.tdd.subscription;

import java.time.LocalDate;
import java.time.YearMonth;

public class ExpiryDateCalculator {

	public LocalDate calculateExpiryDate(PayData payData) {
		var monthsToAdd = payData.getPayAmount() / 10_000;
		if (payData.getFirstBillingDate() != null) {
			return expiryDateUsingFistBillingDate(payData, monthsToAdd);
		} else {
			return payData.getBillingDate().plusMonths(monthsToAdd);
		}

	}

	private LocalDate expiryDateUsingFistBillingDate(PayData payData, int monthsToAdd) {
		LocalDate candidateExp = payData.getBillingDate().plusMonths(monthsToAdd);

		if (isSameDayOfMonth(candidateExp, payData.getFirstBillingDate())) {
			return lastDayOfMonth(candidateExp, payData.getFirstBillingDate());
		} else {
			return candidateExp;
		}
	}

	private LocalDate lastDayOfMonth(LocalDate candidateExp, LocalDate firstBilling) {
		int dayLengthOfCandiMon = YearMonth.from(candidateExp).lengthOfMonth();
		return candidateExp.withDayOfMonth(Math.min(dayLengthOfCandiMon, firstBilling.getDayOfMonth()));

	}

	private boolean isSameDayOfMonth(LocalDate candidateExp, LocalDate firstBilling) {
		return firstBilling.getDayOfMonth() != candidateExp.getDayOfMonth();
	}

}

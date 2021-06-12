package com.hadasht.study.tdd.autodebit;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AutoDebitInfo {

	private final String userId;
	private String cardNumber;
	private final LocalDateTime dt;

	public AutoDebitInfo(String userId, String cardNumber, LocalDateTime now) {
		this.userId = userId;
		this.cardNumber = cardNumber;
		this.dt = now;
	}

	public void changeCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

}

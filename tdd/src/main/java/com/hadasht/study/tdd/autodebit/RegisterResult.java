package com.hadasht.study.tdd.autodebit;

public class RegisterResult {

	private CardValidity validity;

	public RegisterResult(CardValidity validity) {
		this.validity = validity;
	}

	public static RegisterResult error(CardValidity validity) {
		return new RegisterResult(validity);
	}

	public static RegisterResult success() {
		return new RegisterResult(CardValidity.VALID);
	}

	public CardValidity getValidity() {
		return validity;
	}

}

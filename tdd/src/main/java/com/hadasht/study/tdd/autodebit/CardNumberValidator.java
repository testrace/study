package com.hadasht.study.tdd.autodebit;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CardNumberValidator {

	public CardValidity validate(String cardNumber) {
		var httpClient = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("Https://card-number-valid.com"))
				.header("Content-type", "text/plain")
				.POST(HttpRequest.BodyPublishers.ofString(cardNumber))
				.build();

		try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			switch (response.body()) {
				case "ok" : return CardValidity.VALID;
				case "bad" : return CardValidity.INVALID;
				case "expired" : return CardValidity.EXPIRED;
				case "theft" : return CardValidity.THEFT;
				default: return CardValidity.UNKNOWN;
			}
		} catch (IOException | InterruptedException e) {
			Thread.currentThread().interrupt();
			return CardValidity.ERROR;
		}
	}
}

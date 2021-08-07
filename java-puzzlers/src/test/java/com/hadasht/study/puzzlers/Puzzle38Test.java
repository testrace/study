package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

@DisplayName("UnwelcomeGuest")
class Puzzle38Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		UnwelcomeGuest unwelcomeGuest = new UnwelcomeGuest();
		long message = unwelcomeGuest.getUserId();

		assertThat(message).isNotZero();

	}

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle3() throws Exception {
		UnwelcomeGuest unwelcomeGuest = new UnwelcomeGuest();
		long message = unwelcomeGuest.getUserId();

		assertThat(message).isNotZero();
	}

	static class UnwelcomeGuest {

		private static final long GUEST_USER_ID = -1;
		private static final long USER_ID = getUserIdOrGuest();
		private static long getUserIdOrGuest() {
			try {
				return getUserIdFromEnvironment();
			} catch (IdUnavailableException e) {
				System.out.println("Logging in as guest");
				return GUEST_USER_ID;
			}
		}

		public static long getUserId() {
			return USER_ID;
		}

		private static long getUserIdFromEnvironment() throws IdUnavailableException {
			throw new IdUnavailableException();
		}

	}

	static class IdUnavailableException extends Exception {
		IdUnavailableException(){

		}
	}

}

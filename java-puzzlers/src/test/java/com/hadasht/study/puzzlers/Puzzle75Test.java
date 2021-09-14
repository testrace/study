package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("CoinSide")
class Puzzle75Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
	}

	static class CoinSide {
		private static Random rnd = new Random();

		public static CoinSide flip() {
			return rnd.nextBoolean() ? Heads.INSTANCE : Tails.INSTANCE;
		}

	}

	static class Heads extends CoinSide {
		private Heads() {}
		public static final Heads INSTANCE = new Heads();

		@Override
		public String toString() {
			return "heads";
		}

	}
	static class Tails extends CoinSide {
		private Tails() {}
		public static final Tails INSTANCE = new Tails();

		@Override
		public String toString() {
			return "tails";
		}
	}


	/*
	가능한한 최신버전의 자바를 사용하자.
	버전별 특성도 이해하면 더욱 좋다.
	 */
	enum CoinSideSolution {
		HEADS, TAILS;
		private static Random rnd = new Random();

		public static CoinSide flip() {
			return rnd.nextBoolean() ? Heads.INSTANCE : Tails.INSTANCE;
		}

		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}


}

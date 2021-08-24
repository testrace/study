package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("BigProblem")
class Puzzle56Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		assertThat(BigProblem.total()).isEqualTo("555000");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		assertThat(BigProblemSolution.total()).isEqualTo("555000");
	}

	static class BigProblem {

		public static BigInteger total() {
			BigInteger fiveThousand = new BigInteger("5000");
			BigInteger fiftyThousand = new BigInteger("50000");
			BigInteger fiveHundredThousand = new BigInteger("500000");

			BigInteger total = BigInteger.ZERO;
			total.add(fiveThousand);
			total.add(fiftyThousand);
			total.add(fiveHundredThousand);

			return total;
		}

	}


	/*
	BigInteger 클래스의 인스턴스는 불변이다.
	add() 메서드는 내부의 상태를 변화시키지 않고 새로운 인스턴스를 반환한다.

	 */
	static class BigProblemSolution {

		public static BigInteger total() {
			BigInteger fiveThousand = new BigInteger("5000");
			BigInteger fiftyThousand = new BigInteger("50000");
			BigInteger fiveHundredThousand = new BigInteger("500000");

			BigInteger total = BigInteger.ZERO;
			total = total.add(fiveThousand);
			total = total.add(fiftyThousand);
			total = total.add(fiveHundredThousand);

			return total;
		}

	}


}

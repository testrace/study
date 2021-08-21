package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Cache")
class Puzzle52Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int actual = Cache.getSum();
		assertThat(actual).isEqualTo(4950);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		int sum = CacheSolution.getSum();
		assertThat(sum).isEqualTo(4950);
	}

	/*
	static 블록(Eager)과, 지연(Lazy) 초기화를 한번에 사용하는 것은 좋지 않다.
	API 사용자는 초기화 로직을 다 알지 못한다.
	 */
	static class Cache {
		static {
			//아래의 initialized 변수가 초기화 되기 전에 실행된다.
			//변수가 초기화 되기 전이니 sum은 이미 계산을 완료한다.
			initializeIfNecessary();
		}

		private static int sum;
		public static int getSum() {
			//sum에 계산이 된 상태에서 또 호출한다.
			//그러면 값은 두배가 된다
			initializeIfNecessary();
			return sum;
		}

		private static boolean initialized = false;
		private static synchronized void initializeIfNecessary() {
			if (!initialized) {
				for (int i = 0; i < 100; i++) {
					sum += i;
				}
				initialized = true;
			}
		}

	}

	/*
	static 블록 보다는 헬퍼 메서드를 사용하는 것이 가독성 측면에서는 도움이 될 수도 있다.	 */
	static class CacheSolution {
		public static final int sum = computeSum();

		public static int computeSum() {
			int result = 0;
			for (int i = 0; i < 100; i++) {
				result += i;
			}
			return result;
		}

		public static int getSum() {
			return sum;
		}
	}

}

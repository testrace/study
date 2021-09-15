package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("PingPong")
class Puzzle76Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		assertThat(PingPong.main(null)).startsWith("Ping");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		assertThat(PingPongSolution.main(null)).startsWith("Ping");
	}

	static class PingPong {
		public static synchronized String main(String[] args) {
			final String[] result = {""};
			Thread t = new Thread() {
				@Override
				public void run() {
					result[0] += pong();
				}
			};
			t.run();
			return result[0] += "Ping";
		}

		static synchronized String pong() {
			return "Pong";
		}
	}

	/*
	메인스레드가 PingPong.class의 락을 획득하고 반환한 이후에 두번째 스레드가 락을 획득한다.
	하지만 두번째 스레드는 생성은 되었지만 시작하지 않았기때문에 run() 메소드를 동기적으로 실행하고 끝냈다.

	스레드를 시작할때는 start()를 사용하자.

	 */
	static class PingPongSolution {
		public static synchronized String main(String[] args) {
			final String[] result = {""};
			Thread t = new Thread() {
				@Override
				public void run() {
					result[0] += pong();
				}
			};
			t.start();
			return result[0] += "Ping";
		}

		static synchronized String pong() {
			return "Pong";
		}
	}


}

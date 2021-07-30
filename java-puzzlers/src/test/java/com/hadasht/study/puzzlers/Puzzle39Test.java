package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("HelloGoodbye")
class Puzzle39Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		HelloGoodbye.getMessage();

	}

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle3() throws Exception {
		HelloGoodbye.getMessageSolution();
	}

	static class HelloGoodbye {

		/*
		finally 는 try 가 정상적으로 끝나야 실행되는데, System.exit는 현재 thread와 관련된 모든 thread를 종료하기 때문에
		finally는 실행되지 않는다.
		 */
		public static void getMessage() {
			try {
				System.out.println("Hello");
				System.exit(0);
			} finally {
				System.out.println("Goodbye");
			}
		}

		/*
		종료되기전에 처리해야하는 작업은 셧다운 훅으로 처리 가능하다.
		 */
		public static void getMessageSolution() {
			System.out.println("Hello");
			Runtime.getRuntime().addShutdownHook(
					new Thread() {
						public void run() {
							System.out.println("GoodBye");
						}
					}
			);

			System.exit(0);
		}
	}
}

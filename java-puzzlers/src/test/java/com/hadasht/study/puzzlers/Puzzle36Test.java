package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Indecisive")
class Puzzle36Test {

	/*
		decision 메소드의 문법 자체가 이상하다.
		하지만 try 구문에서 true를 리턴 했으니 결과도 true로 나와야 할 것이다.
	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		boolean decision = Indecisive.decision();

		assertThat(decision).isTrue();

	}


	/*
		try 구분에서 무엇을 리턴을 하더라도 finally 구문에서 리턴을 하게된다면 try 구문은 무시된다.
		명칭 그대로 try는 시도를 하는 것이고, finally를 최종적으로 결정하는 것인데
		catch 구문이 없거나 예외가 발생하지 않는 경우라면 finally는 반드시 완료되기 대문이다.
		try-catch-finally 는 예외처리를 위한 코드이기 때문에 return, break, continue, throw 등과 같이 finally 구문을
		벗어나려고 하면 안된다.
		예외처리를 위해 try-catch를 사용한다면 확실하게 예외를 처리하여 finally 구문에서 또 다른 예외가 발생하지 않도록
		작성해야 한다.

	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		boolean decision = Indecisive.decision();

		assertThat(decision).isFalse();
	}

	static class Indecisive {
		static boolean decision() {
			try {
				return true;
			} finally {
				return false;
			}
		}
	}

}

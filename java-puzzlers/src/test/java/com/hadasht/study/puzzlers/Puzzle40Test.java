package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;

@DisplayName("Reluctant")
class Puzzle40Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Reluctant reluctant = new Reluctant();
		String message = reluctant.getMessage();
		System.out.println("message = " + message);

	}


	class Reluctant {

		/*
		 인스턴스 멤버 초기화가 생성자 메서드보다 먼저 실행된다.
		 따라서, 이 코드는 무한 반복에 빠져 StackOverflowError를 발생시킨다.
		 Error는 try catch로 처리할 수 없다.
		 */
		private Reluctant internalInstance = new Reluctant();

		/*
		생성자 메소드
		 */
		public Reluctant() throws Exception {
			throw new Exception("I'm not coming out");
		}

		public String getMessage() {
			try {
				return "Surprise!";
			} catch (Exception e) {
				return "I told you so";
			}
		}

	}
}

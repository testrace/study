package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Type")
class Puzzle50Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
	}

	/*
	instanceof 연산자는 왼쪽 피연산자가 null일 경우 false를 반환합니다.
	 */
	static class Type1 {
		public static void main(String[] args) {
			String s = null;
			System.out.println(s instanceof String);
		}
	}

	/*
	instanceof 연산자 사용 시 양쪽 피 연산자가 모두 클래스 자료형이면
	둘 중 하나는 다른 클래스를 상속받는 서브타입이어야 한다.
	Type2는 String을 상속받고 있지 않으며,
	String도 Type2를 상속받고 있지 않다.
	컴파일조차 되지 않는다.
	 */
	static class Type2 {
		public static void main(String[] args) {
//			System.out.println(new Type2() instanceof String);
		}
	}

	/*
	다형성.
	상위타입은 하위타입으로 강제 자료형 변환할 수 없다.
	강제 자료형 변환도 instanceof와 마찬가지로 둘 중 하나는 다른 클래스를 상속받는
	서브 타입이어야만 한다.
	 */
	static class Type3 {
		public static void main(String[] args) {
			Type3 t3 = (Type3) new Object();

		}
	}
}

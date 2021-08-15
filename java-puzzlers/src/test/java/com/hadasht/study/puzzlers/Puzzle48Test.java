package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Hiding")
class Puzzle48Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Dog woofer = new Dog();
		Dog nipper = new Basenji();
		woofer.bark();
		nipper.bark();
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		DogSolution woofer = new DogSolution();
		DogSolution nipper = new BasenjiSolution();
		woofer.bark();
		nipper.bark();
	}

	static class Dog {
		public static void bark() {
			System.out.print("woof");
		}
	}

	/*
	정적 메소드는 오버라이딩을 할 수 없다.
	정적 메소드를 오버라이딩하는 것은 하이딩 이라고 표현한다.
	JVM은 하이딩된 메소드를 호출 할 때 실제 메소드(정적 메소드)를 찾아 호출한다.(다형성)
	정적 메서드를 하이딩하는 것은 좋지 않다.
	오버라이딩된 듯한 오해를 하기 쉬워지고 그로인해 코드를 이해하는데 어려움이 가중된다.

	 */
	static class Basenji extends Dog {
		public static void bark(){

		}
	}


	static class DogSolution {
		public void bark() {
			System.out.print("woof");
		}
	}

	static class BasenjiSolution extends DogSolution {
		@Override
		public void bark(){

		}
	}

}

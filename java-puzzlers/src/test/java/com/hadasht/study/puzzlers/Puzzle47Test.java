package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Counter")
class Puzzle47Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Dog[] dogs = {new Dog(), new Dog()};
		for (Dog dog : dogs) {
			dog.woof();
		}

		Cat[] cats = {new Cat(), new Cat(), new Cat()};
		for (Cat cat : cats) {
			cat.meow();
		}

		assertThat(Dog.getCount()).isEqualTo(2);
		assertThat(Cat.getCount()).isEqualTo(3);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		DogSolution[] dogs = {new DogSolution(), new DogSolution()};
		for (DogSolution dog : dogs) {
			dog.woof();
		}

		CatSolution[] cats = {new CatSolution(), new CatSolution(), new CatSolution()};
		for (CatSolution cat : cats) {
			cat.meow();
		}

		assertThat(DogSolution.woofCount()).isEqualTo(2);
		assertThat(CatSolution.meowCount()).isEqualTo(3);
	}

	/*
	 */
	static class Counter {
		private static int count;

		public static void increment() {
			count++;
		}

		public static int getCount() {
			return count;
		}

	}

	/*
	정적 변수는 선언된 클래스와 상속받은 모든 클래스가 공유한다.
	 */
	class Dog extends Counter {
		public Dog(){}
		public void woof() {increment();}
	}

	class Cat extends Counter {
		public Cat(){}
		public void meow() {increment();}
	}

	/*
	is-a 관계라면 상속을 사용,
	has-a 관계라면 합성을 사용하는게 바람직하다.
	 */
	static class DogSolution {
		private static int woofCounter;
		public DogSolution(){}
		public static int woofCount() {
			return woofCounter;
		}
		public void woof() {woofCounter++;}
	}

	static class CatSolution {
		private static int meowCounter;
		public CatSolution(){}
		public static int meowCount() {
			return meowCounter;
		}
		public void meow() {meowCounter++;}
	}




}

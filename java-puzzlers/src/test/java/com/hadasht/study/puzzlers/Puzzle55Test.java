package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicLong;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Creationism")
class Puzzle55Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
//		for (int i = 0; i < 100; i++)
//			Creature creature = new Creature();//지역변수 선언은 블록으로 감싸야한다.

		for (int j = 0; j < 100; j++) {
			Creature creature = new Creature();
		}
		assertThat(Creature.numCreated()).isEqualTo(100);
	}

	/*
	인스턴스화 하지 않고도 메서드를 호출할 수 있다.
	정적 메서드를 호출 할 때 내부의 값은 전혀 의미가 없다.
	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		for (int i = 0; i < 100; i++) {
			CreatureSolution solution = new CreatureSolution();
		}
		assertThat(CreatureSolution.numCreated()).isEqualTo(100);
	}

	static class Creature {
		private static long numCreated = 0;

		public Creature() {
			numCreated++;
		}

		public static long numCreated() {
			return numCreated;
		}
	}

	static class CreatureSolution {
		private static AtomicLong numCreated = new AtomicLong();

		public CreatureSolution() {
			numCreated.incrementAndGet();
		}

		public static long numCreated() {
			return numCreated.get();
		}
	}

}

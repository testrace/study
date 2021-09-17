package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Reflector")
class Puzzle78Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		assertThat(Reflector.main()).isTrue();
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		assertThat(ReflectorSolution.main()).isTrue();
	}

	static class Reflector {
		public static boolean main() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
			Set<String> s = new HashSet<>();
			s.add("foo");
			Iterator<String> iterator = s.iterator();
			Method hasNext = iterator.getClass().getMethod("hasNext");
			return (boolean) hasNext.invoke(iterator);
		}
	}

	static class ReflectorSolution {
		public static boolean main() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
			Set<String> s = new HashSet<>();
			s.add("foo");
			Iterator<String> iterator = s.iterator();
			Method hasNext = Iterator.class.getMethod("hasNext");
			return (boolean) hasNext.invoke(iterator);
		}
	}

}

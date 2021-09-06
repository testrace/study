package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("private")
class Puzzle66Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		assertThat(new PrivateMatter().getClassName()).isEqualTo("Derived");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		assertThat(new PrivateMatterSolution().getClassName()).isEqualTo("Derived");
	}

	class Base {
		public String className = "Base";
	}

	class Derived extends Base {
		private String className = "Derived";
	}

	/*
	상위 클래스의 필드는 public이어도 하위 클래스의 접근제어자가 private이면 하이딩되어 접근할 수가 없다.
	 */
	class PrivateMatter {
		public String getClassName() {
			return new Derived().className;
		};
	}

	class BaseSolution {
		public String getClassName() {
			return "Base";
		}
	}

	class DerivedSolution extends BaseSolution {
		public String getClassName() {
			return "Derived";
		}
	}

	class PrivateMatterSolution {
		public String getClassName() {
			return new DerivedSolution().getClassName();
		};
	}
}

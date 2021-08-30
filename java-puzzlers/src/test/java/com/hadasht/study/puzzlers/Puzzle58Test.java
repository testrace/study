package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Equals")
class Puzzle58Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Set<Name> s = new HashSet<>();
		s.add(new Name("Donald", "Duck"));
		boolean contains = s.contains(new Name("Donald", "Duck"));
		assertThat(contains).isTrue();
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		Set<NameSolution> s = new HashSet<>();
		s.add(new NameSolution("Donald", "Duck"));
		boolean contains = s.contains(new NameSolution("Donald", "Duck"));
		assertThat(contains).isTrue();
	}


	/*
	equals 메서드를 오버라이딩 할 때에는 인자를 Object로 받아야 한다.
	자바의 모든 클래스는 Object를 상속받게 되어 있고, Obejct 클래스의 equals는 Object를 인자로 받게 되어 있다.
	아래의 경우는 오버라이딩이 아닌 오버로딩하고 있다.
	추가로 자바5 이상 버전에서는 @Override 애노테이션을 붙여서 오버라이딩인지, 오버로딩인지 구분하여 작성하는것이 좋다
	 */
	class Name {
		private final String first, last;

		public Name(String first, String last) {
			this.first = first;
			this.last = last;
		}

		public boolean equals(Name n) {
			return n.first.equals(first) && n.last.equals(last);
		}

		public int hashCode() {
			return 31 * first.hashCode() + last.hashCode();
		}
	}

	class NameSolution {
		private final String first, last;

		public NameSolution(String first, String last) {
			this.first = first;
			this.last = last;
		}

		public boolean equals(Object o) {
			if (!(o instanceof NameSolution)) {
				return false;
			}
			NameSolution n = (NameSolution) o;
			return n.first.equals(first) && n.last.equals(last);
		}

		public int hashCode() {
			return 31 * first.hashCode() + last.hashCode();
		}
	}


}

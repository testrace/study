package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("HashCode")
class Puzzle57Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		Set<Name> s = new HashSet<>();
		s.add(new Name("Mickey", "Mouse"));
		boolean contains = s.contains(new Name("Mickey", "Mouse"));
		assertThat(contains).isTrue();
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		Set<NameSolution> s = new HashSet<>();
		s.add(new NameSolution("Mickey", "Mouse"));
		boolean contains = s.contains(new NameSolution("Mickey", "Mouse"));
		assertThat(contains).isTrue();
	}


	/*
	equals 메서드를 오버라이딩 할 때에는 반드시 hashCode 메서드도 오버라이딩 해야한다.
	 */
	class Name {
		private final String first, last;

		public Name(String first, String last) {
			this.first = first;
			this.last = last;
		}

		public boolean equals(Object o) {
			if (!(o instanceof Name)) {
				return false;
			}
			Name n = (Name) o;
			return n.first.equals(first) && n.last.equals(last);
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
			return Objects.hash(first, last);
		}
	}


}

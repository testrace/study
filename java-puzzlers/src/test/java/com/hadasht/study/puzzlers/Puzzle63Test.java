package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("MoreNames")
class Puzzle63Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		MoreNames moreNames = new MoreNames();
		assertThat(moreNames.size()).isEqualTo(1);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		MoreNamesSolution moreNames = new MoreNamesSolution();
		assertThat(moreNames.size()).isEqualTo(1);
	}

	class MoreNames {
		private Map<String, String> m = new HashMap<>();

		/*
		아래 코드는 생성자가 아닌 인스턴스 메서드일뿐이다.
		 */
		public void MoreNames() {
			m.put("Mickey", "Mouse");
			m.put("Mickey", "Mantle");
		}
		
		public int size() {
			return m.size();
		}
	}

	class MoreNamesSolution {
		private Map<String, String> m = new HashMap<>();

		public MoreNamesSolution() {
			m.put("Mickey", "Mouse");
			m.put("Mickey", "Mantle");
		}

		public int size() {
			return m.size();
		}
	}
}

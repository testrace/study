package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Conundrum")
class Puzzle74Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		assertThat(new Conundrum().isEquals()).isFalse();
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		assertThat(new Conundrum().isEquals()).isFalse();
	}

	class Enigma {
		public Enigma() {
			System.exit(0);
		}
	}

	class Conundrum {
		public boolean isEquals() {
			Enigma e = new Enigma();
			return e.equals(e);
		}
	}



}

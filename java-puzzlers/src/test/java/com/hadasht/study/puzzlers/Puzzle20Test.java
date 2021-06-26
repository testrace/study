package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Me")
class Puzzle20Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		String puzzle = Puzzle20.puzzle();
		assertThat(puzzle).isEqualTo("com/hadasht/study/puzzlers/Puzzle20Test$Puzzle20.class");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		String solution = Puzzle20.solution();
		assertThat(solution).isEqualTo("com/hadasht/study/puzzlers/Puzzle20Test$Puzzle20.class");
	}

	public static class Puzzle20 {

		public static String puzzle() {
			return Puzzle20.class.getName().replaceAll(".", "/") + ".class";
		}

		/*
			replaceAll 은 정규식 치환 기능이다 (since jdk 1.4)
			정규식 '.' 은 '모든 문자' 를 뜻하기에 앞에 역슬래시(\)를 붙여줘야 한다.
			하지만 문자열 안에서 역슬래시는 이스케이프 문자를 뜻하기에 한번 더 붙여줘야 한다.
		 */
		public static String solution() {
			return Puzzle20.class.getName().replaceAll("\\.", "/") + ".class";
		}

	}

}

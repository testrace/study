package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Random;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("No Pain, No Gain")
class Puzzle23Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		String puzzle = Puzzle23.puzzle();
		assertThat(puzzle).containsPattern("(P|G|M)ain");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		String solution = Puzzle23.solution();
		assertThat(solution).containsPattern("(P|G|M)ain");
	}

	public static class Puzzle23 {

		private static Random rnd = new Random();

		/*
			1. rnd.nextInt(2) 의 범우 지정이 잘못 되었음. (0-based, 1-based)
			   울타리 기둥 에러(fencepost error)에 주의.
			2. String(Char) 생성자는 없음. String(int) 생성자로 초기화 되었음.
			   char 타입은 int 타입으로 변환되어 초기화는 되지만 값은 없는 상태.
			   (변환된 char 의 int 만큼 초기 용량만 존재)
			3. switch 문에는 반드시 break
			4.
		 */
		public static String puzzle() {
			StringBuffer word = null;
			switch (rnd.nextInt(2)) {
				case 1 :
					word = new StringBuffer('P');
				case 2 :
					word = new StringBuffer('G');
				default:
					word = new StringBuffer('M');
			}
			word.append('a')
			    .append('i')
			    .append('n');

			return word.toString();
		}

		public static String solution() {
			return "PGM".charAt(rnd.nextInt(3)) + "ain";
		}

	}

}

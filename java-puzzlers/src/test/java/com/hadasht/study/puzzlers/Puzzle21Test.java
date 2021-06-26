package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("MeToo")
class Puzzle21Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		String puzzle = Puzzle21.puzzle();
		assertThat(puzzle).isEqualTo("com/hadasht/study/puzzlers/Puzzle21Test$Puzzle21.class");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		String solution = Puzzle21.solution();
		assertThat(solution).isEqualTo("com\\hadasht\\study\\puzzlers\\Puzzle21Test$Puzzle21.class");
	}

	public static class Puzzle21 {

		public static String puzzle() {
			return Puzzle21.class.getName().replaceAll("\\.", "/") + ".class";
		}

		/*
			파일 경로를 나타날 때는 OS 따라 슬래쉬(/) 또는 역슬래쉬(\)로 구분하기에
			자바에서 제공하는 값을 사용한다.
			윈도우 환경에서 replaceAll("\\.", File.separator) 을 사용하면 IllegalArgumentException
			character to be escaped is missing 에러가 발생한다.
			윈도우에서는 파일 경로 구분값을 역슬래쉬(\)를 사용하기에 순차 치환하면서 이미 치환된 문자가
			정규식과 충돌 되는 것으로 예상됨...
			꼭 정규식을 사용해야 하는 것이 아니라면 replace(CharSequence, CharSequence) 메소드를
			사용하면 된다.
		 */
		public static String solution() {
			return Puzzle21.class.getName().replace(".", File.separator) + ".class";
		}

	}

}

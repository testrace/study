package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;
import static java.util.Arrays.toString;

@DisplayName("ImportDuty")
class Puzzle71Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
	}

	static class ImportDuty {

		public static void main(String[] args) {
			printArgs(1, 2, 3, 4, 5);
		}

		static void printArgs(Object... args) {
			/*
			컴파일 오류로 인해 주석처리.
			현재 영역안에 있는 멤버는 정적 임포트보다 우선순위가 높다.
			ImportDuty의 toString()이 있으므로(Object의 toString()) 정적 임포트 Arrays.toString()을 호출 할 수 없다.
			 */
			//System.out.println(toString(args));
			System.out.println(Arrays.toString(args));
		}
	}

}

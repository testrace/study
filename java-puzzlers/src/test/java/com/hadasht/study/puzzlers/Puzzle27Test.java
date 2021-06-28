package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Shifty")
class Puzzle27Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		var puzzle = Puzzle27.puzzle();
		assertThat(puzzle).isEqualTo(32);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		var solution = Puzzle27.solution();
		assertThat(solution).isEqualTo(32);
	}

	public static class Puzzle27 {


		/*
			int는 32비트이다.
			가장 앞자리는 부호로 쓰인다(1:음수, 0:양수). int 의 크기는 -2^31 ~ 2^31-1
			int '-1' 은 1로 가득 채운다 (2의 보수)
			1111 1111 1111 1111 1111 1111 1111 1111

			int 시프트 연산자는 최대 31개 비트만 옮길 수 있다 (다섯개 비트 = 11111(2진수) = 31(10진수)), long은 6개
			int -1 을 아무리 시프트 연산하여도 int의 크기인 32비트를 전부 옮길 수가 없어서 0이 될 수가 없다.

			아래 코드는 무한 루프.
		 */
		public static int puzzle() {
			int i = 0;
			while (-1 << i != 0) {
				i++;
			}
			return i;
		}

		/*
			상수(1)를 이용하여 시프트 연산 하면 해결.
		 */
		public static int solution() {
			int distance = 0;
			for (int val = -1; val != 0; val <<= 1) {
				distance++;
			}
			return distance;
		}

	}

}

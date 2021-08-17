package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Elvis")
class Puzzle49Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		assertThat(Elvis.INSTANCE.beltSize()).isEqualTo(91);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		assertThat(ElvisSolution.INSTANCE.beltSize()).isEqualTo(91);
	}


	/*
	INSTANCE를 호출하는 순간 Elvis 객체가 생성되고,
	beltSize, CURRENT_YEAR는 기본값(int의 기본값 0)으로 초기화 된다.
	따라서 Elvis 생성자는 beltSize의 값을 (0 - 1930)가 된다.
	이는 코드 위에서부터 아래로 순서대로 실행되기 때문이다.
	이런 문제가 생기지 않도록 생성자와 관련된 정적 필드가 있는 경우 초기화 순서에 항상 유의해야 한다.
	 */
	static class Elvis {
		public static final Elvis INSTANCE = new Elvis();
		private final int beltSize;
		private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

		private Elvis() {
			beltSize = CURRENT_YEAR - 1930;
		}

		public int beltSize() {
			return beltSize;
		}

	}

	static class ElvisSolution {
		private final int beltSize;
		private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
		public static final ElvisSolution INSTANCE = new ElvisSolution();

		private ElvisSolution() {
			beltSize = CURRENT_YEAR - 1930;
		}

		public int beltSize() {
			return beltSize;
		}

	}

}

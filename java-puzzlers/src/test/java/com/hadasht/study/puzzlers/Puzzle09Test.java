package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Tweedleum")
class Puzzle09Test {

	/**
	 * x += i 는 자동 형 변환이 일어 난다.
	 * <br/>
	 * int 123456이 short 의 크기보다 커서 오버 플로우가 발생함.
	 *
	 * <p></p>
	 * 복합 할당(대입) 연산자는 좌항의 자료형으로 자동 형 변환이 일어난다.
	 *
	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		short x = 0;
		int i = 123456;
		x += i;
		assertThat(x).isEqualTo(-7616);
	}


	/**
	 * 컴파일 에러 발생.
	 * <p>
	 * error: incompatible types: possible lossy conversion from int to short
	 * 		y = y + j;
	 * 		      ^
	 * 	</p>
	 * 	int 타입을 short 타입으로 변경할 수 없다.(타입간의 크기가 달라 변환 시 바이트 손실)
	 *
	 */
	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle2() throws Exception {

		short y = 0;
		int j = 12345;
//		y = y + j;

	}

}

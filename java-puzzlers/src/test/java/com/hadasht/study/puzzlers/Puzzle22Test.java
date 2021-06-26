package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("BrowserTest")
class Puzzle22Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		System.out.print("chrome:");
		http://www.google.com;
		System.out.println(":maximize");
	}

	/*
		http: 는 레이블로 사용되었다.
		자바에는 goto 문이 없기에 사용할 필요가 거의 없다.
		불필요한 주석은 달지 말자.
	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		System.out.print("chrome:");
		http:
		//www.google.com;
		System.out.println(":maximize");
	}


}

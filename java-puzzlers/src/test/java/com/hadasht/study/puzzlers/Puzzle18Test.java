package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("StringCheese")
class Puzzle18Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		int[] puzzle = Puzzle18.puzzle();
		assertThat(puzzle[128]).isEqualTo(128);
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		int[] solution = Puzzle18.solution();
		assertThat(solution[128]).isEqualTo(128);
	}

	public static class Puzzle18 {

		public static int[] puzzle() {

			byte[] bytes = new byte[256];
			for (int i = 0; i < 256; i++) {
				bytes[i] = (byte) i;
			}

			int[] results = new int[256];

			String str = new String(bytes);
			for (int i = 0; i < str.length(); i++) {
				results[i] = str.charAt(i);
			}

			return results;
		}

		public static int[] solution() {

			byte[] bytes = new byte[256];
			for (int i = 0; i < 256; i++) {
				bytes[i] = (byte) i;
			}

			int[] results = new int[256];

			/*
			 * 캐릭터셋 지정.
			 * "ISO-8859-1" 으로 넣을 경우 UnsupportedEncodingException 발생
			 * TYPE SAFE -> StandardCharsets.ISO_8859_1
			 * JDK 1.7 이후 StandardCharsets 사용
			 */
			String str = new String(bytes, StandardCharsets.ISO_8859_1);
			for (int i = 0; i < str.length(); i++) {
				results[i] = str.charAt(i);
			}

			return results;
		}
	}
}

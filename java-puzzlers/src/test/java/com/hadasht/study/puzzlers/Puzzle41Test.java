package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("Stream")
class Puzzle41Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		String src = "";
		String dest = "";

		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);

			byte[] buf = new byte[1024];
			int n;
			while ((n = in.read(buf)) >= 0) {
				out.write(buf, 0, n);
			}
		} finally {
			if (in != null) in.close();
			if (in != null) out.close();
		}


	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		String src = "";
		String dest = "";

		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);

			byte[] buf = new byte[1024];
			int n;
			while ((n = in.read(buf)) >= 0) {
				out.write(buf, 0, n);
			}
		} finally {
			if (in != null) in.close();
			if (in != null) out.close();
		}
	}

	private static void closeIgnoringException(Closeable c) {
		if (c != null) {
			try {
				c.close();
			} catch (IOException e) {

			}

		}
	}

}

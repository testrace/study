package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

@DisplayName("Arcane")
class Puzzle37Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		String message = Arcane1.main();

		assertThat(message).isEqualTo("Hello");

	}

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle3() throws Exception {
		assertThatCode(Arcane3::main).doesNotThrowAnyException();
	}

	static class Arcane1 {
		static String main() {
			try {
				return "Hello";
				/*
				IOException 은 checked exception 이기때문에 컴파일 오류가 발생한다.
				 */
//			} catch (IOException e){
//				System.out.println("I've never seen println fail!");
			} catch (Exception e){
				return "I've never seen println fail!";
			}
		}
	}

	static class Arcane2 {
		static void main() {
			try {
				// 코드 없음
				/*
				Exception 또는 Throwable 클래스도 checked exception 이지만
				try 구문에 상관없이 정상적으로 컴파일 된다.( 두 클래스에만 해당 )
				 */
			} catch (Exception e){
				System.out.println("This can't happen");
			}
		}
	}

	interface Type1 {
		void f() throws CloneNotSupportedException;
	}

	interface Type2 {
		void f() throws InterruptedException;
	}

	interface Type3 extends Type1, Type2 {

	}

	static class Arcane3 implements Type3 {

		/*
		인터페이스의 throws 는 예외를 제한하는 기능이다.
		f() 는 CloneNotSupportedException, InterruptedException 두 예외만 처리 할 수 있다.
		f() throws IOException 처럼 지정하지 않은 예외는 처리할 수 없다. (컴파일 오류 발생)
		 */
		@Override
		public void f() {
			System.out.println("Hello world");
		}

		static void main() {
			Type3 t3 = new Arcane3();
			t3.f();
		}

	}

}

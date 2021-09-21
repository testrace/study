package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;

@DisplayName("OuterInner")
class Puzzle80Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
//		assertThat(Reflector.main()).isTrue();
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
//		assertThat(ReflectorSolution.main()).isTrue();
	}

	class Outer {
		public void greetWorld() throws InstantiationException, IllegalAccessException {
			System.out.println(Inner.class.newInstance());
		}

		/*
		생성자를 별도로 만들지 않았을 경우 '자신을 둘러싸고 있는 클래스의 인스턴스'를 첫 번째 매개변수로 갖는
		생성자를 자동으로 만들어 준다.
		하지만 리플렉션을 사용하는 경우에는 이러한 과정이 자동으로 일어나지 않는다.
		 */
		public void greetWorldSolution() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
			Constructor c = Inner.class.getConstructor(Outer.class);
			System.out.println(c.newInstance(Outer.this));
		}


		class Inner {
			@Override
			public String toString() {
				return "Hello Word";
			}
		}
	}



}

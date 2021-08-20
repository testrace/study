package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Point")
class Puzzle51Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
		ColorPoint colorPoint = new ColorPoint(4, 2, "purple");
		assertThat(colorPoint).hasToString("[4,2]:purple");
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
		ColorPointSolution colorPoint = new ColorPointSolution(4, 2, "purple");
		assertThat(colorPoint).hasToString("[4,2]:purple");
	}

	class Point {
		private final int x;
		private final int y;
		private final String name;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
			name = makeName();
		}

		protected String makeName() {
			return "[" + x + "," + y + "]";
		}

		public final String toString() {
			return name;
		}
	}

	class ColorPoint extends Point {
		private final String color;

		ColorPoint(int x, int y, String color) {
			super(x, y);
			this.color = color;
		}

		@Override
		protected String makeName() {
			return super.makeName() + ":" + color;
		}

	}
	class PointSolution {
		private final int x;
		private final int y;
		private String name;

		public PointSolution(int x, int y) {
			this.x = x;
			this.y = y;
			//생성자에서 오버라이딩이 가능한 메서드를 호출하면 안된다.
			//상위 클래스의 생성사는 하위 클래스에서 인스턴스가 완료되기 전에 실행되기 때문에
			//오버라이딩을 하더라도 원하는대로 동작하지 않는다.
		}

		protected String makeName() {
			return "[" + x + "," + y + "]";
		}

		/*
		name 필드를 인스턴스를 생성하는 시점이 아닌 사용하는 시점에서 초기화 할 수 있다.
		synchronized 를 이용해 초기화를 지연시켜 사용하는 시점에서 초기화 한다.
		 */
		public final synchronized String toString() {
			if (name == null) {
				name = makeName();
			}
			return name;
		}
	}

	class ColorPointSolution extends PointSolution {
		private final String color;

		ColorPointSolution(int x, int y, String color) {
			super(x, y);
			this.color = color;
		}

		@Override
		protected String makeName() {
			return super.makeName() + ":" + color;
		}

	}
}

package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Pet")
class Puzzle79Test {

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

	static class Pet {
		public final String name;
		public final String food;
		public final String sound;

		public Pet(String name, String food, String sound) {
			this.name = name;
			this.food = food;
			this.sound = sound;
		}

		public void eat() {
			System.out.println(name + ": Mmmmm, " + food);
		}

		public void play() {
			System.out.println(name + ": Sound, " + sound);
		}

		public void sleep() {
			System.out.println(name + ": Zzzzzzz...");
		}

		public void live() {
			new Thread() {
				public void run() {
					while(true) {
						eat();
						play();
						//sleep();
						/*
						이대로 컴파일을 하면 오류가 난다.
						현재 코드라인에서 가장 가까운 곳에 있는 같은 이름의 메서드를 찾기 때문이다.
						Thread.sleep(int i) 메서드가 존재하여 Pet의 sleep()이 아닌 Thread의 sleep(int)를 실행하려한다.
						이처럼 익명으로 상속한 Thread.sleep() 메서드가 Pet.sleep() 을 섀도윙한다.
						섀도윙은 좋지 않다.
						 */
					}
				}
			}.start();
		}

		public static void main(String[] args) {
			new Pet("Fido", "beef", "Woof").live();
		}
	}

	static class PetSolution {
		public final String name;
		public final String food;
		public final String sound;

		public PetSolution(String name, String food, String sound) {
			this.name = name;
			this.food = food;
			this.sound = sound;
		}

		public void eat() {
			System.out.println(name + ": Mmmmm, " + food);
		}

		public void play() {
			System.out.println(name + ": Sound, " + sound);
		}

		public void sleep() {
			System.out.println(name + ": Zzzzzzz...");
		}

		public void live() {
			/*
			Thread 클래스를 상속하지 말고 Thread(Runnable) 생성자를 사용하는 것이 좋다.
			 */
			new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						eat();
						play();
						sleep();

					}
				}
			}).start();
		}

		public static void main(String[] args) {
			new PetSolution("Fido", "beef", "Woof").live();
		}
	}

}

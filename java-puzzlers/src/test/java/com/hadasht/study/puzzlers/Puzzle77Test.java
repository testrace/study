package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Timer;
import java.util.TimerTask;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Worker")
class Puzzle77Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {
//		assertThat(PingPong.main(null)).startsWith("Ping");
		Worker worker = new Worker();
		worker.start();

		Timer t = new Timer(true);
		t.schedule(new TimerTask() {
			public void run() { worker.keepWorking(); }
		}, 500);

		Thread.sleep(400);
		worker.quit();
	}

	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {
//		assertThat(PingPongSolution.main(null)).startsWith("Ping");
		WorkerSolution worker = new WorkerSolution();
		worker.start();

		Timer t = new Timer(true);
		t.schedule(new TimerTask() {
			public void run() { worker.keepWorking(); }
		}, 500);

		Thread.sleep(400);
		worker.quit();
	}

	class Worker extends Thread {
		private volatile boolean quittingTime = false;
		public void run() {
			while (!quittingTime) {
				pretendToWork();
			}
			System.out.println("Beer is good");
		}

		private void pretendToWork() {
			try {
				Thread.sleep(300);
			} catch (InterruptedException ex) {}

		}

		synchronized void quit() throws InterruptedException {
			quittingTime = true;
			join();
		}

		synchronized void keepWorking() {
			quittingTime = false;
		}
	}

	class WorkerSolution extends Thread {
		private volatile boolean quittingTime = false;
		private final Object lock = new Object();
		public void run() {
			while (!quittingTime) {
				pretendToWork();
			}
			System.out.println("Beer is good");
		}

		private void pretendToWork() {
			try {
				Thread.sleep(300);
			} catch (InterruptedException ex) {}

		}

		synchronized void quit() throws InterruptedException {
			synchronized (lock) {
				quittingTime = true;
				join();
			}
		}

		synchronized void keepWorking() {
			synchronized (lock) {
				quittingTime = false;
			}
		}
	}

}

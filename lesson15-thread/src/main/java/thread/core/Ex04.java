package thread.core;

import java.util.Random;

import static utils.ThreadUtils.*;

public class Ex04 {
	private static Random rd = new Random();
	private static final String[] taskName = { "A", "B", "C", "D" };
	private static long start = 0;

	public static void main(String[] args) {

		start = System.currentTimeMillis();
		Task t1 = new Task();
		Thread thread1 = new Thread(t1, "Thread 1");
		thread1.start();
		// t1.run();
		Task t2 = new Task();
		Thread thread2 = new Thread(t2, "Thread 2");
		thread2.start();
		// t2.run();
		Task t3 = new Task();
		Thread thread3 = new Thread(t3, "Thread 3");
		thread3.start();
		// t3.run();

		System.out.println("Execution Time: " + (System.currentTimeMillis() - start) + "mls");
	}

	static class Task implements Runnable {
		public void run() {
			// task executes task about random second
			String tname = taskName[rd.nextInt(taskName.length)];

			System.out.println(Thread.currentThread().getName() + " is executing task" + tname);
			sleep(3);
			System.out.println(
					Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - start) + "mls");

		}
	}
}

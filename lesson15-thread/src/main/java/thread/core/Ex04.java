package thread.core;

import static utils.ThreadUtils.sleep;

import java.util.Random;

public class Ex04 {
	private static Random rd = new Random();
	private static String[] taskNames = { "A", "B", "C", "D", "E", "F", "G" };
	private static long start = 0;

	public static void main(String[] args) {
		start = System.currentTimeMillis();

		Task task = new Task();
//		t1.run();
		Thread thread1 = new Thread(task, "thread 1");
		thread1.start();

//		t2.run();
		Thread thread2 = new Thread(task, "thread 2");
		thread2.start();

		// t3.run();
		Thread thread3 = new Thread(task, "thread 3");
		thread3.start();

		System.out.println("Execute Time: " + (System.currentTimeMillis() - start) + " mls");
	}

	static class Task implements Runnable {
		public synchronized void run() {
			String tname = taskNames[rd.nextInt(taskNames.length)];
			System.out.println(Thread.currentThread().getName() + " is executing task " + tname);
			sleep(3);
			System.out.println(
					Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - start) + " mls");

//			testSync();
		}
	}
//	private synchronized void testSync() {
//		System.out.println(Thread.currentThread().getName() + "sync.....");
//	}

}

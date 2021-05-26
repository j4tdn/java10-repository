package thread.pool;

import java.util.Random;
import static untils.ThreadUtils.*;

/*
 * synchronized
 * */
public class Ex02 {
	private static Random rd = new Random();
	private static final String[] taskNames = { "A", "B", "C", "D", "E", "F", "G" };
	private static long start = 0;

	public static void main(String[] args) {

		start = System.currentTimeMillis();
		Task t1 = new Task();
		Thread thread1 = new Thread(t1, "thread 1");
		// t1.run();
		thread1.start();

		Task t2 = new Task();
		Thread thread2 = new Thread(t2, "thread 2");
		// t2.run();
		thread2.start();

		Task t3 = new Task();
		Thread thread3 = new Thread(t3, "thread 3");
		// t3.run();
		thread3.start();

		System.out.println("Execution " + (System.currentTimeMillis() - start) + "mls");

	}

	static class Task implements Runnable {
		public synchronized void run() {
			String tname = taskNames[rd.nextInt(taskNames.length)];
			System.out.println(Thread.currentThread().getName() + " is excuting " + tname);
			sleep(3);
			System.out.println(
					Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - start) + "mls");
		}
	}
	private synchronized void testSync() {
//		System.out.println(Thread.currentThread().getName() + "sync.....");
	
		}
}

package thread.pool;

/*
 * Synchronized Demo
 */

import static utils.ThreadUtils.*;

import java.util.Random;
public class Ex02 {
	private static final String[] taskNames = {"A", "B", "C", "D", "E"};
	private static long start = 0;
	
	public static void main(String[] args) {
		start = System.currentTimeMillis();
		
		Task task = new Task();
		
		Thread thread1 = new Thread(task, "thread1");
		thread1.start();
		
		Thread thread2 = new Thread(task, "thread2");
		thread2.start();
		
		Thread thread3 = new Thread(task, "thread3");
		thread3.start();
		
		System.out.println("Exec time: " + (System.currentTimeMillis() - start) + "mls");
	}
	
	static class Task implements Runnable {

		@Override
		public synchronized void run() {
			String tname = taskNames[new Random().nextInt(taskNames.length)];
			System.out.println(Thread.currentThread().getName() + "  doing task " + tname);
			sleep(3);
			System.out.println(Thread.currentThread().getName() + " exec time: " + (System.currentTimeMillis() - start) + "mls");
		}
	}
}

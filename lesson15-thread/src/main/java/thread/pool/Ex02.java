package thread.pool;

import java.util.Random;

import static utils.ThreadUtils.*;
/**
 * DEMO Synchronized
 *
 */
public class Ex02 {
	private static Random rd = new Random();
	private static final String[] taskName = { "A", "B", "C", "D" };
private static long start =0;
	public static void main(String[] args) {

		start = System.currentTimeMillis();
		Task task = new Task();
		Thread thread1 = new Thread(task, "Thread 1");
				thread1.start();
		//t1.run();
		Thread thread2 = new Thread(task, "Thread 2");
				thread2.start();
		//t2.run();
		Thread thread3 = new Thread(task, "Thread 3");
				thread3.start();
		//t3.run();
		
		System.out.println("Execution Time: "+ (System.currentTimeMillis()-start) +"mls");
	}

	static class Task implements Runnable {
		public synchronized void run() {
			// task executes task about random second
			String tname = taskName[rd.nextInt(taskName.length)];

			System.out.println(Thread.currentThread().getName() + " is executing task"+ tname);
			sleep(3);
			System.out.println(Thread.currentThread().getName() + " took "+ (System.currentTimeMillis()-start)+ "mls");

		}
		
	}
}

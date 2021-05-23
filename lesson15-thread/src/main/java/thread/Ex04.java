package thread;

import static utils.ThreadUtils.sleep;

import java.util.Random;

public class Ex04 {
	private static Random rd = new Random();
	private static String[] taskNames = { "A", "B", "C", "D" };
	private static long start = 0;

	public static void main(String[] args) {
		
		start = System.currentTimeMillis();
		
		Task t1 = new Task();
//		t1.run();
		Thread thread1 = new Thread(t1, "thread 1");
		thread1.start();
		
		Task t2 = new Task();
//		t2.run();
		Thread thread2 = new Thread(t2, "thread 2");
		thread2.start();
		
		Task t3 = new Task();
		//		t3.run();
		Thread thread3 = new Thread(t3, "thread 3");
		thread3.start();
		
		System.out.println("Execute Time: " + (System.currentTimeMillis() - start) + " mls");
	}

	static class Task implements Runnable {
		public void run() {
			String tname = taskNames[rd.nextInt(taskNames.length)];
			System.out.println(Thread.currentThread().getName() + " is running ... " + tname);
			System.out.println(Thread.currentThread().getName() + " is executing task ");
			sleep(3);
			System.out.println("Execute Time: " + (System.currentTimeMillis() - start) + " mls");

		}
	}
}

package thread.core;

import java.util.Random;
import static utils.ThreadUtils.*;

public class Ex04 {
	private static Random rd = new Random();
	private static final String[] taskNames = {"A", "B", "C", "D", "E", "F", "G"};
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
		
		System.out.println("Excution Time: " + (System.currentTimeMillis() - start + "mls"));
		
	}
	
	static class Task implements Runnable {
		public void run() {
			String tname = taskNames[rd.nextInt(taskNames.length)];
			System.out.println(Thread.currentThread().getName() + " is excuting task " + tname);
			sleep(3); // virtual case of executing
			System.out.println(Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - start));
		}
	}
}

package thread.core;

import java.util.concurrent.TimeUnit;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Thread main start");

		// Initial thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running ...");
			}
		};
		t0.start(); // JVM automatically call run method

		System.out.println("thread main doing something ...");
		sleep(2);
		System.out.println("Thread main end");
	}
	
	private static void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
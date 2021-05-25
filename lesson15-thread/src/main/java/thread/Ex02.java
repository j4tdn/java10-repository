package thread;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread main start");

		// Initial thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running ...");
				Ex02.sleep(4);
				System.out.println(Thread.currentThread().getName() + " is ended!");
			}
		};
		t0.start(); // JVM automatically call run method
		t0.join();
		
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

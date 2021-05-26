package thread.core;

import java.util.concurrent.TimeUnit;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("thread main start");

		// Initial thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is runing ...");
				Ex02.sleep(2);
				System.out.println(Thread.currentThread().getName() + " is ended !!! ");
			}
		};
		t0.start();
		t0.join();
		System.out.println("Thread main doing something .... ");
		sleep(2);
		System.out.println("thread main end");
	}

	public static void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

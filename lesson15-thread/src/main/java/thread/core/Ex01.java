package thread.core;

import java.util.concurrent.TimeUnit;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("thread main start");

		// Initial thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is runing ...");
			}
		};
		t0.start();
		// t0.run();
		sleep(2);

		System.out.println("thread main end");
	}

	private static void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {

		}
	}

}

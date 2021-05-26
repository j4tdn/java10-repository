package thread.core;

import utils.ThreadUtils;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread main start");
		
		//	Inittial thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running ...");
				ThreadUtils.sleep(4);
				System.out.println(Thread.currentThread().getName() + " is ended");
			};
		};
		t0.start();	// JVM automatically call run method
		t0.join();
		
		System.out.println("Thread main doing something ...");
		ThreadUtils.sleep(2);
		System.out.println("Thread main end");
	}
	
	
}

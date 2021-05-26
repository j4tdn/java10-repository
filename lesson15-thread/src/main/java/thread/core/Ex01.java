package thread.core;

import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class Ex01 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName()+ " is running");
	System.out.println("thread main start");
	
	
	
	//Initial thread
	Thread t0 = new Thread("t0") {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+ " is running");
		}
	};
	t0.start();//jvm automatically call run method
	//t0.run();
	System.out.println("Thread main doing something..... ");
	sleep(2);
	System.out.println("thread main end");
	
}
	private static void sleep(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
e.printStackTrace();
		}
		
	}
}

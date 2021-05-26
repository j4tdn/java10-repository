package thread.core;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is running ... ");
		
		// initial thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "  is running ... ");
			}
		};
		t0.start();	// JVM automatically call run method
		
		
		System.out.println("Thread main end");
	}
}

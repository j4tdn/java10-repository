package thread.core;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "  is running ... ");
			}
		}, "database-thread");
		thread.start();
		
		System.out.println("main end");
	}
}	

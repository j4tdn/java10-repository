package thread;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("thread main satrt");
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+ " is running");

			}
		}, "Database - thread");
		thread.start();
		System.out.println("thread main end");
}
}	

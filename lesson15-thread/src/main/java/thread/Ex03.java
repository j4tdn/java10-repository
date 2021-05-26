package thread;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("Thread main start");

		Thread thead = new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running ...");
			}
		}, "Database-Thread");
		thead.start();

		System.out.println("Thread main end");
	}

}
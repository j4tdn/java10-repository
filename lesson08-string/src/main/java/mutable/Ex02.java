package mutable;

public class Ex02 {
	private static volatile int counter =0;
	public static void main(String[] args) {
		// thread main
		System.out.println("Thread main start");

		Thread t0 = new Thread(new Runnable() {

			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int counter = 2;
				System.out.println("t0 is running ....");
			}
		});
		t0.start();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				counter+=4;
				System.out.println("t1 is running ....");
			}
		});
		t1.start();

		System.out.println("Thread main end");
		System.out.println("counter: "+ counter);
	}
}

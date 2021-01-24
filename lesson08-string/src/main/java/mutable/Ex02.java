package mutable;

public class Ex02 {
	private static volatile int counter = 1;

	public static void main(String[] args) {

		System.out.println("Thread main start");

		Thread t0 = new Thread(new Runnable() {

			public void run() {
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				counter *= 2;
				System.out.println("t0 is running ...");
				System.out.println("t0 counter: " + counter);

			}
		});

		Thread t1 = new Thread(new Runnable() {

			public void run() {

				counter += 4;
				System.out.println("t1 is running ...");
				System.out.println("t1 counter: " + counter);

			}
		});
		t0.start();
		t1.start();
		System.out.println("Thread main end");
		counter += 1;
		System.out.println("counter:" + counter);
		counter += 2;
	}

}

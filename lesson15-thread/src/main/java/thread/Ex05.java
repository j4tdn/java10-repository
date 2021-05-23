package thread;

public class Ex05 {
	private static volatile int counter = 1;
	
	public static void main(String[] args) {
		System.out.println("Thread main start");
		Thread t0 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("t0 is running ...");
				counter++;
				System.out.println("t0 counter: " + counter);
			}
		}, "t0");
		t0.start();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("t1 is runnning ...");
				counter *= 2;
				System.out.println("t1 counter: " + counter);
			}
		}, "t1");
		t1.start();
		counter += 2;
		
		System.out.println("main counter: " + counter);
		System.out.println("Thread main end");
	}
}

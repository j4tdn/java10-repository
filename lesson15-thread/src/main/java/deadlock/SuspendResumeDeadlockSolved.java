package deadlock;

public class SuspendResumeDeadlockSolved {
	
	private static String sharedObject = "";
	
	public static void main(String[] args) throws InterruptedException {

		final Thread thread1 = new Thread("Thread-1") {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " has started.");
				synchronized (sharedObject) {
					System.out.println(Thread.currentThread().getName() + " " + " has obtained lock on sharedObject "
							+ " & suspended...");
					Thread.currentThread().suspend();

					System.out.println(Thread.currentThread().getName() + " " + " has released lock on sharedObject");
				}
				System.out.println(Thread.currentThread().getName() + " has ENDED.");
			}

		};
		thread1.start();

		Thread.sleep(2000); // This delay ensures Thread-2 after Thread-1

		Thread thread2 = new Thread("Thread-2") {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " has started.");

				System.out.println(Thread.currentThread().getName() + " is trying to obtain lock on sharedObject");
				
				// thread 1 released lock on sharedObject
				thread1.resume();
				
				synchronized (sharedObject) {
					System.out.println(Thread.currentThread().getName() + " has obtained lock on sharedObject");
					System.out.println(Thread.currentThread().getName() + " has released lock on sharedObject");
				}
				System.out.println(Thread.currentThread().getName() + " has ENDED.");
			}

		};
		thread2.start();
	}
	
}
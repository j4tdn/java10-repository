package deadlock;

public class SuspendResumeDeadlockSolved {
	
	private static String shareObject = "abcxyz";
	
	public static void main(String[] args) throws InterruptedException {

		final Thread thread1 = new Thread("Thread-1") {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " has started.");
				synchronized (shareObject) {
					System.out.println(Thread.currentThread().getName() + " " + " has obtained lock on shareObject "
							+ " & suspended...");
					/*
					 * suspend the thread, now this thread will release lock on shareObject (by
					 * exiting synchronized block) only when resume() method is called on this
					 * thread, thread will go in waiting state.
					 */
					Thread.currentThread().suspend();

					System.out.println(Thread.currentThread().getName() + " " + " has released lock on shareObject");
				}
				System.out.println(Thread.currentThread().getName() + " has ENDED.");
			}

		};
		thread1.start();

		Thread.sleep(2000); // This delay ensures Thread-2 after Thread-1

		Thread thread2 = new Thread("Thread-2") {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " has started.");

				// Thread-1 is not going to release lock on shareObject
				// until resume() method is not called.

				/*
				 * for acquiring lock on shareObject thread-1 must have released lock on
				 * shareObject, if lock is not released, Thread-2 will keep on waiting for
				 * Thread-1 to release lock on shareObject & deadlock will be formed.
				 */
				System.out.println(Thread.currentThread().getName() + " is trying to obtain lock on shareObject");
				
				// thread1 released lock on shareObject
				thread1.resume();
				synchronized (shareObject) {
					System.out.println(Thread.currentThread().getName() + " has obtained lock on shareObject");
					System.out.println(Thread.currentThread().getName() + " has released lock on shareObject");
				}
				System.out.println(Thread.currentThread().getName() + " has ENDED.");
			}

		};
		thread2.start();
	}
	
}
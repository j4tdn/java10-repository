package mutable;

public class Ex03Task implements Runnable {
	// shared object
	private StringBuffer sb;

	public Ex03Task() {
		sb = new StringBuffer();
	}

	public void run() {
		for (int i = 1; i < 50000; i++) {
			sb.append("a");
		}

	}

	public static void main(String[] args) {
		Ex03Task task = new Ex03Task();

		Thread t0 = new Thread(task);
		t0.start();

		Thread t1 = new Thread(task);
		t1.start();
		try {
			//make sure thread main will be run in the end
			t0.join();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sb lengh: " + task.sb.length());
		System.out.println("value: " + task.sb.toString());
	}
}
package mutable;

public class Ex03Task implements Runnable {

	// shared object: with StringBuffer and StringBuilder
	private StringBuilder sb;

	public Ex03Task() {
		sb = new StringBuilder();
	}

	public void run() {
		for (int i = 1; i <= 5000; i++) {
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
			// make sure thread be run in the end
			t0.join();
			t1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("sb length " + task.sb.length());
		System.out.println("value");
	}

}

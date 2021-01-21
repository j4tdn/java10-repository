package mutable;

public class Ex03Task implements Runnable {
	// shared object
	private StringBuffer sbf;
	
	public Ex03Task() {
		sbf = new StringBuffer();
	}
		
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			sbf.append("a");
		}
	}
	
	public static void main(String[] args) {
		Ex03Task task = new Ex03Task();
		
		Thread t0 = new Thread(task);
		t0.start();
		
		Thread t1 = new Thread(task);
		t1.start();
		
		try {
			// make sure thread main will be run in the end
			t0.join();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sbf length: " + task.sbf.length());
		System.out.println("value: " + task.sbf.toString());
	}
}

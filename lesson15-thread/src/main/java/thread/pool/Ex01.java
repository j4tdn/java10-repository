package thread.pool;

import static utils.ThreadUtils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex01 {

	private static int capacity = 8;
	private static long start = 0;
	
	public static void main(String[] args) {
		List<Task> tasks = new ArrayList<>(16);
		
		for(int i = 0; i < capacity; i++) {
			tasks.add(new Task());
		}
		
		start = System.currentTimeMillis();
		// create thread pool
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("processors: " + processors);
		
		ExecutorService service = Executors.newFixedThreadPool(processors);
		for(Task task : tasks) {
			service.execute(task);
		}
		
		// shutdown threads in pool
		// service.shutdown()
		
	}
	
	private static class Task implements Runnable{
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running !!!");
			sleep(3);
			System.out.println(Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - start));
		}
	}
}

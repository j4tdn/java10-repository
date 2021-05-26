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

		// blocking queue tasks
		List<Task> tasks = new ArrayList<>(capacity);
		for (int i = 0; i < capacity; i++) {
			tasks.add(new Task());
		}

		start = System.currentTimeMillis();
		// create thread pool, singlr thread
		// ExecutorService service = Executors.newSingleThreadExecutor();

		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("processors: " + processors);
		ExecutorService service = Executors.newFixedThreadPool(processors);
		for (Task task : tasks) {
			service.execute(task);
		}
		// shutdown threads in pool
		service.shutdown();

		System.out.println("size: " + tasks.size());

	}

	private static class Task implements Runnable {
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running!!!");

			sleep(3);
			System.out.println(Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - start));

		}
	}

}

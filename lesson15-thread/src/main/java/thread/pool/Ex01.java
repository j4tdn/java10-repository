package thread.pool;

import static untils.ThreadUtils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex01 {

	private static int capacity = 16;

	public static void main(String[] args) {
		// blocking queue, tasks
		List<Task> tasks = new ArrayList<>(16);
		for (int i = 0; i < capacity; i++) {
			tasks.add(new Task());
		}

		// create thread pool, single thread
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("processors: " + processors);
		ExecutorService service = Executors.newFixedThreadPool(2);
		for (Task task : tasks) {
			service.execute(task);
		}

		// shutdown threads in pool
		service.shutdown();
	}

	private static class Task implements Runnable {

		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running ..");
			sleep(3);
		}
	}
}

package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex03 {
	private static final Random rd = new Random();
	private static int capacity = 10;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(4);
		List<Task> tasks = new ArrayList<>(capacity);
		for (int i = 0; i < 10; i++) {
			tasks.add(new Task());
		}
		for (Task task : tasks) {
			Future<Integer> future = service.submit(task);
			Integer value = future.get();
			System.out.println("value: " + value);
		}
		Future<String> future = service.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Wellcome to java 10";
			}
		});
		
	}

	private static class Task implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			// TODO Auto-generated method stub
			return rd.nextInt(100);
		}

	}
}

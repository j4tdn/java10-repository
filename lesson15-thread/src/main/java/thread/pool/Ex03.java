package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import utils.ThreadUtils;

public class Ex03 {
	private static int capacity = 10;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		ExecutorService service = Executors.newSingleThreadExecutor();
//		Future<String> future = service.submit(new Callable<String>() {
//
//			@Override
//			public String call() throws Exception {
//				return "Java 10";
//			}
//		});
//		String result = future.get();
//		System.out.println(result);
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		List<Task> tasks = new ArrayList<>(capacity);
		for (int i = 0; i < capacity; i++) {
			tasks.add(new Task());
		}
		
		for (Task task : tasks) {
			Future<Integer> future = service.submit(task);
			Integer result = future.get();
			System.out.println(result);
		}
		
	}
	
	private static class Task implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			return new Random().nextInt(100);
		}
		
	}
}

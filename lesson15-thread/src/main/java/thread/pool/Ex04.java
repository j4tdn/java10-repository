package thread.pool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Ex04 {
	private static int poolsize;
	private static ExecutorService service;
	static {
		poolsize = 1;
		service = Executors.newFixedThreadPool(poolsize);
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<List<Integer>> digitTask = new FutureTask<>(new Callable<List<Integer>>() {

			@Override
			public List<Integer> call() throws Exception {
				return Arrays.asList(1, 2, 3, 4, 5, 6);
			}
		}); 
		
		FutureTask<List<String>> textTask = new FutureTask<>(new Callable<List<String>>() {

			@Override
			public List<String> call() throws Exception {
				return Arrays.asList("a", "b", "c", "d");
			}
		});
		
		// service.submit
		runTasks(Arrays.asList(digitTask, textTask));
		
		// get result
		List<Integer> r1 =  digitTask.get();
		List<String> r2 =  textTask.get();
		
		System.out.println(r1.size() + " - " + r2.size());
	}

	private static void runTasks(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> service.submit(task));
	}
}

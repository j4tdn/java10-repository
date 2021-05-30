package quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

// decide which is being used before and after ClockJob
public class ClockJobListener implements JobListener{

	@Override
	public String getName() {
		return ClockJob.class.getSimpleName();
	}

	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		System.out.println("ClockJobListener >> jobToBeExecuted");
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		System.out.println("ClockJobListener >> jobExecutionVetoed");
	}

	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		System.out.println("ClockJobListener >> jobWasExecuted");
	}

}

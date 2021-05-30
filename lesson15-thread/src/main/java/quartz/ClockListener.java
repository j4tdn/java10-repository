package quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class ClockListener implements JobListener {

	@Override
	public String getName() {
		return ClockJob.class.getSimpleName();
	}

	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		System.out.println("ClockListener >>> jobToBeExecuted");
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		System.out.println("ClockListener >>> jobExecutionVetoed");		
	}

	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		System.out.println("ClockListener >>> jobWasExecuted");		
	}

}

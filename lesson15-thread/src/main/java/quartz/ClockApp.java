package quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class ClockApp {
	private static String JOB_NAME = ClockJob.class.getName();
	private static final String expression = "20 31 20 ? * *";

	public static void main(String[] args) throws SchedulerException {
		// Job(detail)
		JobDetail jobDetail = JobBuilder.newJob(ClockJob.class)
				.withIdentity(JOB_NAME)
				.build();

		// Trigger
		Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule(expression))
				.withIdentity(JOB_NAME)
				.build();

		// Scheduler: Job(detail), Trigger
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();


		// JobListenter
		scheduler.getListenerManager().addJobListener(new ClockJobListener());
	    
		scheduler.start();
		scheduler.scheduleJob(jobDetail, trigger);
	}

}

package quaetz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class ClockApp {
	
	private static final String JOB_NAME = ClockJob.class.getSimpleName();
	
	private static final String expression = "35 06 20 ? * SUN";
	public static void main(String[] args) throws SchedulerException {
		// Job(detail): job + Identity ( Jobkey(name + group) || name || name + group)
		JobDetail jobDetail = JobBuilder.newJob(ClockJob.class)
										.withIdentity(JOB_NAME)
										.build();
		
		// Trigger: TimeConfiger + Identity
		Trigger trigger = TriggerBuilder.newTrigger()
										.withSchedule(CronScheduleBuilder.cronSchedule(expression))
										.withIdentity(JOB_NAME)
										.build();
		// JobListener
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();

		// Scheduler: Job(detail), Trigger
		scheduler.getListenerManager().addJobListener(new ClockListener());
		
		scheduler.start();
		scheduler.scheduleJob(jobDetail, trigger);
	}
}
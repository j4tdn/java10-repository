package quartz;

import java.awt.Color;
import java.awt.Container;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class ClockJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("==========EXECUTING==========");
		ClockApp app = new ClockApp();
		app.setVisible(true);

	}

	public static class ClockApp extends JFrame {

		private Container con = getContentPane();

		public ClockApp() {
			initComponents();
		}

		private void initComponents() {
			setSize(400, 400);

			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);

			con.setBackground(Color.yellow);

			String text = "<html><span style='color:red; font-size: 18px'>Now is " + LocalDateTime.now()+ "</span></html>";

			JLabel lbTime = new JLabel(text);
			con.add(lbTime);
		}

	}

}

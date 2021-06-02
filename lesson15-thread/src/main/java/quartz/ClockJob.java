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

public class ClockJob implements Job{

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
System.out.println("================EXCUTING=================");		
	}
	ClockApp app=new ClockApp();
public static class ClockApp extends JFrame{
	private static final long serialVersionUID = 1938425785917082111L;
	
	private Container con = getContentPane();
	
	public ClockApp() {
		initComponents();
	}
private void initComponents() {
		setSize(400, 400);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		con.setBackground(Color.GREEN);
		
		String text = "<html><span style='color:red; font-size: 18px'>Now is " + LocalDateTime.now() + "</span></html>";
		
		JLabel lbTime = new JLabel(text);
		con.add(lbTime);
	}
}
}

package exercises;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class Ex07 {
	 public static void main(String[] args) {

	        String dateStart = "2019-11-21 15:33:25";

	        String dateStop = "2021-01-02 11:01:26";

	        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	        Date d1 = null;

	        Date d2 = null;

	        try {

	            d1 = format.parse(dateStart);

	            d2 = format.parse(dateStop);

	        } catch (Exception e) {

	        }

	        long diff = d2.getTime() - d1.getTime();

	        long diffSeconds = diff / 1000;

	        long diffMinutes = diff / (60 * 1000);

	        long diffHours = diff / (60 * 60 * 1000);
	       
	        System.out.println("Số giờ: " + diffHours + " hours.");
	        
	        System.out.println("Số phút: " + diffMinutes + " minutes.");

	        System.out.println("Số giây : " + diffSeconds + " seconds.");


	    }
	 
	    @SuppressWarnings("unused")
		private static void main() {
			LocalDateTime from = LocalDateTime.of(2001, 10, 26, 10, 30, 30);
			LocalDateTime to = LocalDateTime.of(2021, 01, 05, 9, 25, 26);
			Duration duration = Duration.between(from, to);
			System.out.println("Thời gian từ khi sinh ra đến hiện tại: " + duration.toDays() + " Ngày, "
					+ duration.toHours() + " Giờ ," + duration.toMinutes() + " Phút, "+ duration.toSeconds()+" Giây ");	
			}

}

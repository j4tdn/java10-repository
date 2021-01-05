package ex07;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ex07 {
	public static void main(String[] args) {
	LocalDateTime from = LocalDateTime.of(1999, 9, 23, 5, 00, 00);
	LocalDateTime to = LocalDateTime.of(2021, 1, 05, 12, 51, 00);
	Duration duration = Duration.between(from, to);
	System.out.println("Thời gian từ khi sinh ra đến hiện tại: " + duration.toDays() + " Ngày, "
			+ duration.toHours() + " Giờ ," + duration.toMinutes() + " Phút, "+ duration.toSeconds()+" Giây ");	
	}
}

package ex02;

import java.time.LocalTime;

public class Ex02 {
	public static void main(String[] args) {
		BedTime bedTime = new BedTime(22, new Time(1, 15), LocalTime.of(23, 55));

		try {
			System.out.println(getTimeWokeUp(bedTime));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static int getAverageTime(BedTime bedTime) throws Exception {
		int old = bedTime.getOld();
		if (old <= 0) {
			throw new Exception("Nhập sai tuổi");
		}
		if (old >= 1 && old <= 3) {
			return 20;
		} else if (old >= 4 && old <= 13) {
			return (10 + 12) / 2;
		} else if (old >= 14 && old <= 17) {
			return (8 + 10) / 2;
		} else if (old >= 18 && old <= 64) {
			return (7 + 9) / 2;
		} else {
			return (7 + 8) / 2;
		}
	}

	private static Time getNeedTime(BedTime bedTime) throws Exception {
		Time time = new Time();

		// convert to minute
		int timeSleeped = bedTime.getTime().getHour() * 60 + bedTime.getTime().getMinute();

		int avarageTime = getAverageTime(bedTime) * 60;

		int timeNeed = avarageTime - timeSleeped;

		time.setHour(timeNeed / 60);
		time.setMinute(timeNeed - (timeNeed / 60) * 60);
		return time;
	}

	private static LocalTime getTimeWokeUp(BedTime bedTime) throws Exception {
		LocalTime localTime = bedTime.getTimeSleep();
		Time time = getNeedTime(bedTime);
		localTime = localTime.plusHours(time.getHour());
		localTime = localTime.plusMinutes(time.getMinute());

		return localTime;
	}
}

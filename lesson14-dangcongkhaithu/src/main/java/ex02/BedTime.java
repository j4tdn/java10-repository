package ex02;

import java.time.LocalTime;

public class BedTime {
	private int old;
	private Time time;
	private LocalTime timeSleep;

	public BedTime(int old, Time time, LocalTime timeSleep) {
		this.old = old;
		this.time = time;
		this.timeSleep = timeSleep;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public LocalTime getTimeSleep() {
		return timeSleep;
	}

	public void setTimeSleep(LocalTime timeSleep) {
		this.timeSleep = timeSleep;
	}

	@Override
	public String toString() {
		return "BedTime [old=" + old + ", time=" + time + ", timeSleep=" + timeSleep + "]";
	}

	
}

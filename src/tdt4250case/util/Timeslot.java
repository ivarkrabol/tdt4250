package tdt4250case.util;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.time.Duration;
import java.time.LocalDate;

public class Timeslot {

	public static Timeslot parse(String text) {
		String dayOfWeekText = text.substring(0, 3);
		String startTimeText = text.substring(4, 9);
		String endTimeText = text.substring(10, 15);

		LocalTime startTime = LocalTime.parse(startTimeText, timeFormatter);
		LocalTime endTime = LocalTime.parse(endTimeText, timeFormatter);

		return new Timeslot(
				dayOfWeekMap.get(dayOfWeekText), 
				startTime, 
				Duration.between(startTime, endTime)
		);
	}

	private static DateTimeFormatter dayOfWeekFormatter = DateTimeFormatter.ofPattern("E"); 
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	private static Map<String, DayOfWeek> dayOfWeekMap = new HashMap<String, DayOfWeek>();

	static {
		LocalDate date = LocalDate.MIN;
		for(DayOfWeek dayOfWeek: DayOfWeek.values()) {
			String dayOfWeekString = date.with(dayOfWeek).format(dayOfWeekFormatter);
			dayOfWeekMap.put(dayOfWeekString, dayOfWeek);
		}
	}

	public final DayOfWeek dayOfWeek;
	public final LocalTime startTime;
	public final Duration duration;

	public Timeslot(DayOfWeek dayOfWeek, LocalTime startTime, Duration duration) {
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return LocalDate.MIN.with(dayOfWeek).format(dayOfWeekFormatter)
				+ " "
				+ startTime.format(timeFormatter)
				+ "-"
				+ getEndTime().format(timeFormatter);
	}

	public LocalTime getEndTime() {
		return startTime.plus(duration);
	}

	public boolean overlaps(Timeslot other) {
		return dayOfWeek == other.dayOfWeek
				&& getEndTime().isAfter(other.startTime)
				&& other.getEndTime().isAfter(startTime);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return obj == this
				|| (obj instanceof Timeslot
						&& ((Timeslot)obj).dayOfWeek.equals(dayOfWeek)
						&& ((Timeslot)obj).startTime.equals(startTime)
						&& ((Timeslot)obj).duration.equals(duration));
	}

}

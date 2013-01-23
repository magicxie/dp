package domains;

public class Period {

	private Day day;
	private TimeSlot timeSlot;
	
	public Day getDay() {
		return day;
	}

	public TimeSlot getTimeSlot() {
		return timeSlot;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public void setTimeSlot(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day + "-" + timeSlot;
	}
}

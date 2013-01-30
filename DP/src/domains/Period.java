package domains;

public class Period {

	private Day day;
	private Timeslot timeSlot;
	
	public Day getDay() {
		return day;
	}

	public Timeslot getTimeSlot() {
		return timeSlot;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public void setTimeSlot(Timeslot timeSlot) {
		this.timeSlot = timeSlot;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day + "-" + timeSlot;
	}
}

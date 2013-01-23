package domains;

import org.drools.planner.api.domain.entity.PlanningEntity;

@PlanningEntity
public class Lecture {

	private Course course;
	private Period period;
	private Room room;
	
	public Course getCourse() {
		return course;
	}
	public Period getPeriod() {
		return period;
	}
	public Room getRoom() {
		return room;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
}

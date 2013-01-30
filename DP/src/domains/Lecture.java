package domains;

import org.drools.planner.api.domain.entity.PlanningEntity;
import org.drools.planner.api.domain.variable.PlanningVariable;
import org.drools.planner.api.domain.variable.ValueRange;
import org.drools.planner.api.domain.variable.ValueRangeType;
import org.drools.planner.api.domain.variable.ValueRanges;

import weight.PeriodStrengthWeightFactory;

@PlanningEntity
public class Lecture {

	private Course course;
	private Period period;
	private Room room;
	
	public Course getCourse() {
		return course;
	}
	
	@PlanningVariable(strengthWeightFactoryClass = PeriodStrengthWeightFactory.class)
    @ValueRange(type = ValueRangeType.FROM_SOLUTION_PROPERTY, solutionProperty = "periodList")
	public Period getPeriod() {
		return period;
	}
	
	@PlanningVariable(strengthWeightFactoryClass = PeriodStrengthWeightFactory.class)
    @ValueRange(type = ValueRangeType.FROM_SOLUTION_PROPERTY, solutionProperty = "roomList")
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

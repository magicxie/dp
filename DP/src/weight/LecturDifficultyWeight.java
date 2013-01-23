package weight;


import org.apache.commons.lang.builder.CompareToBuilder;

import domains.Course;
import domains.Lecture;

public class LecturDifficultyWeight implements Comparable<LecturDifficultyWeight>{

	private Lecture lecture;
	private int unavailablePeriodPenaltyCount;
	
	public LecturDifficultyWeight(Lecture lecture, int unavailablePeriodPenaltyCount) {
		super();
		this.lecture = lecture;
		this.unavailablePeriodPenaltyCount = unavailablePeriodPenaltyCount;
	}

	@Override
	public int compareTo(LecturDifficultyWeight other) {
		Course course = lecture.getCourse();
        Course otherCourse = other.lecture.getCourse();
        return new CompareToBuilder()
                .append(unavailablePeriodPenaltyCount, other.unavailablePeriodPenaltyCount)
                .append(course.getHoursPerWeek() * course.getHoursPerWeek(),
                		otherCourse.getHoursPerWeek() * otherCourse.getHoursPerWeek())
                .append(course.getStudentSize(), otherCourse.getStudentSize())
                .toComparison();
	}

}

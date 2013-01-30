package move;

import org.drools.planner.core.score.director.ScoreDirector;

import domains.Lecture;
import domains.Period;
import domains.Room;

public class CurriculumCourseMoveHelper {
	 public static void movePeriod(ScoreDirector scoreDirector, Lecture lecture, Period period) {
	        scoreDirector.beforeVariableChanged(lecture, "period");
	        lecture.setPeriod(period);
	        scoreDirector.afterVariableChanged(lecture, "period");
	    }

	    public static void moveRoom(ScoreDirector scoreDirector, Lecture lecture, Room room) {
	        scoreDirector.beforeVariableChanged(lecture, "room");
	        lecture.setRoom(room);
	        scoreDirector.afterVariableChanged(lecture, "room");
	    }

	    public static void moveLecture(ScoreDirector scoreDirector, Lecture lecture, Period period, Room room) {
	        scoreDirector.beforeAllVariablesChanged(lecture);
	        lecture.setPeriod(period);
	        lecture.setRoom(room);
	        scoreDirector.afterAllVariablesChanged(lecture);
	    }
}

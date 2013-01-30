package move;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.drools.planner.core.heuristic.selector.move.factory.MoveListFactory;
import org.drools.planner.core.move.Move;
import org.drools.planner.core.solution.Solution;

import domains.CurriculumCourseSchedule;
import domains.Lecture;

public class LectureSwapMoveFactory implements MoveListFactory{

	@Override
	public List<Move> createMoveList(Solution solution) {
		CurriculumCourseSchedule schedule = (CurriculumCourseSchedule) solution;
        List<Lecture> lectureList = schedule.getLectureList();
        List<Move> moveList = new ArrayList<Move>();
        for (ListIterator<Lecture> leftIt = lectureList.listIterator(); leftIt.hasNext();) {
            Lecture leftLecture = leftIt.next();
            for (ListIterator<Lecture> rightIt = lectureList.listIterator(leftIt.nextIndex()); rightIt.hasNext();) {
                Lecture rightLecture = rightIt.next();
                if (!leftLecture.getCourse().equals(rightLecture.getCourse())) {
                    moveList.add(new LectureSwapMove(leftLecture, rightLecture));
                }
            }
        }
        return moveList;
	}

}

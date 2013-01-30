package move;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.drools.planner.core.move.Move;
import org.drools.planner.core.score.director.ScoreDirector;

import domains.Lecture;
import domains.Period;
import domains.Room;

public class LectureSwapMove implements Move {

	private Lecture leftLecture;
    private Lecture rightLecture;

    public LectureSwapMove(Lecture leftLecture, Lecture rightLecture) {
        this.leftLecture = leftLecture;
        this.rightLecture = rightLecture;
    }

    public boolean isMoveDoable(ScoreDirector scoreDirector) {
        return !(ObjectUtils.equals(leftLecture.getPeriod(), rightLecture.getPeriod())
                && ObjectUtils.equals(leftLecture.getRoom(), rightLecture.getRoom()));
    }

    public Move createUndoMove(ScoreDirector scoreDirector) {
        return new LectureSwapMove(rightLecture, leftLecture);
    }

    public void doMove(ScoreDirector scoreDirector) {
        Period oldLeftPeriod = leftLecture.getPeriod();
        Period oldRightPeriod = rightLecture.getPeriod();
        Room oldLeftRoom = leftLecture.getRoom();
        Room oldRightRoom = rightLecture.getRoom();
        if (oldLeftPeriod.equals(oldRightPeriod)) {
            CurriculumCourseMoveHelper.moveRoom(scoreDirector, leftLecture, oldRightRoom);
            CurriculumCourseMoveHelper.moveRoom(scoreDirector, rightLecture, oldLeftRoom);
        } else if (oldLeftRoom.equals(oldRightRoom)) {
            CurriculumCourseMoveHelper.movePeriod(scoreDirector, leftLecture, oldRightPeriod);
            CurriculumCourseMoveHelper.movePeriod(scoreDirector, rightLecture, oldLeftPeriod);
        } else {
            CurriculumCourseMoveHelper.moveLecture(scoreDirector, leftLecture, oldRightPeriod, oldRightRoom);
            CurriculumCourseMoveHelper.moveLecture(scoreDirector, rightLecture, oldLeftPeriod, oldLeftRoom);
        }
    }

    public Collection<? extends Object> getPlanningEntities() {
        return Arrays.asList(leftLecture, rightLecture);
    }

    public Collection<? extends Object> getPlanningValues() {
        return Arrays.<Object>asList(leftLecture.getPeriod(), leftLecture.getRoom(),
                rightLecture.getPeriod(), rightLecture.getRoom());
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof LectureSwapMove) {
            LectureSwapMove other = (LectureSwapMove) o;
            return new EqualsBuilder()
                    .append(leftLecture, other.leftLecture)
                    .append(rightLecture, other.rightLecture)
                    .isEquals();
        } else {
            return false;
        }
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(leftLecture)
                .append(rightLecture)
                .toHashCode();
    }

    public String toString() {
        return leftLecture + " <=> " + rightLecture;
    }
}

package domains;

import java.util.Collection;
import java.util.List;

import org.drools.planner.api.domain.solution.PlanningEntityCollectionProperty;
import org.drools.planner.api.domain.solution.PlanningSolution;
import org.drools.planner.core.score.buildin.hardandsoft.HardAndSoftScore;
import org.drools.planner.core.solution.Solution;

@PlanningSolution
public class CurriculumCourseSchedule implements Solution<HardAndSoftScore> {

	@Override
	public HardAndSoftScore getScore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScore(HardAndSoftScore score) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<? extends Object> getProblemFacts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@PlanningEntityCollectionProperty
	public List<Lecture> getLectureList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Room> getRoomList(){
		return null;
	}
	
	public List<Period> getPeriodList(){
		return null;
	}

}

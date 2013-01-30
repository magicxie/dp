package weight;

import org.drools.planner.core.heuristic.selector.common.decorator.SelectionSorterWeightFactory;

import domains.CurriculumCourseSchedule;
import domains.Period;

public class PeriodStrengthWeightFactory implements SelectionSorterWeightFactory<CurriculumCourseSchedule, Period>{

	@Override
	public Comparable createSorterWeight(CurriculumCourseSchedule solution,
			Period selection) {
		// TODO Auto-generated method stub
		return null;
	}

}

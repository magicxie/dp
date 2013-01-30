package app;

import java.io.File;

import org.drools.planner.benchmark.core.XStreamProblemIO;
import org.drools.planner.core.solution.ProblemIO;

import domains.CurriculumCourseSchedule;

public class Main {

	public static void main(String[] args) {
		ProblemIO io = new XStreamProblemIO(CurriculumCourseSchedule.class);
		io.read(new File(Main.class.getResource("../rules/curriculumCourseSolverConfig.xml").getPath()));
	}
}

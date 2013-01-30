package app;

import org.drools.planner.config.SolverFactory;
import org.drools.planner.config.XmlSolverFactory;

import factory.JsonSolverFactory;

public class Main {

	public static void main(String[] args) {
		String path = Main.class.getResource("../rules/curriculumCourseSolverConfig.xml").getPath();
//		SolverFactory sf = new JsonSolverFactory(path);
//		sf.buildSolver();
		XmlSolverFactory xf = new XmlSolverFactory("/rules/curriculumCourseSolverConfig.xml");
		xf.buildSolver();
	}
}

package io;
import java.io.File;

import org.drools.planner.core.solution.ProblemIO;
import org.drools.planner.core.solution.Solution;


public class JsonProblemIO implements ProblemIO {

	@Override
	public String getFileExtension() {
		// TODO Auto-generated method stub
		return "json";
	}

	@Override
	public Solution read(File inputSolutionFile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(Solution solution, File outputSolutionFile) {
		// TODO Auto-generated method stub

	}

}

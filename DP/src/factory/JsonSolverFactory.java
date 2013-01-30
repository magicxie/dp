package factory;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.drools.planner.config.SolverFactory;
import org.drools.planner.config.solver.SolverConfig;
import org.drools.planner.core.Solver;

public class JsonSolverFactory implements SolverFactory {

	private SolverConfig solverConfig = null;
	
	public JsonSolverFactory(String resource) {
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
		try {
			solverConfig = mapper.readValue(new File(resource), SolverConfig.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public SolverConfig getSolverConfig() {
		// TODO Auto-generated method stub
		return solverConfig;
	}

	@Override
	public Solver buildSolver() {
		if (solverConfig == null) {
            throw new IllegalStateException("The solverConfig (" + solverConfig + ") is null," +
                    " call configure(...) first.");
        }
		return solverConfig.buildSolver();
	}

}

package PatchRequest;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit4.Karate;

@RunWith(Karate.class)
public class ParallelExecution {
	
	public void testParallel() {
        Results results = Runner.path("classpath:PatchRequest").tags("~@ignore").parallel(1); 
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
        
	    }

}

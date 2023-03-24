package POSTRequest;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit4.Karate;

@RunWith(Karate.class)
public class Execution {

	
	public void testParallel() {
        Results results = Runner.path("classpath:POSTRequest").parallel(5);  
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
        
	    }
	
}

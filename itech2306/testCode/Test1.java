package testCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}

public class TestRunner {
	   public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestJunit.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
	}

public class RuleExceptionTester {

	  @Rule
	  public ExpectedException exception = ExpectedException.none();

	  @Test
	  public void throwsIllegalArgumentExceptionIfIconIsNull() {
	    exception.expect(IllegalArgumentException.class);
	    exception.expectMessage("Negative value not allowed");
	    ClassToBeTested t = new ClassToBeTested();
	    t.methodToBeTest(-1);
	  }
	}

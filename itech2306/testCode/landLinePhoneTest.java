package testCode;
import itech2306.domain.*;
import itech2306.domain.LandlineUsage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class landLinePhoneTest {

	private int localRate;
	@Test
	void test();{
		// expected value
		// assuming total cost is 100
		double totalCost = 100;
		int distanceRate = 5;
		int numberOfLocalCalls = 5;
		int minutesLocalCalls = 5;
		int numberOfDistanceCalls = 2;
		int minutesDistanceCalls = 3;
		
		int calculateDistanceCost = distanceRate * minutesDistanceCalls;
		Object calculateLocalCost = localRate * numberOfLocalCalls;
		double expectedValue = calculateDistanceCost + calculateLocalCost;
		
		
		// actual value
		LandlineUsage testUsage = new LandlineUsage();
		testUsage.setNumberOfLocalCalls(5);
		testUsage.setMinutesDistanceCalls(5);
		double actualValue = testUsage.totalCost;
		System.out.println("Actual value = "+actualValue +"\n"+ "Expected value = "+ expectedValue);
		assertEquals(expectedValue,actualValue,);
	}
	
}

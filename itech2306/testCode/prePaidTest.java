package testCode;
import itech2306.domain.LandlineUsage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class prePaidTest {

	@Test
	void test();{
		// expected value
		// assuming total cost is 100
		double totalCost;
		int dataUsed = 5;
		int minutesUsed = 5;
		int dataRate = 10;
		int minutesRate = 15;
		int dataCost ;
		int minutesCost;
		
		calculateDataCost = dataRate * dataUsed;
		calculateMinutesCost = minutesRate * minutesUsed;
		double expectedValue = calculateDataCost + calculateMiutesCost;
		
		
		// actual value
		showCostTest = new calculateAndShowPrePaidCost();
		showCostText.setMinutesUsed(5);
		showCostText.setdataUsed(5);
		double actualValue = showCostText.totalCost;
		System.out.println("Actual value = "+actualValue +"\n"+ "Expected value = "+ expectedValue);
		// assertion
		assertEquals(expectedValue,actualValue,);
	}
	
}

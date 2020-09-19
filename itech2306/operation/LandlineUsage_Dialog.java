package operation;

import java.util.Scanner;

import itech2306.domain.LandlinePhonePlan;
import itech2306.domain.LandlineUsage;
import itech2306.domain.Usage;

public class LandlineUsage_Dialog extends UsageUpdater {

	private LandlineUsage usageData;
	
	LandlinePhonePlan phonePlan;
	
	public LandlineUsage_Dialog(LandlinePhonePlan plan)
	{
		this.phonePlan = plan;
	}

	public void performDialog()
	{
		inputPeriodUsageDetails();
		calculateAndShowCost();
	}
	
	@Override
	protected void inputPeriodUsageDetails() {
		Scanner scan = getScanner();		// Accesses from the ancestor class "FunctionalDialog".
		
		// Ask how many local calls were made
		int localCalls = obtainIntInput(999, "How many local calls were made during the period?");
		
		int distanceCalls = obtainIntInput(999, "How many minutes were used for long-distance calls?");
		
		usageData = new LandlineUsage(localCalls,distanceCalls);
	}

	/**
	 * Calculate the cost of the service usage, based on the already set usage amounts, for a plan specified in the parameters.
	 * It will generate the invoice and display the component costs then the total cost.
	 *  
	 * @param ppPlan The particular Plan that describes the rates to be used for the components of the service.
	 * @return The total cost based on usage data and plan's rates.
	 */
	protected float calculateAndShowCost()
	{
		float totalCost = 0.0f;
		float component;
		
		// Calculate component cost of local calls:
		component = usageData.calculateLocalCost(phonePlan);
		System.out.println("  Local Calls: " + usageData.getNumberOfLocalCalls() + " at rate " + phonePlan.getLocalRate() + " = $" + component);
		totalCost = totalCost + component;
		
		// Calculate component cost of distance calls:
		component = usageData.calculateDistanceCost(phonePlan);
		System.out.println("  Distance Calls: " + usageData.getMinutesDistanceCalls() + " at rate " + phonePlan.getDistanceRate() + " = $" + component);
		totalCost = totalCost + component;
		
		// Add on the base monthly fee (service fee)
		System.out.println("  Service Provision fee: $" + phonePlan.getBaseCost());
		totalCost = totalCost + phonePlan.getBaseCost();
		
		System.out.println("  TOTAL for month: $" + totalCost);
		return totalCost;
	}
	


}

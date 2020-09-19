package operation;

import java.util.Scanner;

import itech2306.domain.LandlinePhonePlan;
import itech2306.domain.LandlineUsage;
import itech2306.domain.Usage;

public class PrePaidUsage_Dialog extends UsageUpdater {

	private PrePaidUsage usageData;
	
	PrePaidPlan pPlan;
	
	public PrePaidUsage_Dialog(PrePaidplan plan)
	{
		this.prePaid = plan;
	}

	public void performDialog()
	{
		inputMinutesUsageDetails();
		calculateAndShowPrePaidCost();
	}
	
	@Override
	protected void inputMinutesUsageDetails() {
		Scanner scan = getScanner();		// Accesses from the ancestor class "FunctionalDialog".
		
		// Ask how many data  were used
		int dataUsed = obtainIntInput(999, "How many GIBI of data was used during the period?");
		
		int minutesUsed = obtainIntInput(999, "How many minutes were used during the period?");
		
		usagePostpaid = new PrepaidUsage(dataUsed,minutesUsed);
	}

	
	protected float calculateAndShowPrePaidCost()
	{
		float totalCost = 0.0f;
		float component;
		
		// Calculate component cost of data used:
		component = usageData.calculateDataCost(prePaid);
		System.out.println("  data used:  " + usageData.getDataUsed() + " at rate " + prePaid.getDataRate() + " = $" + component);
		totalCost = totalCost + component;
		
		// Calculate component cost of minutes:
		component = usageData.calculateMinutesCost(prePaid);
		System.out.println("  Minutes used: " + usageData.getMinutesUsed() + " at rate " + phonePlan.getMinutesRate() + " = $" + component);
		totalCost = totalCost + component;
		
		System.out.println("  TOTAL for month: $" + totalCost);
		return totalCost;
	}
	


}

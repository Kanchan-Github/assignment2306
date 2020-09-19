package domain2;


/**
 * A class to represent information about the usage of a Premises-phone service for a given billing period.
 * @author Shane Moore
 *
 */
public class LandlineUsage extends Usage {
	// How many local calls were made during the period
	private int numberOfLocalCalls;
	
	// How many minutes were spent on long distance calls
	private int minutesDistanceCalls;
	
	public LandlineUsage(int localNumber, int distanceMinutes)
	{
		setNumberOfLocalCalls(localNumber);
		setMinutesDistanceCalls(distanceMinutes);
	}
	
	/**
	 * Set/Reset the number of local calls during the usage period.
	 * @param numberLocalCalls How many local calls to be noted.
	 */
	public void setNumberOfLocalCalls(int numberLocalCalls)
	{
		if (numberLocalCalls >= 0)
			this.numberOfLocalCalls = numberLocalCalls;
		else
			this.numberOfLocalCalls = 0;
	}
	
	/**
	 * Set/Reset the number of minutes spent in long-distance calls during the usage period.
	 * @param distanceMinutes The number of minutes to be noted.
	 */
	public void setMinutesDistanceCalls(int distanceMinutes)
	{
		if (distanceMinutes >= 0)
			this.minutesDistanceCalls = distanceMinutes;
		else 
			this.minutesDistanceCalls = 0;
	}
	/**
	 * Reports how many local calls were made during period. 
	 */
	public int getNumberOfLocalCalls()
	{
		return numberOfLocalCalls;
	}
	
	/**
	 * Tells how many minutes were spent on long-distance calls 
	 */
	public int getMinutesDistanceCalls()
	{
		return minutesDistanceCalls;
	}
	
	/**
	 * For a given phone plan (on-premises landline plans), calculate the cost of the Local calls as represented by this Usage object.
	 * @param ppPlan The plan specifying charge rates.
	 * @return The cost incurred for local calls
	 */
	public float calculateLocalCost(LandlinePhonePlan ppPlan)
	{
		return ppPlan.getLocalRate() * getNumberOfLocalCalls();
	}
	
	/**
	 * For a given phone plan (on-premises landline plans), calculate the cost of the Long Distance calls as represented by this Usage object.
	 * @param ppPlan The plan specifying charge rates.
	 * @return The cost incurred for long distance calls
	 */
	public float calculateDistanceCost(LandlinePhonePlan ppPlan)
	{
		return ppPlan.getDistanceRate() * getMinutesDistanceCalls();
	}
	
	/**
	 * Calculate the cost of the service usage, based on the already set usage amounts, for a plan specified in the parameters.
	 * It will generate the invoice and display the component costs then the total cost.
	 *  
	 * @param ppPlan The particular Plan that describes the rates to be used for the components of the service.
	 * @return The total cost based on usage data and plan's rates.
	 */
	public float calculateAndShowCost(LandlinePhonePlan ppPlan)
	{
		float totalCost = 0.0f;
		float component;
		
		// Calculate component cost of local calls:
		component = calculateLocalCost(ppPlan);
		System.out.println("  Local Calls: " + getNumberOfLocalCalls() + " at rate " + ppPlan.getLocalRate() + " = $" + component);
		totalCost = totalCost + component;
		
		// Calculate component cost of distance calls:
		component = calculateDistanceCost(ppPlan);
		System.out.println("  Distance Calls: " + getMinutesDistanceCalls() + " at rate " + ppPlan.getDistanceRate() + " = $" + component);
		totalCost = totalCost + component;
		
		// Add on the base monthly fee (service fee)
		System.out.println("  Service Provision fee: $" + ppPlan.getBaseCost());
		totalCost = totalCost + ppPlan.getBaseCost();
		
		System.out.println("  TOTAL for month: $" + totalCost);
		return totalCost;
	}
}

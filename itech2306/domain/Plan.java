 package domain2;

/**
 * A Plan represents details about a service that a customer is able to arrange a contract for. 
 * 
 *
 */
public class Plan {
	
	private String description;		// Describes the plan
	private float baseCost;			// The minimum cost per period for this plan 
	
	public Plan(String description, float baseCost)
	{
		this.description = description;
		this.baseCost = baseCost;		
	}
	
	/**
	 * Gives back a string describing the plan, e.g. the "$30 PhoneSaver Plan (10G data included)"
	 * 
	 */
	public String getDescription()
	{
		return description;
	}

	
	/**
	 * Gives back the basic minimum cost of this Plan (for the period covered by 'days').
	 * @return
	 */
	public float getBaseCost()
	{
		return baseCost;
	}
	
	/**
	 * Gives back a number signifying how many days between billing, or how long a charge of a prepaid service lasts.
	 * @return 0 means Same date each month, but anything larger means exact number of days.
	 */
	public int getPeriodDays()
	{
		return 0;			// 0 means Same date each month. Anything larger means exact number of days
	}
	
	/**
	 * Tells of how many minutes of talking is included in the plan's quota.
	 * If 0, then no talk is possible (e.g. Premises Internet only, or a mobile plan where every minute is charged at a rate)
	 */
	public int getIncludedTalkMinutes()
	{
		return 0;
	}
	
	/**
	 * Tells of how many GB data is included in the plan's quota.
	 * If 0, then no data is possible (e.g. premises phone only)
	 */
	public float getIncludedMaxData()
	{
		return 0;
	}
	
	/**
	 * Gives the rate at which excess minutes of talk (above the included quota) 
	 * are charged at (for mobile phone plans).
	 */
	public float getExcessTalkRate()
	{
		return 0;
	}
	
	/**
	 * Gives the rate at which  
	 */
	public float getExcessDataRate()
	{
		return 0;
	}
}

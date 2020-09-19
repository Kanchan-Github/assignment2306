package domain2;

import itech2306.operation.UsageUpdater;

public abstract class Service {
	private String typeOfService;	// A string describing the type of service this object is representing

	private Plan   servicePlan;		// The Plan on offer for this service (specifies charge rates, quotas)
	
	public Service(String type, Plan rates)
	{
		this.typeOfService = type;
		this.servicePlan = rates;
	}
	
	public Plan getServicePlan()
	{
		return servicePlan;
	}
	
	/**
	 * Needs to return a class that is able to receive a Scanner, to obtain input regarding usage of the service.
	 * @return
	 */
	public abstract UsageUpdater getUsageUpdater();
	
}

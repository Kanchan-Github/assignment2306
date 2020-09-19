package domain2;

import itech2306.operation.UsageUpdater;
import itech2306.operation.LandlineUsage_Dialog;

/** Represents a service of the premises-based phone service.
 * 
 */
public class LandlinePhoneService extends Service {
	LandlinePhoneService(Plan ratesPlan)
	{
		super("Landline phone service to premises",ratesPlan);
	}

	@Override
	public UsageUpdater getUsageUpdater() {
		return new LandlineUsage_Dialog( (LandlinePhonePlan) getServicePlan() );
	}
	
}

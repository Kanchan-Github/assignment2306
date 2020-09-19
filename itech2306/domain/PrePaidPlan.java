package domain2;

public class PrePaidPlan extends Plan {
	private float callLimitMinutes; // limitation of call in minutes
	private float dataLimitGb;  // limitation of data in GB
	
	public PrePaidPlan(String description, float rechargingCost, float callLimit, float dataLimit) {
		super(description, rechargingCost);
		this.callLimitMinutes = callLimit;
		this.dataLimitGb = dataLimit;
	}
	public float getCallLimit()
	{
		return callLimitMinutes;
	}
	public float getDataLimitGb()
	{
		return dataLimitGb;
	}
}

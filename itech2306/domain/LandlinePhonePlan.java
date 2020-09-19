package domain2;

/**
 * This describes a specialisation of Plan to cater for Phone services provided to premises (landlines).
 * @author Shane Moore
 */
public class LandlinePhonePlan extends Plan {
	private float localRate;			// The rate for local calls (per call)
	private float distanceRate;			// The rate for distance calls (per minute)
	
	public LandlinePhonePlan(String description,float monthlyBaseCost, float localCallRate, float distanceCallRate)
	{
		super(description,monthlyBaseCost);
		this.localRate = localCallRate;
		this.distanceRate = distanceCallRate;
	}
	
	public float getLocalRate()
	{
		return localRate;
	}
	
	public float getDistanceRate()
	{
		return distanceRate;
	}
}

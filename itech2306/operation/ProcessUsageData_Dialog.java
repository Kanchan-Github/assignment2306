package operation;

import itech2306.domain.Customer;

public class ProcessUsageData_Dialog extends FunctionalDialog {
	private Customer theCustomer;
	
	public ProcessUsageData_Dialog(Customer customer)
	{
		this.theCustomer = customer;
	}
	
	@Override
	protected void performDialog() {
		System.out.println("Not yet implemented.");
		
		// It will need to examine the customer's contract, to find what type of service it is for
		// and then based on the service, will call some other methods. 
		// For example, if the service was a LandlinePhoneService, the next steps might be:
		//   UsageUpdater uu = theLandlineService.getUsageUpdater();	//	to obtain the UsageUpdater for it
		//   uu.performDialog();										//  to cause the usage updater dialog to commence.
	}

}

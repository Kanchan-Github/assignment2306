package domain2;

import javax.print.DocFlavor.STRING;

/**
 * The purpose of this class is to represent a customer's current contract with the telecom company
 * for a particular plan
 * 
 */
public class BillingContract extends Customer {

	// Students to add fields and methods here.
	
	public class CreateContract_Dialog extends FunctionalDialog {
		private int serviceType;
		//private static final int maxContract = 1;  // user can have more contract
		private static int(6) contractId;
		private static int period;   // time of contract in months

		public CalculatePropertyTypeRates(Scanner console) {
		super(MAX_NO_USER_INPUTS, console);
		}
		
	}
		private static final int
				 prePaid = 1,
				 postPaid = 2,
				 landLinePhone = 3,
				 internet = 4,
				 end = 0;
	private static final int maxServiceType = 4;
	private static final String serviceTypePrompt = "type of service " +
											prePyyaid + ". prepaid \n" +
											postPaid + ". postpaid \n" +
											landLinePhone + ". landlinephone \n" +
											internet + ". internet \n" +
											end + ".  To exit";
	public void addServices(system.in) {
		Scanner scanner = new Scanner();
		services.add(string system.in);
		service.add(scanner.next());
	}
//Service newServiceSTRING Service();
	ArrayList<string> services =  new ArrayList<string>();
public void BillingContract(String name, int serviceType, int period) {   // customers contract
	System.out.Println( "hi" + name +  " your current contract is " servicetype + "for time period of" + period);
}

	
}

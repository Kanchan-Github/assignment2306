package operation;

import domain.Plan;

public class ShowServices_Dialog  extends FunctionalDialog {
	private int choice;
	private boolean stillRunning;

	@Override
	protected void performDialog() {
		System.out.println("Not Implemented Yet");
	}
// sub menu 2 for displaying available services cost & quotas
	
	public void operateServicesMenu() {
		console = new Scanner(System.in);
		stillRunning = true;
		while (stillRunning)
		{
			showServicesMenu();
			choice = getUserSelection(0,4);
			processChoiceServicesMenu(choice);
		
		}
		console.close();
	}
	private void showServicesMenu(){
	
		// category of services/ one plan each
	System.out.println("Select from the category of service");
	System.out.println("1.  Internet Service");
	System.out.println("2.  Landline Phone Service");
	System.out.println("3.  Pre-paid mobile service");
	System.out.println("4.  post-paid mobile servce");
	System.out.println("0.  Exit Program");
	}
	
	//private void processChoiceServicesMenu(int typeOfService) {
		//Service s = null;
		//switch(typeOfService)
		
	public void Service(String type, Plan rates){
		
	switch (type)
	{
		case 1;
		internetService();
		break;
		case 2;
		landLinePhoneService();
		break;
		case 3;
		prePaidMobileService();
		break;
		case 4;
		postPaidMobileService();
		break;
		case 0:
			System.out.println("Exiting the system...");
			System.out.print(ESC + "2J"); 
			stillRunning = false;
			break;
		default:
			System.out.println("Unexpected selection made. Doing nothing.");
			break;
		}
	getUserSelection();
	}
}

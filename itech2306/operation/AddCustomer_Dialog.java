package operation;
import java.util.Scanner;
import domain.*;

public class AddCustomer_Dialog extends FunctionalDialog {
	private int choice;
	// arraylist for adding customer
	
	ArrayList<String> customer = new ArrayList<String>();
	@Override
	protected void performDialog() {
		System.out.println("Not Implemented Yet");
	}

//sub-menu 1 for adding new customer

	public void operateAddCustomerMenu() {
		console = new Scanner(System.in);
		stillRunning = true;
		while (stillRunning)
		{
			showCustomerMenu();
			choice = getUserSelection(0,3);
			processChoiceMainMenu(choice);
		
		}
		console.close();
	}
	private void showCustomerMenu() {
		System.out.println("Enter your details here:");
		System.out.println("1. Enter your Name");
		System.out.println("2. enter your address");
		System.out.println("3. Type of service customer: Business or Personal");
		System.out.println("0.  Exit Program");
	}
	private void processCustomerMenu(int choice) {
		
	}
	Customer c = new Customer();
	
	switch (choice)
	{
		case 1:
			c.setName();
			break;
		case 2:
			c.setAddress();
			break;
		case 3:
			c.setService();
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
	if (service = business) { // get name of business and responsible contact if it is business customer
		getBusinessName();
		setBusinessName();
		getBusinessResponsibleContact();
		setBusinessResponsibleContact();
	}
	else {  // record id if individual person
		getId();
		setId();
	}
	getUserSelection();
}

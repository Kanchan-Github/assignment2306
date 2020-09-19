package itech2306.operation;

/**
 * 
 * @author Shane Moore
 *
 */
public class BillingSystem {

	public static void main(String[] args) {
		BillingSystem ms = new BillingSystem();
		ms.startApplication();
	}

	private void startApplication() {
		MainMenu mm = new MainMenu();
		mm.operateMenu();	
	}

}

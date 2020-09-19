package operation;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * @author Tom Keogh; Shane Moore
 *
 */
public abstract class FunctionalDialog {
	protected static Scanner console;
	protected boolean stillRunning;

	private static final NumberFormat MYFORMAT = NumberFormat.getNumberInstance();


	public FunctionalDialog() {
		// Nothing done here any more (Sane adjusted this. Please leave it as it is).
	}

	/** This method is required to actually perform the conversation with the user to get the inputs. */
	protected abstract void performDialog();{
		System.out.println("Input the options");
	}
	

	
	private boolean getStillRunning() {
		return this.stillRunning;
	}

	protected void setStillRunning(boolean b) {
		this.stillRunning = b;
	}

	protected int obtainIntInput(int max, String prompt) {
		System.out.println(prompt);
		return validateInt(0, max);
	}

	protected double obtainDoubleInput(double max, String prompt) {
		System.out.println(prompt);
		return validateDouble(100.00, max);
	}

	protected boolean obtainBooleanInput(String prompt) {
		System.out.println(prompt);
		return validateBoolean();
	}
	
	private int validateInt(int min, int max) {
		int userInput;
		do {
			System.out.print("Enter a selection ("+min + "-" + max +"):");
			if (!getScanner().hasNextInt())
				userInput = max+1;
			else
				userInput = getScanner().nextInt();	// obtain the input
			getScanner().nextLine();					// gets rid of the newline after the number we just read
			if (userInput < min || userInput > max)
				System.out.println("Invalid choice.");
		} while (userInput < min || userInput > max);
		System.out.println();		// put a space before the next output	
		return userInput; 

	}
	
	private double validateDouble(double min, double max){
		double userInput;
		do {
			MYFORMAT.setMinimumFractionDigits(2);
			MYFORMAT.setMaximumFractionDigits(2);
			System.out.print("Enter a selection ("+ MYFORMAT.format(min) + "-" + MYFORMAT.format(max) +"):");

			if (!getScanner().hasNextDouble())
				userInput = max+0.01;
			else
				userInput = getScanner().nextDouble();	// obtain the input
			getScanner().nextLine();					// gets rid of the newline after the number we just read
			if (userInput < min || userInput > max)
				System.out.println("Invalid choice.");
		} while (userInput < min || userInput > max);
		System.out.println();		// put a space before the next output	
		return userInput; 

	}
	
	private boolean validateBoolean(){
		boolean userInput;
		System.out.print("Enter a selection -(true or false)");

		if (!getScanner().hasNextBoolean()) {
			userInput = false;
			System.out.println("Invalid choice. Assuming false.");
		}	
		else
			userInput = getScanner().nextBoolean();	// obtain the input
		getScanner().nextLine();					// gets rid of the newline after the input we just read
		System.out.println();		                // put a space before the next output	
		return userInput; 

	}

	// HELPER METHODS FOR SCANNER

	/**
	 * The following will give you a reference to a shared Scanner object
	 */
	private static Scanner getScannerInstance()					// Implements what is called the 'singleton' pattern.
	{
		if (console == null) {
			console = new Scanner(System.in);
		}
		return console;
	}

	protected Scanner getScanner() {		// Ideally replace all occurrences of this, with the above method instead.
		return getScannerInstance();
	}
	

}

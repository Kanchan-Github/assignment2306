package itech2306.operation;

import itech2306.domain.*;
import java.util.Scanner;
/**
 * This class is responsible for handling the interactions of the user, for the process
 * of performing the menu option relating to processing usage for the billing period or recharge period.
 * 
 */
public class BillCalculation extends FunctionalDialog {

	private Customer customer;
	
	public BillCalculation(Customer aCustomer) {
		super();
		this.customer = aCustomer; 
	}
	
	@Override
	protected void performDialog() {
		System.out.println("Process Usage for the service period");		// a title
		
		Service selectedService = null;
		// [INSERT HERE: Obtain the type of service for the customer.]
		
		UsageUpdater updater = selectedService.getUsageUpdater();
		
		updater.performDialog();ok
		
		
	}

	
}

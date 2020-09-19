package operation;

import java.util.Scanner;
import itech2306.domain.Usage;

/**
 * A UsageUpdater is a special type of class, that provides methods that are used for obtaining input, to create
 * an object representing the usage of a service in a given month.
 * @author Shanem
 *
 */
public abstract class UsageUpdater extends FunctionalDialog {

	/**
	 * This method will guide the user through supplying the information about usage
	 */
	protected abstract void inputPeriodUsageDetails();

	
	
}
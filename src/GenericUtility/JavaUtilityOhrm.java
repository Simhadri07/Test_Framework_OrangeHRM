package GenericUtility;

import java.util.Random;

/**
 * This class is for all generic methods from java
 * @author schat
 *
 */
public class JavaUtilityOhrm {
/**
 * This is a generic method for random number
 * @return
 */
	public int getRandomNumber() {
	Random Number = new Random();
	int num = Number.nextInt(1000);
	return num;
		
	}
}

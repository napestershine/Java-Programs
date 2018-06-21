import java.util.*;

/**
 * Generate random number in java
 */

/**
 * @author shine
 *
 */
public class GenerateRandomNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rNum = new Random();

		/**
		 * Below code would generate 10 random numbers between 0 and 100
		 */
		System.out.println("Random numbers are generated below : ");

		for (int counter = 1; counter <= 10; counter++) {
			System.out.println(rNum.nextInt(100));
		}

	}

}

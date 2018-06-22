import java.util.Scanner;

/**
 * Print prime numbers in java
 */

/**
 * @author Shine
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0, num = 0;

		System.out.println("Input your number to which you want to print all prime numbers and press enter : ");

		// Capture user input
		Scanner s = new Scanner(System.in);

		int boundryNum = s.nextInt();

		// print numbers

		for (i = 0; i <= boundryNum; i++) {
			int counter = 0;

			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				System.out.println(i + " is prime number");
			}
		}
		s.close();

	}

}

import java.util.Scanner;

/**
 * Reverse a number in Java with for loop
 */

/**
 * @author shine
 *
 */
public class ReverseNumUsingForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0, tempNum, reverseNum = 0;

		System.out.println("Enter a number and press enter : ");

		// capture user input
		Scanner sc = new Scanner(System.in);

		// store number in num
		tempNum = num = sc.nextInt();

		for (; num != 0;) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num % 10;
			num = num / 10;
		}

		System.out.println("Reverese nunber is : " + reverseNum);
	}

}

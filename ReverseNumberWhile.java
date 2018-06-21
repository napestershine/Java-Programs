
/**
 * Reverse a number using while loop
 */
import java.util.*;

/**
 * @author shine
 *
 */
public class ReverseNumberWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0, tempNum, reverseNum = 0;
		System.out.println("Enter your number and press enter : ");

		// This statement will capture user input after pressing enter
		Scanner in = new Scanner(System.in);

		// Entered input would be stored in number num
		tempNum = num = in.nextInt();

		// While loop; find out the reverse
		while (num != 0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num % 10;
			num = num / 10;

		}

		System.out.println(" Reverse of Input number " + tempNum + " is " + reverseNum);
	}

}

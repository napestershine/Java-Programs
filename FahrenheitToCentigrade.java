import java.util.Scanner;

/**
 * Convert Fahrenheit to Centigrade in Java
 */

/**
 * @author shine
 *
 */
public class FahrenheitToCentigrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float fah;
		double cel;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature in Fahrenheit : ");

		fah = sc.nextFloat();
		cel = (fah - 32) / 1.8;

		System.out.println("Tempertaure in Cenitgrade is " + cel);
	}

}

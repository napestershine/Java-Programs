/**
 * Calculate average of all array elements
 */

/**
 * @author shine
 *
 */
public class CalculateAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// define an array and initialize with values

		int[] array = { 2, 5, 6, 8, 99, 102 };

		/**
		 * Average value of array elements would be sum of all elements / total number
		 * of elements
		 */

		// calculate sum of all elements
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		// calculate average value
		float average = sum / array.length;

		System.out.println("Average is : " + average);

	}

}

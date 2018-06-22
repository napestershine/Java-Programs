/**
 * Find Largest and Smallest number in an Array
 */

/**
 * @author shine
 *
 */
public class FindLargestSmallestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// array of 10 numbers
		int[] numbers = { 88, 99, 67, 12, 98, 77, 98, 12, 21 };

		// assign first element of array to largest and smallest

		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("Largest number is : " + largest);
		
		System.out.println("Smallest number is : " + smallest);

	}

}

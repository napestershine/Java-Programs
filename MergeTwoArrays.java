import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 101, 102, 103, 104, 105 };

		int[] merge = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			merge[i] = array1[i];
		}

		for (int i = 0; i < array2.length; i++) {
			merge[i + array1.length] = array2[i];
		}

		System.out.println(Arrays.toString(merge));

	}

}

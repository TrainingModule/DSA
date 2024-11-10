package arrays;

import java.util.Arrays;

import utilities.GetValues;
import utilities.Logging;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logging log = new Logging(BubbleSort.class.getName());
		int[] unsortedArray = GetValues.getArrayFromUser(log);
		log.info("Before sorting \n");
		log.info(Arrays.toString(unsortedArray));

		doBubblesort(unsortedArray);

		log.info("After sorting: \n");
		log.info(Arrays.toString(unsortedArray));
	}

	/**
	 * @param unsortedArray
	 * @param log
	 */
	private static void doBubblesort(int[] unsortedArray) {
		boolean swapped;

		for (int i = 0; i < unsortedArray.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < unsortedArray.length - 1 - i; j++) {

				if (unsortedArray[j] > unsortedArray[j + 1]) {
					swapValues(unsortedArray, j, j + 1);
					swapped = true;
				}
			}

			if (!swapped)
				break;
		}

	}

	/**
	 * @param unsortedArray
	 * @param i
	 * @param j
	 */
	private static void swapValues(int[] unsortedArray, int i, int j) {
		int temp = unsortedArray[j];
		unsortedArray[j] = unsortedArray[i];
		unsortedArray[i] = temp;

	}

}

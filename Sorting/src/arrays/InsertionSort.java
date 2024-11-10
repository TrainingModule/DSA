package arrays;

import java.util.Arrays;

import utilities.GetValues;
import utilities.Logging;

public class InsertionSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logging log = new Logging(BubbleSort.class.getName());
		int[] unsortedArray = GetValues.getArrayFromUser(log);
		log.info("Before sorting \n");
		log.info(Arrays.toString(unsortedArray));

		doInsertionSort(unsortedArray);

		log.info("After sorting: \n");
		log.info(Arrays.toString(unsortedArray));
	}

	private static void doInsertionSort(int[] unsortedArray) {
		for (int i = 1; i < unsortedArray.length; i++) {
			int compareNum = unsortedArray[i];
			int j = i-1;
			while(j>=0 && unsortedArray[j]>compareNum) {
				unsortedArray[j+1] = unsortedArray[j];
				j = j-1;
			}
			unsortedArray[j+1] = compareNum;
		}
	}
}

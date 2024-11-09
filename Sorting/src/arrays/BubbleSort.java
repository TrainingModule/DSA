package arrays;

import java.util.logging.Logger;

public class BubbleSort {


	public static void main(String[] args) {
		int[] unsortedArray = {9,5,7,5,4};
		Logger log = Logger.getLogger(BubbleSort.class.getName());
		
		doBubblesort(unsortedArray);
		for(int i: unsortedArray) {
			log.info(i + "\n");
		}
		
	}

	private static void doBubblesort(int[] unsortedArray) {
		boolean keepGoing = true;
		
		while(keepGoing) {
			keepGoing = false;
			for(int i = 0; i<unsortedArray.length-1;i++) {
				if(i == unsortedArray.length-1) {
					continue;
				}
				if(unsortedArray[i]>unsortedArray[i+1]) {
					int temp = unsortedArray[i+1];
					unsortedArray[i+1] = unsortedArray[i];
					unsortedArray[i] = temp;
					keepGoing = true;
				}
			}
		}
		
	}

}

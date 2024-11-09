package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] unsortedArray = {9,5,7,5,4};
		
		doBubblesort(unsortedArray);
		for(int i: unsortedArray) {
			System.out.print(i);
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

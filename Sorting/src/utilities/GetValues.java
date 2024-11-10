package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetValues {

	public GetValues() {
		super();
	}

	public static int[] getArrayFromUser(Logging log) {
		Scanner scanner = new Scanner(System.in);

		int size = getArraySize(scanner, log);
		int[] array = getArrayElements(scanner, size, log);

		scanner.close();
		return array;
	}

	private static int getArraySize(Scanner scanner, Logging log) {
		int size = 0;
		boolean repeat = true;
		while (repeat) {
			log.print("Enter the number of elements in the array: ");
			try {
				size = scanner.nextInt();
				if (size <= 0) {
					log.print("Size must be a positive integer. Try again.");
					continue;
				}
				repeat = false;
			} catch (InputMismatchException e) {
				log.print("Invalid input! Please enter a valid integer for the array size.");
				scanner.next(); // Clear the invalid input
			}
		}
		return size;
	}

	private static int[] getArrayElements(Scanner scanner, int size, Logging log) {
		int[] array = new int[size];
		log.print("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			while (true) {
				log.print("Element " + (i + 1) + ": ");
				try {
					array[i] = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					log.print("Invalid input! Please enter a valid integer.");
					scanner.next(); // Clear the invalid input
				}
			}
		}
		return array;
	}
}

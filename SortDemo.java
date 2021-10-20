import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		/* Transitioning to Eclipse
		 * Day 2
		 */
		System.out.println("hello");
		//sysout -> control + space
		//control + space: auto complete on eclipse

		//main -> control + space -> enter: automatic main method

		System.out.println("hello");
		//Define own shortcut 
		//Window -> Preferences -> Java -> Editor -> Templates 

		System.out.println("Hi");

		/* Transitioning to Eclipse
		 * Day 2
		 */

		//Ctrl + i for fixing indentation
		
		//Shift + Ctrl + F auto-format EVERYTHING
		
		//Auto-import: Shift + Ctrl + O
		
		

		/* Sort Demo
		 * Bubble Sort
		 */
		int[] arr = {7, 1, 3, 5, 6, 9};

		System.out.println("Before:" + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println();

		System.out.println("Before:" + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println();

		System.out.println("Before:" + Arrays.toString(arr));
		selectionSort2(arr);
		System.out.println();

		int[] arr2 = { 6, 7, 1, 5, 9, 4 };
		System.out.println("Before:" + Arrays.toString(arr2));
		insertionSort(arr2);
		System.out.println();

		int[] arr3 = { 6, 7, 1, 5, 9, 4 };
		System.out.println("Before:" + Arrays.toString(arr3));
		insertionSort2(arr3);
		System.out.println();

	}

	private static void bubbleSort(int[] arr) {
		for (int out = arr.length - 1; out >= 1; out--) {
			for (int i = 0; i < out; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}

		System.out.println("After:" + Arrays.toString(arr));

	}

	/**
	 * Sort Demo Selection Sort
	 */
	private static void selectionSort(int[] arr) {
		for (int outer = arr.length - 1; outer >= 1; outer--) {
			int biggest = 0;
			// outer loop
			for (int i = 0; i <= outer; i++) {
				if (arr[i] > arr[biggest]) {
					biggest = i;

				}
			}
			// Swap item at biggest index with endpoint
			int temp = arr[biggest];
			arr[biggest] = arr[outer];
			arr[outer] = temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("After:" + Arrays.toString(arr));
	}

	private static void selectionSort2(int[] arr) {
		for (int outer = 0; outer <= arr.length - 2; outer ++) {
			int smallest = arr.length - 1;
			for (int i = arr.length - 2; i >= outer; i--) {
				if (arr[i] < arr[smallest]) {
					smallest = i;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[outer];
			arr[outer] = temp;
			System.out.println(Arrays.toString(arr));
			System.out.println("After:" + Arrays.toString(arr));
		}
	}

	/** 
	 * Sort Demo
	 * Insertion Sort
	 */

	private static void insertionSort(int[] arr) {
		for (int out = arr.length - 2; out >= 0; out--) {
			int i = out;
			while(i + 1 < arr.length && arr[i] > arr[i - 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i++;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void insertionSort2(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j - 1 >= 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
			System.out.println(Arrays.toString(arr));
		}
	}



}

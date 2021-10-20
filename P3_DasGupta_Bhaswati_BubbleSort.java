import java.util.Arrays;

/**
 * Name: Bhaswati Das Gupta
 * Date: 1/11/2021
 * Period: 3
 * Time: 2 hours
 * Reflection: The first part of this lab was fairly simple as I knew what to do after watching the videos. Implementing
 * SpiderSolitaire was a bit difficult because I don't think I was able to follow the directions correctly. I don't think 
 * I downloaded Eclipse correctly which is why I'm having trouble adding files and finding them in my computer. Once I got 
 * all the files, it was easy because I had already implemented a sort method in my deck class last semester using a while 
 * loop and a for loop (I'm not sure which type of sorting I used). 
 * 
 * Reflection (Resubmission): I had previously submitted this lab using a boolean that checks if the list has been sorted to avoid repeated
 * runs. However, since the autograder expects a certain number of runs regardless of whether the list is sorted or not, I 
 * fixed my code so that it no longer checks for it.
 */

public class P3_DasGupta_Bhaswati_BubbleSort {

	public static void main(String[] args) {
		int[] list1 = {7, 1, 3, 5, 6, 9};
		System.out.println("Starting array: " + Arrays.toString(list1));
		bubbleSort1(list1);
		System.out.println();
		int[] list2 = {4, 2, 3, 1, 6, 3};
		System.out.println("Starting array: " + Arrays.toString(list2));
		bubbleSort1(list2);
		
		System.out.println();
		int[] list3 = {5, 4, 3, 2, 1};
		System.out.println("Starting array: " + Arrays.toString(list3));
		bubbleSort1(list3);
		
		System.out.println();
		String[] list4 = {"eat", "steaks", "juicy", "huge", "dogs", "big"};
		System.out.println("Starting array: " + Arrays.toString(list4));
		bubbleSort2(list4);
		
		System.out.println();
		String[] list5 = {"dogs", "digs", "dug", "hello", "hi", "hey"};
		System.out.println("Starting array: " + Arrays.toString(list5));
		bubbleSort2(list5);

	}
	
	//bubbleSort1 that takes in an array of ints and sorts the list into 
	//descending order by bubbling smallest elements to the right using 
	//i and i+1 as pairs.
	public static void bubbleSort1(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
			System.out.println(Arrays.toString(arr));

			
		}
		
	}
	
	//sorts the list into ascending order by bubbling smallest elements
	//to the left using i and i-1 as pairs
	public static void bubbleSort2(String[] str) {
		for (int i = 0; i < str.length - 1; i++) {

			for (int j = str.length - 1; j > 0; j--) {
				if (str[j].compareTo(str[j - 1]) < 0){
					String temp = str[j];
					str[j] = str[j - 1];
					str[j - 1] = temp;

				}
			}
			System.out.println(Arrays.toString(str));

		}
	}

}


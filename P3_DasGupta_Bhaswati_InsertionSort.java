import java.util.ArrayList;
import java.util.Arrays;

/**
 * Name: Bhaswati Das Gupta
 * Date: 1/13/2021
 * Period: 3
 * Time: 2 hours
 * Reflection: This lab was a bit more difficult than the past 2 sorting labs because I found insertion sorting to be
 * a bit more complicated than bubble sorting and selection sorting. The YelpRating part of the lab was easy since
 * Eclipse has a lot of things built in so that adding methods and constructors is easy. However, it took me a while
 * to understand how to override the compareTo method with doubles. 
 */
public class P3_DasGupta_Bhaswati_InsertionSort {

	public static void main(String[] args) {
		int[] arr = {6, 4, 5, 9, 8};
		System.out.println("Starting Array: " + Arrays.toString(arr));
		insertionSort1(arr);
		System.out.println("Ending Array: " + Arrays.toString(arr));
		System.out.println();
		
		int[] arr2 = {57, 95, 88, 14, 25, 6};
		System.out.println("Starting Array: " + Arrays.toString(arr2));
		insertionSort1(arr2);
		System.out.println("Ending Array: " + Arrays.toString(arr2));
		System.out.println();
		
		int[] arr3 = {84, 83, 15, 82, 50, 62};
		System.out.println("Starting Array: " + Arrays.toString(arr3));
		insertionSort1(arr3);
		System.out.println("Ending Array: " + Arrays.toString(arr3));
		System.out.println();
		
		String[] arr4 = {"eat", "steaks", "juicy", "huge", "dogs", "big"};
		System.out.println("Starting array: " + Arrays.toString(arr4));
		insertionSort2(arr4);
		System.out.println("Ending Array: " + Arrays.toString(arr4));
		System.out.println();
		
		String[] arr5 = {"dogs", "digs", "dug", "hello", "hi", "hey"};
		System.out.println("Starting array: " + Arrays.toString(arr5));
		System.out.println("Ending Array: " + Arrays.toString(arr5));
		insertionSort2(arr5);
		
		P3_DasGupta_Bhaswati_YelpRating y1 = new P3_DasGupta_Bhaswati_YelpRating("Pieology", "awesome pizza", 5, "Eric F");
		P3_DasGupta_Bhaswati_YelpRating y2 = new P3_DasGupta_Bhaswati_YelpRating("Pieology", "good pizza", 3.4, "Eric F");
		P3_DasGupta_Bhaswati_YelpRating y3 = new P3_DasGupta_Bhaswati_YelpRating("Pieology", "awesome pizza", 3.2, "Eric F");
		P3_DasGupta_Bhaswati_YelpRating y4 = new P3_DasGupta_Bhaswati_YelpRating("Pieology", "awesome pizza", 1, "Eric F");
		P3_DasGupta_Bhaswati_YelpRating y5 = new P3_DasGupta_Bhaswati_YelpRating("Pieology", "awesome pizza", 4.6, "Eric F");
		ArrayList<P3_DasGupta_Bhaswati_YelpRating> review = new ArrayList<P3_DasGupta_Bhaswati_YelpRating>();
		review.add(y1);
		review.add(y2);
		review.add(y3);
		review.add(y4);
		review.add(y5);
		System.out.println(review);
		insertionSort3(review);
		System.out.println(review);
	}
	
	// takes in an array of ints and sorts the list into ascending order by 
	// inserting items into their proper place on the left
	public static void insertionSort1 (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while ((j - 1 >= 0) && (arr[j] < arr[j - 1])) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	
	//that takes an array of Strings and sorts the list into descending order by inserting items 
	//into their proper place on the right.  This means your outer loop should run backward and 
	//your inner loop should run forward
	public static void insertionSort2 (String[] arr) {
		for (int i = arr.length - 2; i >= 0; i--) {
			int j = i;
			while ((j + 1) < arr.length && (arr[j].compareTo(arr[j + 1]) < 0)) {
				String temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j ++;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	//takes in an ArrayList of YelpRating objects and sorts the list into descending order 
	//by inserting items into their proper place on the left. This means your outer loop will 
	//run from left to right and your inner loop will run backward
	public static void insertionSort3(ArrayList<P3_DasGupta_Bhaswati_YelpRating> arr) {
		for (int i = 1; i < arr.size(); i++) {
			int j = i;
			while ((j - 1 >= 0) && (arr.get(j).compareTo(arr.get(j - 1)) > 0)) {
				P3_DasGupta_Bhaswati_YelpRating temp = arr.get(j);
				arr.set(j, arr.get(j-1));
				arr.set(j - 1, temp); 
				j--;
			}
			System.out.println(arr);
		}
		
	}

}

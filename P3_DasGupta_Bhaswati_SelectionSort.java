import java.util.Arrays;
import java.util.ArrayList;

/**
 * Name: Bhaswati Das Gupta
 * Date: 1/9/2021
 * Period: 3
 * Time: 2 hours
 * Reflection: The first part of this lab was fairly simple as I knew what to do after watching the videos. Implementing
 * SpiderSolitaire was a bit difficult because I don't think I was able to follow the directions correctly. I don't think 
 * I downloaded Eclipse correctly which is why I'm having trouble adding files and finding them in my computer. Once I got 
 * all the files, it was easy because I had already implemented a sort method in my deck class last semester using a while 
 * loop and a for loop (I'm not sure which type of sorting I used). 
 */
public class P3_DasGupta_Bhaswati_SelectionSort {

	public static void main(String[] args) {
				//Testing selectionSort1
				int[] arr = {9, 5, 1, 3, 7, 4};
				System.out.println("Starting Array: " + Arrays.toString(arr));
				selectionSort1(arr);
				System.out.println();
				
				int[] arr2 = {57, 95, 88, 14, 25, 6};
				System.out.println("Starting Array: " + Arrays.toString(arr2));
				selectionSort1(arr2);
				System.out.println();
				
				int[] arr3 = {84, 83, 15, 82, 50, 62};
				System.out.println("Starting Array: " + Arrays.toString(arr3));
				selectionSort1(arr3);
				System.out.println();
				
				//Testing selectionSort2
				String[] arr4 = {"ahaha", "aabaa", "cake", "zebra", "z","e", "ze"};
				System.out.println("Starting array: " + Arrays.toString(arr4));
				selectionSort2(arr4);
				System.out.println();
				
				String[] arr5 = {"dogs", "digs", "dug", "hello", "hi", "hey"};
				System.out.println("Starting array: " + Arrays.toString(arr5));
				selectionSort2(arr5);
				
				
				
				//Testing Solitaire sort 
				ArrayList<Card> list = new ArrayList<Card>();
		        String[] symbols = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
		        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		        for (int i = symbols.length - 1; i >= 0; i--){
		        	Card c = new Card(symbols[i], values[i]);
		            c.setFaceUp(true);
		            list.add(c);
		        }
		        System.out.println(list);
		        selectionSort(list);
		        System.out.println(list);
        

	}
	//takes in an array of ints and uses Selection Sort to sort the list into 
	//ascending order by swapping largest elements to the right
	public static void selectionSort1(int[] arr) {
		for (int i = arr.length - 1; i >= 1; i--) {
			int biggest = 0;
			for (int j = 0; j <= i; j++) {
				if (arr[j] > arr[biggest]) {
					biggest = j;
				}
			}
			
			int temp = arr[biggest];
			arr[biggest] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));

		}
	}
	
	//takes an array of Strings and sorts the list into descending order 
	//by swapping largest elements to the left
	public static void selectionSort2(String[] arr) {
		for (int i = 0; i <= arr.length - 2; i++) {
			int biggest = arr.length - 1;
			for (int j = arr.length - 1; j >= i; j--) {
				if (arr[j].compareTo(arr[biggest]) > 0) {
					biggest = j;
				}
			}
			String temp = arr[i];
			arr[i] = arr[biggest];
			arr[biggest] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void selectionSort(ArrayList<Card> arr){       
       for (int i = arr.size() - 1; i >= 1; i--) {
        	int biggest = 0;
        	for (int j = 0; j <= i; j++) {
        		if (arr.get(j).compareTo(arr.get(biggest)) > 0) {
        			biggest = j;
                    
        		}
        	}
        	Card c1 = arr.get(i);
            Card c2 = arr.get(biggest);
            arr.set(i, c2);
            arr.set(biggest, c1);
            System.out.println(arr);
        }
        
        
    }

}

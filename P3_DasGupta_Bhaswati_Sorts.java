
import java.util.*;

/**
 * Name: Bhaswati Das Gupta
 * Date: 1/20/2021
 * Period: 3
 * Time: 1.5 hours
 * Reflection: This lab was a bit confusing because I was absent when we went over it in class. However,
 * I asked a friend to explain it to me and it became a bit more clear. I'm still not sure if I did 
 * everything correctly. Through this lab, I found that insertion sorting is the most efficient
 * way to sort large lists. I also noticed the pattern that as you increase the amount of integers in
 * the list, the number of steps increase by a factor of about 4. 
 * 
 * 
 * Name: Bhaswati Das Gupta
 * Date: 1/27/2021
 * Period: 3
 * Time: 1.5 hours
 * Reflection: This lab was a bit difficult because mergeSort is more complex than the other sorting methods.
 * My methods still aren't sorting the numbers in the list correctly so I plan on correcting it and 
 * resubmitting this lab.  
 * 
 *
 *  This class has several methods that use different quadratic sorting
 *  algorithms to sort objects of type Comparable. 
 * @author     Bhaswati Das Gupta
 * @created    January 20, 2021
 */
public class P3_DasGupta_Bhaswati_Sorts {
	private long steps;

	/**
	 *  Description of Constructor
	 *
	 * @param  list  Description of Parameter
	 */
	public P3_DasGupta_Bhaswati_Sorts(){
		steps = 0;
	}

	/**
	 *  This method takes in an ArrayList of Comparable objects and 
	 *  sorts them in descending order using a bubble sorting 
	 *  algorithm. 
	 *
	 * @param  list  reference to an array of integers to be sorted
	 */
	public void bubbleSort(ArrayList <Comparable> list){
		steps += 2; //init, check condition
		for (int i = list.size() - 1; i >= 0; i --){
			steps += 2; //init, check condition
			for (int j = 0; j < i ; j ++){
				steps += 5;
				if (list.get(j).compareTo(list.get(j + 1)) < 0){
					steps += 2;
					swap(list, j, j + 1);
					steps += 5;
				}
				steps += 2;
			}
			steps += 2;
		}
		System.out.println();
		System.out.println("Bubble Sort");
		System.out.println();
	}

	/**
	 *  This method takes in an ArrayList of Comparable objects and 
	 *  sorts it into ascending order using a selection sort algorithm
	 *  
	 *
	 * @param  list  reference to an array of integers to be sorted
	 */
	public void selectionSort(ArrayList <Comparable> list){
		steps += 2;
		for (int i = list.size() - 1; i >= 0; i--){
			steps ++;
			int biggest = 0; 
			steps += 2;
			for (int j = 0; j < i; j++){
				steps += 4;
				if (list.get(j).compareTo(list.get(biggest))  > 0){
					steps ++;
					biggest = j;
				}
				steps += 2;
			}
			steps += 5;
			swap(list, i, biggest);
			steps += 2;
		}

		System.out.println();
		System.out.println("Selection Sort");
		System.out.println();
	}

	/**
	 * This method takes in an ArrayList of Comparable objects and 
	 * sorts them in descending order using an insertion sorting 
	 * algorithm. 
	 *
	 * @param  list  reference to an array of integers to be sorted
	 */
	public void insertionSort(ArrayList <Comparable> list){
		steps += 2; //init, check condition
		for (int i = 1 ; i < list.size(); i++){
			steps ++; //=
			int j = i;
			steps += 7; //-, >, get(), compareTo(), get(), -, <
			while ((j - 1 > 0) && (list.get(j).compareTo(list.get(j - 1)) > 0)){
				steps += 3; // swap(), -, --
				swap(list, j, j - 1);
				steps += 5;
				j--;
				steps += 7; //-, >, get(), compareTo(), get(), -, <
			}
			steps += 2; //increment, check condition
		}

		System.out.println();
		System.out.println("Insertion Sort");
		System.out.println();
	}


	/**
	 *  Takes in entire vector, but will merge the following sections
	 *  together:  Left sublist from a[first]..a[mid], right sublist from
	 *  a[mid+1]..a[last].  Precondition:  each sublist is already in
	 *  ascending order
	 *
	 * @param  a      reference to an array of integers to be sorted
	 * @param  first  starting index of range of values to be sorted
	 * @param  mid    midpoint index of range of values to be sorted
	 * @param  last   last index of range of values to be sorted
	 */
	private void merge(ArrayList <Comparable> a, int first, int mid, int last){
		steps += 5;
		ArrayList<Comparable> temp = new ArrayList<Comparable>();
		int firstInd = first;
		int middle = mid + 1;
		steps += 2;
		while (firstInd <= mid && (middle) <= last) {
			if (a.get(firstInd).compareTo(a.get(middle)) < 0) {
				temp.add(a.get(firstInd));
				firstInd ++;
				steps += 7;
			}else if (a.get(middle).compareTo(a.get(firstInd)) < 0){
				temp.add(a.get(middle));
				middle++;
				steps += 7;
		    }else {
				temp.add(a.get(middle));
				middle++;
				steps += 3;
			}
		}
		
		if (firstInd >= mid + 1) {
			steps += 4;
			for (int i = middle; i <= last; i++) {
				temp.add(a.get(i));
			}
			steps += 3;
		}else {
			steps += 2;
			for (int i = firstInd; i <= mid; i++) {
				temp.add(a.get(i));
			}
			steps += 3;
		}
		steps += 3;
		int j = 0;
		for (int i = first; i <= last; i++) {
			a.set(i, temp.get(j));
			j++;
			steps += 4;
		}
		
		System.out.println();
		System.out.println("Merge");
		System.out.println();

	}

	/**
	 *  Recursive mergesort of an array of integers
	 *
	 * @param  a      reference to an array of integers to be sorted
	 * @param  first  starting index of range of values to be sorted
	 * @param  last   ending index of range of values to be sorted
	 */
	public void mergeSort(ArrayList <Comparable> a, int first, int last){
		
		if  (last - first == 0) {
			steps ++;
		}else if (last - first == 1) {
			steps += 4; 
			if (a.get(first).compareTo(a.get(last)) > 0) {
				steps += 5;
				swap(a, first, last);
				
			}
		}else {
			steps += 3;
			int mid = (last + first)/2;
			steps += 4;
			mergeSort(a, first, mid);
			mergeSort(a, mid + 1, last);
			merge(a, first, mid, last);
		}
		System.out.println();
		System.out.println("Merge Sort");
		System.out.println();
	}


	/**
	 *  Accessor method to return the current value of steps
	 *
	 */
	public long getStepCount(){
		return steps;
	}

	/**
	 *  Modifier method to set or reset the step count. Usually called
	 *  prior to invocation of a sort method.
	 *
	 * @param  stepCount   value assigned to steps
	 */
	public void setStepCount(long stepCount){
		steps = stepCount;
	}

	/**
	 *  Interchanges two elements in an ArrayList
	 *
	 * @param  list  reference to an array of integers
	 * @param  a     index of integer to be swapped
	 * @param  b     index of integer to be swapped
	 */
	public void swap(ArrayList <Comparable> list, int a, int b){
		Comparable temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
		System.out.println();
		System.out.println("Swap");
		System.out.println();
	}
}
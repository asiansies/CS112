/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 05
 * 
 * Note: Output included at the end of this file.
 * 
 */

import java.util.*;

public class Problem1 {
	static Random generator = new Random();
	static int numCompares = 0;
	static int numMoves = 0;
	
	public static void main(String[] args) {
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		ArrayList<Integer> nums3 = new ArrayList<Integer>();
		ArrayList<Integer> nums4 = new ArrayList<Integer>();
		ArrayList<Integer> nums5 = new ArrayList<Integer>();
		ArrayList<Integer> orderedNums = new ArrayList<Integer>();
		
		// Create 5 random ArrayLists with 20 integers.
		growRandArray(nums1);
		growRandArray(nums2);
		growRandArray(nums3);
		growRandArray(nums4);
		growRandArray(nums5);
		
		// Create an ordered ArrayList with 20 integers.
		growOrderedArray(orderedNums);
		
		// Quicksort arrays.
		printOutput(nums1);
		printOutput(nums2);
		printOutput(nums3);
		printOutput(nums4);
		printOutput(nums5);
		printOutput(orderedNums);
	}
	
	// Calls quicksort() and prints out results.
	public static void printOutput(ArrayList<Integer> arr) {
		System.out.println("Input array: " + arr);
		System.out.println("Sorted array: " + quicksort(arr));
		System.out.println("Total number of compares: " + numCompares);
		System.out.println("Total number of moves: " + numMoves);
		System.out.println("------------------------------------------------------------------------------------");
		numCompares = 0;
		numMoves = 0;
	}
	
	// Grows an ordered array of 20 integers in the range 1 to 20, inclusive.
	public static void growOrderedArray(ArrayList<Integer> arr) {
		for (int i = 1; i < 21; i++) {
			arr.add(i);			
		}
	}
	
	// Grows a random array of 20 integers in the range 1 to 20, inclusive.
	public static void growRandArray(ArrayList<Integer> arr) {
		for (int i = 0; i < 20; i++) {
			int element = generator.nextInt(20) + 1;
			arr.add(element);			
		}
	}
	
	// Implements quicksort.
	public static ArrayList<Integer> quicksort(ArrayList<Integer> nums) {		
		// Returns a sorted single array.
		if (nums.size() <= 1) {
			return nums;  
		}

		// Choose random pivot.
		int pivot = nums.remove(generator.nextInt(nums.size()));	

		// Create empty lists to store numbers that are less than the pivot
		// and greater than the pivot.
		ArrayList<Integer> less = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();

		ArrayList<Integer> quickSorted = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) <= pivot) {
				less.add(nums.get(i));
			} else {
				greater.add(nums.get(i));
			}
			numCompares++;
			numMoves++;
		}

		// Combine less array, pivot, and greater array.
		quickSorted.addAll(quicksort(less));
		quickSorted.add(pivot);
		quickSorted.addAll(quicksort(greater)); 

		return quickSorted;
	}
}


/* 
 * OUTPUT OF CODE:
 * 
 * Input array: [4, 6, 2, 4, 5, 3, 15, 3, 12, 8, 17, 6, 16, 3, 19, 2, 20, 7, 11, 16]
 * Sorted array: [2, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 8, 11, 12, 15, 16, 16, 17, 19, 20]
 * Total number of compares: 70
 * Total number of moves: 70
 * ------------------------------------------------------------------------------------
 * Input array: [1, 4, 12, 7, 11, 13, 11, 10, 7, 7, 3, 14, 20, 14, 14, 14, 8, 1, 11, 4]
 * Sorted array: [1, 1, 3, 4, 4, 7, 7, 7, 8, 10, 11, 11, 11, 12, 13, 14, 14, 14, 14, 20]
 * Total number of compares: 72
 * Total number of moves: 72
 * ------------------------------------------------------------------------------------
 * Input array: [14, 3, 18, 1, 10, 5, 15, 4, 3, 8, 11, 9, 9, 3, 20, 19, 20, 18, 15, 4]
 * Sorted array: [1, 3, 3, 3, 4, 4, 5, 8, 9, 9, 10, 11, 14, 15, 15, 18, 18, 19, 20, 20]
 * Total number of compares: 63
 * Total number of moves: 63
 * ------------------------------------------------------------------------------------
 * Input array: [1, 14, 9, 13, 4, 1, 15, 18, 18, 2, 8, 10, 18, 10, 10, 3, 8, 14, 19, 9]
 * Sorted array: [1, 1, 2, 3, 4, 8, 8, 9, 9, 10, 10, 10, 13, 14, 14, 15, 18, 18, 18, 19]
 * Total number of compares: 76
 * Total number of moves: 76
 * ------------------------------------------------------------------------------------
 * Input array: [2, 1, 18, 5, 7, 14, 5, 3, 8, 19, 20, 3, 9, 2, 1, 5, 6, 5, 10, 4]
 * Sorted array: [1, 1, 2, 2, 3, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 10, 14, 18, 19, 20]
 * Total number of compares: 69
 * Total number of moves: 69
 * ------------------------------------------------------------------------------------
 * Input array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
 * Sorted array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
 * Total number of compares: 67
 * Total number of moves: 67
 * ------------------------------------------------------------------------------------
 * 
 */

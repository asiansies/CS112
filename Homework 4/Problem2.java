/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 04
 * 
 * Note: Output included at the end of this file.
 * 
 */

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {

		// Initialize arrays.
		int[] arr1 = {1};
		int[] arr2 = {2,8,9,4,6};
		int[] arr3 = {4,4,8,3,1,34,5,87,1,17,6,0,3,21,2};

		System.out.println("Input array: " + Arrays.toString(arr1));
		System.out.println("Sorted array: " + Arrays.toString(mergeSort(arr1)));
		System.out.println("-----------------------------------------");
		System.out.println("Input array: " + Arrays.toString(arr2));
		System.out.println("Sorted array: " + Arrays.toString(mergeSort(arr2)));
		System.out.println("-----------------------------------------");
		System.out.println("Input array: " + Arrays.toString(arr3));
		System.out.println("Sorted array: " + Arrays.toString(mergeSort(arr3)));

	}

	// Recursively sorts arrays using merge sort method.
	public static int[] mergeSort(int[] input) {
		if (input.length < 2) {
			return input;
		}

		int[] sorted = new int[input.length];

		int[] upper = Arrays.copyOfRange(input, 0, input.length/2);
		int[] lower = Arrays.copyOfRange(input, (input.length/2), input.length);

		upper = mergeSort(upper);
		lower = mergeSort(lower);

		merge(upper, lower, sorted);

		return sorted;
	}

	// Merges two sorted arrays.
	public static int[] merge(int[] arr1, int[] arr2, int[] sorted) {
		int index = 0;
		int[] buffer = new int[sorted.length];

		// Copy both arrays into the buffer array in correct order.
		for (int i = 0; i < arr1.length; i++ ) {
			buffer[index] = arr1[i];
			sorted[index++] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++ ) {
			buffer[index] = arr2[i];
			sorted[index++] = arr2[i];
		}

		// Indices of buffer array.
		int hi = sorted.length-1;
		int lo = 0;
		int mid = arr1.length-1;

		int i = lo;
		int j = mid+1;
		int k = lo;

		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= mid && j <= hi) {
			if (buffer[i] <= buffer[j]) {
				sorted[k] = buffer[i];
				i++;
			} else {
				sorted[k] = buffer[j];
				j++;
			}
			k++;
		}

		// Copy the rest of the left side of the array into the target array
		while (i <= mid) {
			sorted[k] = buffer[i];
			k++;
			i++;
		}
		return sorted;
	}
}


/* 
 * OUTPUT OF CODE:
 * 
 * Input array: [1]
 * Sorted array: [1]
 * -----------------------------------------
 * Input array: [2, 8, 9, 4, 6]
 * Sorted array: [2, 4, 6, 8, 9]
 * -----------------------------------------
 * Input array: [4, 4, 8, 3, 1, 34, 5, 87, 1, 17, 6, 0, 3, 21, 2]
 * Sorted array: [0, 1, 1, 2, 3, 3, 4, 4, 5, 6, 8, 17, 21, 34, 87]
 * 
 */
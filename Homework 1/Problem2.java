/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 01
 * 
 */

import java.util.Arrays;

public class Problem2 {
	
	// Recursively reverses the elements of an array between given indices.
	public static void ReverseArray(int[] A, int i, int j) {
		if (i < 0 || j < 0) {
			throw new IllegalArgumentException("Indices do not exist!");
		}
		if (i < j) {
			Swap(A, i, j);
			System.out.println("Method call to: ReverseArray(yourArray" + ", " + (i + 1) + ", " + (j - 1));
			ReverseArray(A, i + 1, j - 1);
		}
	}
	
	// Swaps elements.
	private static void Swap(int[] A, int i, int j) {
		System.out.println("Storing element " + i + "...");
		int temp = A[i];
		System.out.println("Swapping element " + i + " and " + j);
		A[i] = A[j];
		A[j] = temp;
	}
	
	// Initializes an array and calls ReverseArray to reverse the array.
	public static void main(String[] args) { 
		int[] A = {1, 2, 3, 4, 5, 6};
		
		ReverseArray(A, 2, 5);
		
		String str = Arrays.toString(A);
		System.out.println(str);
	}

}

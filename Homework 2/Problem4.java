/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 02
 * 
 * Note: Output of code found at the end of file.
 * 
 */

public class Problem4 {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6};
		int[] a2 = {8,7,6,5,4,3,2};
		int[] a3 = {5,3,3,3,4,3,2,1,9,6,7,8};

		System.out.println("The maximum value in [1,2,3,4,5,6] is " + arrayMax(a1) + "\n");
		System.out.println("----------------------------------------");
		System.out.println("The maximum value in [8,7,6,5,4,3,2] is " + arrayMax(a2) + "\n");
		System.out.println("----------------------------------------");
		System.out.println("The maximum value in [5,3,3,3,4,3,2,1,9,6,7,8] is " + arrayMax(a3) + "\n");
	}

	// Finds and returns the maximum value of an array.
	// Uses print statements to narrate process.
	public static int arrayMax(int[] A) {

		int numAssigns = 0;
		int numCompares = 0;
		int numIncrements = 0;

		System.out.println("\nAssigning first element of array to max...");
		int max = A[0];
		numAssigns++;

		for (int i = 1; i < A.length - 1; i++) {
			System.out.println("Comparing current max (" + max + ") with element " + i + "...");
			numCompares++;
			if (max < A[i]) {
				System.out.println("Value of " + A[i] + " is greater than " + max);
				System.out.println("max is now " + A[i]);
				max = A[i];
				numAssigns++;
			}
			numIncrements++;
		}

		System.out.println("\nResults:");
		System.out.println("Total number of assignments: " + numAssigns);
		System.out.println("Total number of comparisons: " + numCompares);
		System.out.println("Total number of increments: " + numIncrements);
		System.out.println("Total number of elements searched: " + A.length);

		return max;
	}
}

/* 
 * OUTPUT OF CODE: 
 * 
 * Assigning first element of array to max...
 * Comparing current max (1) with element 1...
 * Value of 2 is greater than 1
 * max is now 2
 * Comparing current max (2) with element 2...
 * Value of 3 is greater than 2
 * max is now 3
 * Comparing current max (3) with element 3...
 * Value of 4 is greater than 3
 * max is now 4
 * Comparing current max (4) with element 4...
 * Value of 5 is greater than 4
 * max is now 5
 * 
 * Results:
 * Total number of assignments: 5
 * Total number of comparisons: 4
 * Total number of increments: 4
 * Total number of elements searched: 6
 * The maximum value in [1,2,3,4,5,6] is 5
 * 
 * ----------------------------------------
 * 
 * Assigning first element of array to max...
 * Comparing current max (8) with element 1...
 * Comparing current max (8) with element 2...
 * Comparing current max (8) with element 3...
 * Comparing current max (8) with element 4...
 * Comparing current max (8) with element 5...
 * 
 * Results:
 * Total number of assignments: 1
 * Total number of comparisons: 5
 * Total number of increments: 5
 * Total number of elements searched: 7
 * The maximum value in [8,7,6,5,4,3,2] is 8
 * 
 * ----------------------------------------
 * 
 * Assigning first element of array to max...
 * Comparing current max (5) with element 1...
 * Comparing current max (5) with element 2...
 * Comparing current max (5) with element 3...
 * Comparing current max (5) with element 4...
 * Comparing current max (5) with element 5...
 * Comparing current max (5) with element 6...
 * Comparing current max (5) with element 7...
 * Comparing current max (5) with element 8...
 * Value of 9 is greater than 5
 * max is now 9
 * Comparing current max (9) with element 9...
 * Comparing current max (9) with element 10...
 * 
 * Results:
 * Total number of assignments: 2
 * Total number of comparisons: 10
 * Total number of increments: 10
 * Total number of elements searched: 12
 * The maximum value in [5,3,3,3,4,3,2,1,9,6,7,8] is 9
 * 
 */
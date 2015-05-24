/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 03
 * 
 */


import java.util.*;

public class Problem3 {
	
	// Uses an ArrayList to keep track and grow the array that
	// is passed into the methods each time through the loop.
	public static void main(String[] args) {
		ArrayList<Double> nums = new ArrayList<Double>();
		nums.add(0, 0.0);
		
		for (int i = 1; i <= 10; i++) {
			prefixAverages1(nums);
			prefixAverages2(nums);
			nums.add(i, (double)i);
		}	
	}
	
	// Implements prefixAverages1() pseudocode from book. This
	// method uses a nested for-loop and keeps track of total
	// assignments, additions, and divisions.
	public static double[] prefixAverages1(ArrayList<Double> nums) {
		double[] A = new double[nums.size()];
		
		int numAssigns = 0;
		int numAdditions = 0;
		int numDivisions = 0;
		
		for (int i = 0; i < nums.size() - 1; i++) {
			double avg = 0;
			
			for (int j = 0; j < i; j++) {
				avg = avg + nums.get(j);
				numAssigns++;
				numAdditions++;
				A[i] = avg/(i + 1);
				numDivisions++;
			}
		}
		
		System.out.println("Number of double assignments for array of " + nums.size() + " : " + numAssigns);
		System.out.println("Number of additions for array of " + nums.size() + " : " + numAdditions);
		System.out.println("Number of divisions for array of " + nums.size() + " : " + numDivisions);
		
		return A;
	}
	
	// Implements prefixAverages2() pseudocode from book. This
	// method uses a single for-loop and keeps track of total
	// assignments, additions, and divisions.
	public static double[] prefixAverages2(ArrayList<Double> nums) {
		double[] A = new double[nums.size()];
		
		int numAssigns = 0;
		int numAdditions = 0;
		int numDivisions = 0;
		
		double sum = 0;

		for (int i = 0; i < nums.size() - 1; i++) {
			sum = sum + nums.get(i);
			numAssigns++;
			numAdditions++;
			A[i] = sum/(i + 1);
			numDivisions++;
		}
		
		System.out.println("Number of double assignments for array of " + nums.size() + " : " + numAssigns);
		System.out.println("Number of additions for array of " + nums.size() + " : " + numAdditions);
		System.out.println("Number of divisions for array of " + nums.size() + " : " + numDivisions);
		
		return A;
	}
}

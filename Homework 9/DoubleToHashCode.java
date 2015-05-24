/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 09
 * 
 * Problem 2 - Main class to create MyDouble objects and compute and 
 * 		display their hash codes.
 * 
 */

public class DoubleToHashCode {
	
	public static void main(String[] args) {
		MyDouble d1 = new MyDouble(68.0);
		MyDouble d2 = new MyDouble(423.0);
		MyDouble d3 = new MyDouble(1.0);

		System.out.println("Hash code of " + d1 + ": " + d1.hashCode());
		System.out.println("Hash code of " + d2 + ": " + d2.hashCode());
		System.out.println("Hash code of " + d3 + ": " + d3.hashCode());
	}
}
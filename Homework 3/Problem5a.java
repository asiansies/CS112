/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 03
 * 
 */

import java.util.*;

public class Problem5a {
	
	// Create a random number generator.
	static Random generator = new Random();
	
	public static void main(String[] args) {
		randomIntegers();
	}

	// Prints out a list of 20 random integers in the range 
	// from 0 to 100.
	public static void randomIntegers() {
		for (int i = 0; i < 20; i++) {
			System.out.println(generator.nextInt(100));
		}
	}

}

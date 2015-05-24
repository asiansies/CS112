/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 03
 * 
 */

import java.util.*;

public class Problem5b {
	
	// Create a random number generator.
	static Random generator = new Random();
	
	public static void main(String[] args) {
		randomDoubles();
	}

	// Print out a list of 20 random doubles in the range
	// from 0 to 2*pi.
	public static void randomDoubles() {
		for (int i = 0; i < 20; i++) {
			System.out.println(generator.nextDouble() * (2 * Math.PI));
		}
	}

}

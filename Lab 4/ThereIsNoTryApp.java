/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Lab 04
 * 
 * Note: Output at the end of file.
 * 
 */

public class ThereIsNoTryApp {

	public static void main(String[] args) {
		System.out.println("12 / 4 = " + MathLibrary.divide(12, 4));
		System.out.println("12 / 0 = ");
		System.out.println("Divisor = 0...");
		System.out.println(MathLibrary.divide(12, 0));
	}
}


/* 
 * Part D. 
 * When you run Math.divide(12, 4), it runs and properly divides
 * and returns the correct answer. 
 * 
 * When you run Math.divide(12, 0), the program throws an exception. 
 * main() calls divide() from the MathLibrary, which then calls 
 * the AttemptToDivideByZeroException(), which calls its superclass
 * RuntimeException.
 * 
 * 
 * OUTPUT OF CODE:
 * 12 / 4 = 3
 * 12 / 0 = 
 * Divisor = 0...
 * Exception in thread "main" AttemptToDivideByZeroException: dividend@0
 * 	   at MathLibrary.divide(MathLibrary.java:14)
 * 	   at ThereIsNoTryApp.main(ThereIsNoTryApp.java:16)
 * 
 */

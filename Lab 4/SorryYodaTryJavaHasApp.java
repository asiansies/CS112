/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Lab 04
 * 
 * Note: Output at the end of file.
 * 
 */

public class SorryYodaTryJavaHasApp {

	public static void main(String[] args) {
		System.out.println("12 / 4 = " + MathLibrary.divide(12, 4));
		try {
			System.out.println("12 / 0 = ");
			System.out.println(MathLibrary.divide(12, 0));
		} catch (AttemptToDivideByZeroException e) {
			System.out.println("Divide by zero attempt");
		}
	}
}

/*
 * Part E.
 * When you run Math.divide(12, 4), it runs and properly divides
 * and returns the correct answer. 
 * 
 * When you run Math.divide(12, 0), the program catches the
 * AttemptToDivideByZeroException(). main() executes the try block
 * which calls divide(12, 0) from the MathLibrary, which then calls 
 * the AttemptToDivideByZeroException(), which calls its superclass
 * RuntimeException. 
 * 
 * However, in this case, the program is
 * specifically looking for the exception. When it encounters the
 * exception, instead of crashing, the program prints a message to
 * the console.
 * 
 *
 * OUTPUT OF CODE:
 * 
 * 12 / 4 = 3
 * 12 / 0 = 
 * Divide by zero attempt
 * 
 */
/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Lab 04
 * 
 */

public class MathLibrary {
	public static int divide (int dividend, int divisor) throws AttemptToDivideByZeroException {
		
		if (divisor == 0) {
			throw new AttemptToDivideByZeroException ("dividend@0");
		}
		
		int result = dividend / divisor;
		return result;
	}
}

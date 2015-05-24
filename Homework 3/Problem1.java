/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 03
 * 
 */

public class Problem1 {
	static int numAdditions = 0;
	public static void main(String[] args) {
		for (int i = 0; i <= 29; i++) {
			System.out.println(fibonacciElement(i));
			System.out.println("Number of Additions for " + i + ": " + numAdditions);
			numAdditions = 0;
		}	
	}
	
	public static int fibonacciElement(int n) {
		if (n < 1) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		numAdditions++;
		return fibonacciElement(n - 1) + fibonacciElement(n - 2);
	}
}
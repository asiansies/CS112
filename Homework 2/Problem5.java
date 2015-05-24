/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 02
 * 
 * Note: Output of code found at the end of file.
 * 
 */

public class Problem5 {
	
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(fibonacciElement(i));
		}
	}
	
	public static int fibonacciElement(int n) {
		if (n < 1) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return fibonacciElement(n - 1) + fibonacciElement(n - 2);

	}
}

/* 
 * OUTPUT OF CODE: 
 * 
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34
 * 55
 * 
 */
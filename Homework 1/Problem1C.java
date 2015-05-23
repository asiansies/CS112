/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 01
 * 
 */

public class Problem1C {
	 public static void main(String[] args) {
		 
		 // initialize isBold and isItalic
		 boolean isBold = false, isItalic = false;
		 
	        // prints if isBold and isItalic are both false
	        if (!isBold && !isItalic) {
	            System.out.println("isBold and isItalic are both false");
	        }
	        
	        // prints a sequence of doubles
	        System.out.print("0.0");
	        for (int i = 1; i <= 10; i++) {
	            double n = (double)i/10;
	            System.out.printf(", %.1f", n);
	        }
	        System.out.println();
	        
	        // continues to print if i is less than 8, then increments i
	        int i = 0;
	        while (i < 8) {
	            System.out.println("i is less than 8");
	            i++;
	        }
	    }
}

/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Lab 01
 * 
 */

public class Greeter {
	static int count;
	
	public static void main(String[] args) {
		count = 4;
		greet();
	}
	
	// Iteratively prints "hello, world" to the console.
	public static void greet() {
		System.out.println("Iteratively printing \"hello, world\"");
		
		for (int i = 0; i < count; i++) {
			System.out.println("i is " + i + " and is less than " + count);
			System.out.println("hello, world");			
		}
	}
	
	// Recursively prints "hello, world" to the console.
	static int j;
	public static void greetr() {
		System.out.println("Recursively printing \"hello, world\"");
		
		if (j == count) {
			return;
		}
		
		System.out.println("j is " + j + " and is less than " + count);
		System.out.println("hello, world");
		j++;
		
		greetr();
	}
}

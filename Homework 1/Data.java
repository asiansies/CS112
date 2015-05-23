/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 01
 * 
 */

public class Data {
	char ch;
	int i;
	int j;
	double x;
	String s;
	
	// This program prints out the memory addresses of the two Data objects.
	// The Data class does not have its own toString() method so by default,
	// java prints the memory locations of the objects.
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		
		System.out.println(d1);
		System.out.println(d2);
	}
}

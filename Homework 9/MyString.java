/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 09
 * 
 * Problem 1
 * 
 */

public class MyString {
	private String s;
	
	public MyString(String s) {
		this.s = s;
	}
	
	// Computes the hash code of a String using the djb2 method.
	public int hashCode() {
		int hashCode = 5381;
		
		for (int i = 0; i < s.length(); i++) {
			hashCode = ((hashCode << 5) + hashCode) + (int)s.charAt(i);
		}
		
		return hashCode;
	}
	
	public String toString() {
		return s;
	}
}

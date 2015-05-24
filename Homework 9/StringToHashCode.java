/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 09
 * 
 * Problem 1 - Main class to create MyString objects and compute and 
 * 		display their hash codes.
 * 
 */

public class StringToHashCode {

	public static void main(String[] args) {
		MyString s1 = new MyString("a");
		MyString s2 = new MyString("hello");
		MyString s3 = new MyString("rawr!");

		System.out.println("Hash code of \"" + s1.toString() + "\": " + s1.hashCode());
		System.out.println("Hash code of \"" + s2.toString() + "\": " + s2.hashCode());
		System.out.println("Hash code of \"" + s3.toString() + "\": " + s3.hashCode());
	}

}

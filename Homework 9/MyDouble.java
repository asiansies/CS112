/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 09
 * 
 * Problem 2
 * 
 */

public class MyDouble {
	private Double d;

	public MyDouble(Double d) {
		this.d = d;
	}

	// Computes the hash code of a String using the djb2 method.
	public int hashCode() {
		String stringD = d.toString();
		int a = 33;
		int n = stringD.length() - 1;
		int hashCode = 0;

		for (int i = 0; i < stringD.length(); i++) {
			hashCode += (stringD.charAt(i) * (Math.pow(a, (n))));
			n = n - 1;
		}
		
		return hashCode;
	}
	
	public String toString() {
		return d.toString();
	}
}

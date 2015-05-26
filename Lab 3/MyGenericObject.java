/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Lab 03
 * 
 * Note: Part b and c of this question are in MyGenericObject2.java
 * 
 */

public class MyGenericObject {
	static double data;
	
	// Shows data stored in field.
	public static void showData() {
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		MyGenericObject instance = new MyGenericObject();
		instance.showData();
	}
}

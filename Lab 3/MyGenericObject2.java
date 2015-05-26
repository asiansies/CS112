/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Lab 03
 * 
 * Note: This is Parts b and c of the 2nd part of the lab.
 *       Output can be found at the end of this file.
 * 
 */

public class MyGenericObject2<T> {
	T data;

	public MyGenericObject2(T n) {
		this.data = n;
	}

	public void showData() {
		System.out.println(data);
	}

	public static void main(String[] args) {
		/* 
		 * Part i.
		 * 
		 * This statement: 
		 * MyGenericObject2<int> MyGenericObjectWithInt = new MyGenericObject2<int>();
		 * 
		 * does not compile because the syntax is wrong. When using
		 * generics, we need to specify the class of the type, not 
		 * the type itself. So in this case, we would need to use:
		 * 
		 * MyGenericObject2<Integer> MyGenericObjectWithInt = new MyGenericObject2<Integer>();
		 * 
		 */
		MyGenericObject2<Integer> myGenericObjectWithInt = new MyGenericObject2<Integer>(1);
		myGenericObjectWithInt.showData();

		// Part ii.
		MyGenericObject2<Character> myGenericObjectWithCharacter = new MyGenericObject2<Character>('s');
		myGenericObjectWithCharacter.showData();

		// Part iii.
		MyGenericObject2<Double> myGenericObjectWithDouble = new MyGenericObject2<Double>(1.0);
		myGenericObjectWithDouble.showData();

		// Part iv.
		MyGenericObject2<Boolean> myGenericObjectWithBoolean = new MyGenericObject2<Boolean>(true);
		myGenericObjectWithBoolean.showData();

		// Part v.
		MyGenericObject2<String> myGenericObjectWithString = new MyGenericObject2<String>("Hi! :)");
		myGenericObjectWithString.showData();
	}
}

	
/*
 * Part c.
 * 
 * The wrapper classes in Java differ from the primitive types in that
 * the wrapper classes are provided to represent the primitive types as
 * Objects.
 * 
 * In a memory diagram, the wrapper classes would point to the 
 * primitive type, they are not stored in the same memory
 * address:
 * 
 * -----------------------------------------
 * Character  |  |  |  |  |  | 's' |  |		   (Takes up 4 bytes in memory.)
 * -----------------------------------------
 *     |------Points to--------->
 *     
 *    
 * -------------------------------------
 * Double  |  |  |  |  |  | 1.0 |  |           (Takes up 4 bytes in memory.)
 * -------------------------------------
 *     |------Points to------>
 *     
 *     
 * --------------------------------------
 * Boolean  |  |  |  |  |  | true |  |          (Takes up 4 bytes in memory.)
 * --------------------------------------
 *     |-------Points to------>
 *     
 *     
 * ------------------------------------------
 * String  |  |  |  |  |  | "Hi! :)" |  |        (Takes up 4 bytes in memory.)
 * ------------------------------------------
 *     |-----Points to--------->
 * 
 * 
 * 
 * 
 * OUTPUT OF CODE:
 * 
 * 1
 * s
 * 1.0
 * true
 * Hi! :)
 * 
 */
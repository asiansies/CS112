/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 07
 * 
 * Note: Output at the end of file.
 * 
 */

public class MainApp {

	public static void main(String[] args) {
		// Create linked list with integers.
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();

		intList.addFirst(34);
		intList.addFirst(21);
		intList.addFirst(13);
		intList.addFirst(8);
		intList.addFirst(5);
		intList.addFirst(3);
		intList.addFirst(2);
		intList.addFirst(1);
		intList.addFirst(1);

		// Print contents of integer list using a for loop with
		// the position method.
		System.out.println("Printing integer list using for loop...");
		try {
			for (Position<Integer> pos = intList.first(); !pos.isNull(); pos = intList.next(pos)) {
				System.out.println(pos.element());
			}
		} catch (InvalidPositionException e) {
		}

		// Print the contents of integer list using a while loop
		// with an iterator.
		System.out.println("Printing integer list using while loop...");
		NodeListIterator<Integer> intIt = intList.iterator();
		while (intIt.hasNext()) {
			Integer x = intIt.next();
			System.out.println(x);
		}

		// Print the contents of integer list using a for-each
		// loop.
		System.out.println("Printing integer list using for-each loop...");
		for (Integer x : intList) {
			System.out.println(x);
		}
		
		
		// Create linked list with doubles.
		MyLinkedList<Double> doubleList = new MyLinkedList<Double>();

		doubleList.addFirst(6.283185);
		doubleList.addFirst(3.14159);
		doubleList.addFirst(2.71828);
		doubleList.addFirst(1.61803);

		// Print contents of double list using a for loop with
		// the position method.
		System.out.println("Printing double list using for loop...");
		try {
			for (Position<Double> pos = doubleList.first(); !pos.isNull(); pos = doubleList.next(pos)) {
				System.out.println(pos.element());
			}
		} catch (InvalidPositionException e) {
		}

		// Print the contents of double list using a while loop
		// with an iterator.
		System.out.println("Printing double list using while loop...");
		NodeListIterator<Double> doubleIt = doubleList.iterator();
		while (doubleIt.hasNext()) {
			Double x = doubleIt.next();
			System.out.println(x);
		}
		
		// Print the contents of integer list using a for-each
		// loop.
		System.out.println("Printing double list using for-each loop...");
		for (Double x : doubleList) {
			System.out.println(x);
		}
		
		
		// Create linked list with strings.
		MyLinkedList<String> stringList = new MyLinkedList<String>();

		stringList.addFirst("Ace");
		stringList.addFirst("King");
		stringList.addFirst("Queen");
		stringList.addFirst("Jack");
		stringList.addFirst("10");

		// Print contents of double list using a for loop with
		// the position method.
		System.out.println("Printing string list using for loop...");
		try {
			for (Position<String> pos = stringList.first(); !pos.isNull(); pos = stringList.next(pos)) {
				System.out.println(pos.element());
			}
		} catch (InvalidPositionException e) {
		}

		// Print the contents of integer list using a while loop
		// with an iterator.
		System.out.println("Printing string list using while loop...");
		NodeListIterator<String> stringIt = stringList.iterator();
		while (stringIt.hasNext()) {
			String x = stringIt.next();
			System.out.println(x);
		}
		
		// Print the contents of integer list using a for-each
		// loop.
		System.out.println("Printing string list using for-each loop...");
		for (String x : stringList) {
			System.out.println(x);
		}
	}
}


/* 
 * OUTPUT OF CODE:
 *
 * Printing integer list using for loop...
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34
 * Printing integer list using while loop...
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34
 * Printing integer list using for-each loop...
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34
 * Printing double list using for loop...
 * 1.61803
 * 2.71828
 * 3.14159
 * 6.283185
 * Printing double list using while loop...
 * 1.61803
 * 2.71828
 * 3.14159
 * 6.283185
 * Printing double list using for-each loop...
 * 1.61803
 * 2.71828
 * 3.14159
 * 6.283185
 * Printing string list using for loop...
 * 10
 * Jack
 * Queen
 * King
 * Ace
 * Printing string list using while loop...
 * 10
 * Jack
 * Queen
 * King
 * Ace
 * Printing string list using for-each loop...
 * 10
 * Jack
 * Queen
 * King
 * Ace
 * 
 */
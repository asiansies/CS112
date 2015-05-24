/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 05
 * 
 * Note: Output included at the end of this file.
 * 
 */

public class Problem2 {
	public static void main(String[] args) {
		// Part a. Create a list of Node objects.
		Node<String> node4 = new Node<String>("Four", null);
		Node<String> node3 = new Node<String>("Three", node4);
		Node<String> node2 = new Node<String>("Two", node3);
		Node<String> node1 = new Node<String>("One", node2);

		// Part b. A for loop that prints out the String values in each Node.
		System.out.println("Printing linked list...");
		for (Node<String> i = node1; i != null; i = i.next) {
			System.out.println(i.s);
		}
		System.out.println();
		
		// Part c. Remove node3 from the list and print out the new list.
		node2.next = node4;
		node3.next = null;
		
		System.out.println("node3 has now been removed. Printing new list...");
		for (Node<String> i = node1; i != null; i = i.next) {
			System.out.println(i.s);
		}
	}
}


/*
 * OUTPUT OF CODE:
 *
 * Printing linked list...
 * One
 * Two
 * Three
 * Four
 * 
 * node3 has now been removed. Printing new list...
 * One
 * Two
 * Four
 *
 */
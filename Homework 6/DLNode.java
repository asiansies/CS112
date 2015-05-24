/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 06
 * 
 * Note: Problem 1.
 *       Output included at the end of this file.
 * 
 */

// Part A.
public class DLNode<T> {
	DLNode<T> next;
	DLNode<T> prev;

	T value;

	// Constructor for doubly-linked node.
	public DLNode(T value) {
		this.value = value;
	}

	// Part B.
	public static void main(String[] args) {
		DLNode dln1 = new DLNode<String>("One");
		DLNode dln2 = new DLNode<String>("Two");
		DLNode dln3 = new DLNode<String>("Three");
		DLNode dln4 = new DLNode<String>("Four");

		dln1.next = dln2;
		dln2.prev = dln1;
		dln2.next = dln3;
		dln3.prev = dln2;
		dln3.next = dln4;
		dln4.prev = dln3;

		printBothWays(dln1);

		// Part C. Add a node containing "Zero" to the front of the list.
		DLNode<String> dln0 = new DLNode("Zero");
		dln0.next = dln1;
		dln1.prev = dln0;

		// Add a node containing "Five" to the end of the list.
		DLNode<String> dln5 = new DLNode("Five");
		dln4.next = dln5;
		dln5.prev = dln4;

		System.out.println("\"Zero\" and \"Five\" added.");
		printBothWays(dln0);
		
		// Part D. Insert the node with "Two-and-one-half" after "Two".
		DLNode<String> dln2b = new DLNode<String>("Two-and-a-half");
		dln2b.prev = dln2;
		dln2b.next = dln3;
		dln2.next = dln2b;
		dln3.prev = dln2b;
		
		System.out.println("\"Two-and-a-half\" added.");
		printBothWays(dln0);
		
		// Part E. Reverse the list and print forward and backward.
		DLNode<String> prevNode;
		DLNode<String> nextNode;
		
		for (DLNode<String> node = dln0; node != null; node = nextNode) {
			nextNode = node.next;
			prevNode = node.prev;
			
			node.next = prevNode;
			node.prev = nextNode;
		}
		
		System.out.println("List has been reversed.");
		printBothWays(dln5);

	}

	// Print the doubly-linked nodes forward and backward.
	private static void printBothWays(DLNode<String> firstNode) {

		DLNode<String> node;
		DLNode<String> lastNodeProcessed = firstNode;

		System.out.println("Printing forward and backward...");
		for (node = firstNode; node != null; node = node.next) {
			System.out.println(node.value);
			lastNodeProcessed = node;
		}

		for (node = lastNodeProcessed; node != null; node = node.prev) {
			System.out.println(node.value);
			lastNodeProcessed = node;
		}
		
		System.out.println();
	}
}


// TO-DO: Part F.

/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 06
 * 
 * Note: Problem 2.
 *       Output included at the end of this file.
 * 
 */

public class DLNDeque<T> {
	private DLNode<T> firstNode;
	private DLNode<T> lastNode;
	
	private int size;

	// Create an empty deque.
	public DLNDeque() {
		DLNode<T> node = new DLNode<T>(null);
		firstNode = node;
		lastNode = node;
		size = 0;
	}
	
	// Add a value to the front.
	public void addFirst(T value) {
		if (firstNode == lastNode && firstNode.value == null) {
			firstNode.value = value;
			size++;
		} else {
			DLNode<T> newNode = new DLNode<T>(value);
			newNode.next = firstNode;
			firstNode.prev = newNode;
			firstNode = newNode;
			size++;
		}
	}

	// Add a value to the end.
	public void addLast(T value) {
		if (firstNode == lastNode && lastNode.value == null) {
			lastNode.value = value;
			size++;
		} else {
			DLNode<T> newNode = new DLNode<T>(value);
			newNode.prev = lastNode;
			lastNode.next = newNode;
			lastNode = newNode;
			size++;
		}
	}
	
	// Get the number of values in the deque.
	public int size() {
		return size;
	}
	
	// Check if the deque is empty.
	public boolean isEmpty() {
		return (size ==0);
	}
	
	// Look at the first value.
	public T getFirst() throws EmptyDequeException {
		if (isEmpty()) {
			throw new EmptyDequeException("Empty Deque!");
		} 
		return firstNode.value;			
	}
	
	// Look at the end value.
	public T getLast() throws EmptyDequeException {
		if (isEmpty()) {
			throw new EmptyDequeException("Empty Deque!");
		} 
		return lastNode.value;			
	}
	
	// Remove the front value.
		public void removeFirst() throws EmptyDequeException {
			if (isEmpty()) {
				throw new EmptyDequeException("Empty Deque!");
			}
			firstNode = firstNode.next;
			firstNode.prev = null;
			size--;
		}
		
	// Remove the end value.
	public void removeLast() throws EmptyDequeException {
		if (isEmpty()) {
			throw new EmptyDequeException("Empty Deque!");
		}
		lastNode = lastNode.prev;
		lastNode.next = null;
		size--;
	}
	
	// Print state of deque.
	public void printDeque() {
		DLNode<T> node;
		DLNode<T> lastNodeProcessed = firstNode;
		
		String myDeque = "(";
		for (node = firstNode; node != null; node = node.next) {			
			myDeque = myDeque + node.value + ", ";
			lastNodeProcessed = node;
		}
		System.out.println(myDeque.substring(0, myDeque.length() - 2) + ")");
	}
	
	public static void main(String[] args) {
		// Part B(i):
		DLNDeque myDeque = new DLNDeque<Integer>();
		myDeque.printDeque();
		
		// Part B(ii):
		myDeque.addFirst(5);
		myDeque.printDeque();
		
		// Part B(iii):
		myDeque.addFirst(3);
		myDeque.printDeque();
		
		// Part B(iv):
		myDeque.addLast(9);
		myDeque.printDeque();
		
		// Part B(v):
		try {
			System.out.println(myDeque.getFirst());
		} catch (EmptyDequeException e) {
			e.printStackTrace();
		}
		myDeque.printDeque();
		
		// Part B(vi):
		try {
			System.out.println(myDeque.getLast());
		} catch (EmptyDequeException e) {
			e.printStackTrace();
		}
		myDeque.printDeque();
		
		// Part B(vii):
		try {
			myDeque.removeLast();
		} catch (EmptyDequeException e) {
			e.printStackTrace();
		}
		myDeque.printDeque(); 
		
		// Part B(viii):
		System.out.println(myDeque.size());
		myDeque.printDeque();
		
		// Part B(ix):
		if (myDeque.isEmpty()) {
			System.out.println("Deque is empty!");
		} else {
			System.out.println("Deque is not empty.");
		}
		
		// Part B(x):
		try {
			myDeque.removeFirst();
		} catch (EmptyDequeException e) {
			e.printStackTrace();
		}
		myDeque.printDeque(); 
	}
}


/*
 * OUTPUT OF CODE:
 *
 * (null)
 * (5)
 * (3, 5)
 * (3, 5, 9)
 * 3
 * (3, 5, 9)
 * 9
 * (3, 5, 9)
 * (3, 5)
 * 2
 * (3, 5)
 * Deque is not empty.
 * (5)
 *
 */
/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 06
 * 
 * Note: Problem 3.
 *       Output included at the end of this file.
 * 
 */

import java.util.ArrayList;

public class ALDeque<T> {
	private ArrayList<T> myDeque = new ArrayList<T>();

	// Creates an empty deque.
	public ALDeque() {
	}

	// Returns size of deque.
	public int size() {
		return myDeque.size();
	}

	// Checks if deque is empty.
	public boolean isEmpty() {
		return myDeque.isEmpty();
	}

	// Get the first value in deque.
	public T getFirst() throws EmptyDequeException {
		if (isEmpty()) {
			throw new EmptyDequeException("Empty Deque!");
		} 
		return myDeque.get(0);	
	}

	// Get the last value in deque.
	public T getLast() throws EmptyDequeException {
		if (isEmpty()) {
			throw new EmptyDequeException("Empty Deque!");
		} 
		return myDeque.get(myDeque.size() - 1);	
	}

	// Add an element to the front of the deque.
	public void addFirst(T value) {
		myDeque.add(0, value);
	}

	// Add an element to the end of the deque.
	public void addLast(T value) {
		myDeque.add(size(), value);
	}

	// Remove first value.
	public void removeFirst() throws EmptyDequeException {
		if (isEmpty()) {
			throw new EmptyDequeException("Empty Deque!");
		} 
		myDeque.remove(0);	
	}

	// Remove last value.
	public void removeLast() throws EmptyDequeException {
		if (isEmpty()) {
			throw new EmptyDequeException("Empty Deque!");
		} 
		myDeque.remove(myDeque.size() - 1);	
	}

	// Print state of deque.
	public void printDeque() {
		if (myDeque.isEmpty()) {
			System.out.println("Empty.");
		} else {
			String myDequeString = "(";
			for (int i = 0; i < myDeque.size(); i++) {			
				myDequeString = myDequeString + myDeque.get(i) + ", ";
			}
			System.out.println(myDequeString.substring(0, myDequeString.length() - 2) + ")");
		}
	}

	public static void main(String[] args) {
		// Create empty deque.
		ALDeque myDeque = new ALDeque<Integer>();
		myDeque.printDeque();

		// Add 5 to the front.
		myDeque.addFirst(5);
		myDeque.printDeque();

		// Add 3 to the front.
		myDeque.addFirst(3);
		myDeque.printDeque();

		// Add 9 to the end.
		myDeque.addLast(9);
		myDeque.printDeque();

		// Look at the front value.
		try {
			System.out.println(myDeque.getFirst());
		} catch (EmptyDequeException e) {
			e.printStackTrace();
		}
		myDeque.printDeque();

		// Look at the end value.
		try {
			System.out.println(myDeque.getLast());
		} catch (EmptyDequeException e) {
			e.printStackTrace();
		}
		myDeque.printDeque();

		// Remove the end value.
		try {
			myDeque.removeLast();
		} catch (EmptyDequeException e) {
			e.printStackTrace();
		}
		myDeque.printDeque(); 

		// Get the number of values in deque.
		System.out.println(myDeque.size());
		myDeque.printDeque();

		// Check if deque is empty.
		if (myDeque.isEmpty()) {
			System.out.println("Deque is empty!");
		} else {
			System.out.println("Deque is not empty.");
		}

		// Remove the front value.
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
 * Empty.
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
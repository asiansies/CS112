/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 05
 * 
 * Note: Problem 3, Part c
 *       Output included at the end of this file.
 * 
 */

import java.util.*;

interface GenericStack<T> {
	public void push(T e);
	public T pop();
	public T top();
	public int size();
	public boolean isEmpty();
}

public class MyGenericStack<T> implements GenericStack<T> {
	int t = -1;
	int capacity = 5;

	Object[] arr = new Object[5];

	// Returns the size of the stack.
	public int size() {
		return t + 1;
	}

	// Returns true if the stack is empty, false if it isn't.
	public boolean isEmpty() {
		return (t < 0);
	}

	// Adds to the stack.
	public void push(T e) {
		t = t + 1;
		arr[t] = e;
	}

	// Returns and removes the top element from the stack.
	public T pop(){
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		T top = (T)arr[t];
		arr[t] = null;
		t = t - 1;
		return top;
	}

	// Returns the top element of s stack without removing it.
	public T top() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return (T)arr[t];
	}

	// Reverses arrays containing 5 characters, doubles, and strings.
	public static void main(String[] args) {
		MyGenericStack<Character> charStack = new MyGenericStack<Character>();
		char[] charArray = {'A', 'I', 'H', 'O', 'A'};

		MyGenericStack<Double> doubleStack = new MyGenericStack<Double>();
		double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};

		MyGenericStack<String> stringStack = new MyGenericStack<String>();
		String[] strArray = {"Am", "I", "reversed", "now", "?"};

		System.out.println("Input character array: " + Arrays.toString(charArray));
		System.out.println("Input double array: " + Arrays.toString(doubleArray));
		System.out.println("Input String array: " + Arrays.toString(strArray));
		System.out.println("--------------------------------------------------");

		for (int i = 0; i < strArray.length; i++) {
			charStack.push(charArray[i]);
			doubleStack.push(doubleArray[i]);
			stringStack.push(strArray[i]);
		}
		for (int i = 0; i < strArray.length; i++) {
			charArray[i] = charStack.pop();
			doubleArray[i] = doubleStack.pop();
			strArray[i] = stringStack.pop();
		}

		System.out.println("Reversed character array: " + Arrays.toString(charArray));
		System.out.println("Reversed double array: " + Arrays.toString(doubleArray));
		System.out.println("Reversed String array: " + Arrays.toString(strArray));
	}
}


/* 
 * OUTPUT OF CODE:
 * 
 * Input character array: [A, I, H, O, A]
 * Input double array: [1.0, 2.0, 3.0, 4.0, 5.0]
 * Input String array: [Am, I, reversed, now, ?]
 * --------------------------------------------------
 * Reversed character array: [A, O, H, I, A]
 * Reversed double array: [5.0, 4.0, 3.0, 2.0, 1.0]
 * Reversed String array: [?, now, reversed, I, Am]
 *
 */
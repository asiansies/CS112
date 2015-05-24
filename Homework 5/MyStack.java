/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 05
 * 
 * Note: Problem 3, Parts a and b. (Part c is located in MyGenericStack.java)
 *       Output included at the end of this file.
 * 
 */

import java.util.*;

interface Stack {
	public void push(String s);
	public String pop();
	public String top();
	public int size();
	public boolean isEmpty();
}

public class MyStack implements Stack {
	int t = -1;
	int capacity = 5;
	
	String[] strings = new String[capacity];
	
	// Returns the size of the stack.
	public int size() {
		return t + 1;
	}
	
	// Returns true if the stack is empty, false if it isn't.
	public boolean isEmpty() {
		return (t < 0);
	}
	
	// Adds to the stack.
	public void push(String s) {
		t = t + 1;
		strings[t] = s;
	}
	
	// Returns and removes the top element from the stack.
	public String pop(){
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		String top = strings[t];
		strings[t] = null;
		t = t - 1;
		return top;
	}
	
	// Returns the top element of s stack without removing it.
	public String top() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		return strings[t];
	}
	
	// Reverses and array of 5 Strings.
	public static void main(String[] args) {
		MyStack stringStack = new MyStack();
		String[] strArray = {"Am", "I", "reversed", "now", "?"};
		
		System.out.println("Input array: " + Arrays.toString(strArray));
		
		for (int i = 0; i < strArray.length; i++) {
			stringStack.push(strArray[i]);
		}
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = stringStack.pop();
		}
		
		System.out.println("Reversed array: " + Arrays.toString(strArray));
	}
}


/* 
 * OUTPUT OF CODE:
 *
 * Input array: [Am, I, reversed, now, ?]
 * Reversed array: [?, now, reversed, I, Am]
 *
 */
/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 05
 * 
 * Note: Output included at the end of this file.
 * 
 */

import java.util.EmptyStackException;

public class MyListBasedStack<T> implements GenericStack<T>{
	Node<T> topnode = new Node<T>();
	int t = -1;

	// Creates an empty stack.
	public MyListBasedStack() {
		topnode = null;
	}

	// Returns the size of the stack.
	public int size() {
		return t + 1;
	}

	// Returns true if the stack is empty, false if it isn't.
	public boolean isEmpty() {
		return (topnode == null);
	}

	// Adds to the stack.
	public void push(T e) {
		Node<T> newNode = new Node<T>(e, topnode);
		topnode = newNode;
		t = t + 1;

	}

	// Returns and removes the top element from the stack.
	public T pop(){
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		T temp = topnode.s;
		topnode = topnode.next;
		t = t - 1;
		return temp;
	}

	// Returns the top element of s stack without removing it.
	public T top() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return topnode.s;
	}

	// Return true if a mathematical expression has matched
	// parenthesis.
	public static boolean hasBalancedParenthesis(String mathExpression) {
		MyListBasedStack<Character> stack = new MyListBasedStack<Character>();
		for (int i = 0; i < mathExpression.length(); i++) {
			if (mathExpression.charAt(i) == '(') {
				stack.push(mathExpression.charAt(i));
			} else if (mathExpression.charAt(i) == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		return (stack.isEmpty());
	}
	
	public static void main(String[] args) {
		System.out.println("Input expression: (x + (y - z))");
		if (hasBalancedParenthesis("(x + (y - z))")) {
			System.out.println("Parenthesis match!\n");
		} else {
			System.out.println("Mismatched parenthesis!\n");
		}
		
		System.out.println("Input expression: (x - y * (z + 8)");
		if (hasBalancedParenthesis("(x - y * (z + 8)")) {
			System.out.println("Parenthesis match!\n");
		} else {
			System.out.println("Mismatched parenthesis!\n");
		}
		
		System.out.println("Input expression: (x + y - z))");
		if (hasBalancedParenthesis("(x + y - z))")) {
			System.out.println("Parenthesis match!\n");
		} else {
			System.out.println("Mismatched parenthesis!\n");
		}
		
		System.out.println("Input expression: (x - y * z + 8)");
		if (hasBalancedParenthesis("(x - y * z + 8)")) {
			System.out.println("Parenthesis match!\n");
		} else {
			System.out.println("Mismatched parenthesis!\n");
		}
		
		System.out.println("Input expression: (x - y (z+8))");
		if (hasBalancedParenthesis("(x - y (z+8))")) {
			System.out.println("Parenthesis match!\n");
		} else {
			System.out.println("Mismatched parenthesis!\n");
		}
		
		System.out.println("Input expression: (x - y * (z+8)) - w)");
		if (hasBalancedParenthesis("(x - y * (z+8)) - w)")) {
			System.out.println("Parentheses match!\n");
		} else {
			System.out.println("Mismatched parentheses!\n");
		}		
	} 
}

/*
 * OUTPUT OF CODE:
 *
 * Input expression: (x + (y - z))
 * Parentheses match!
 * 
 * Input expression: (x - y * (z + 8)
 * Mismatched parentheses!
 * 
 * Input expression: (x + y - z))
 * Mismatched parentheses!
 * 
 * Input expression: (x - y * z + 8)
 * Parentheses match!
 * 
 * Input expression: (x - y (z+8))
 * Parentheses match!
 * 
 * Input expression: (x - y * (z+8)) - w)
 * Mismatched parentheses!
 * 
 */ 
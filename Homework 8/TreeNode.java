/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 08
 * 
 */

import java.util.*;

public class TreeNode<T> {
	TreeNode<T> parent;
	TreeNode<T> leftChild;
	TreeNode<T> rightChild;
	T value;

	public TreeNode(T value) {
		this.value = value;
	}

	public void display() {
		if (value == null) {
			System.out.println("null");
		} else {
			System.out.println(value);
		}

		if (leftChild == null) {
			System.out.println("null");
		} else {
			leftChild.display();
		}

		if (rightChild == null) {
			System.out.println("null");
		} else {
			rightChild.display();
		}
	}

	public int depth() {
		int depth = 0;
		TreeNode<T> current = this;
		
		while (current.parent != null) {
			depth++;
			current = current.parent;
		}
		
		return depth;
	}

	public void printTree() {
		Queue<TreeNode<T>> q = new LinkedList<TreeNode<T>>();
		int depth = this.depth();
		
		q.offer(this);

		while (!q.isEmpty()) {
			
			TreeNode<T> val = q.poll();
			
			if (val.depth() != depth) {
				System.out.println();
				depth = val.depth();
			}
			
			System.out.print(val.value + " ");
			
			if (val.leftChild != null) {
				q.offer(val.leftChild);
			}

			if (val.rightChild != null) {
				q.offer(val.rightChild);
			}
		}
	}
}

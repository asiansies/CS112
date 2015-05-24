/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 08
 * 
 */

import java.util.*;

public class FastHeap<T extends Comparable<T>> {
	ArrayList<HeapNode<T>> heap;

	// Constructor that creates an ArrayList object to
	// implement a heap.
	public FastHeap() {
		heap = new ArrayList<HeapNode<T>>();
		HeapNode<T> nullNode = new HeapNode<T>(null);
		heap.add(nullNode);
	}

	// Returns true if the heap has a root.
	public boolean hasRoot() {
		return (heap.get(1) != null);
	}

	// Returns the index of the root if one exists. If the 
	// heap does not have a root, returns -1.
	public int root() {
		if (this.hasRoot()) {
			return 1;
		}
		return -1;
	}

	// Returns the value at the specified index.
	public T value(int index) {
		return (heap.get(index).value);
	}

	// Removes a node from the heap.
	public T remove() {
		if (heap.size() - 1 == 0) {
			return null;
		}
		
		int current = 1;
		HeapNode<T> value = heap.get(current);
		heap.set(current, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);

		int minChild = compare(current);

		while (minChild != current) {
			swap(current, minChild);
			current = minChild;
			minChild = compare(current);
		}

		return value.value;
	}

	// Compares nodes to its children if any exist, and returns
	// the index of the node with the smallest value.
	private int compare(int index) {
		int minChild = index;
		
		int leftChild = 2 * index;
		int rightChild = (2 * index) + 1;

		if (rightChild > (heap.size() - 1)|| leftChild > (heap.size() - 1)) {
			return minChild;
		}

		if (heap.get(leftChild).value.compareTo(heap.get(rightChild).value) < 0) {
			minChild = leftChild;
		} else {
			minChild = rightChild;
		}

		return minChild;
	}

	// Swaps the two objects at given indices.
	private void swap(int first, int second) {
		HeapNode<T> temp = heap.get(first);
		heap.set(first,  heap.get(second));
		heap.set(second, temp);			
	}

	// Returns true if a node has a parent.
	public boolean hasParent(int index) {
		return (heap.get(index/2) != null);
	}

	// Returns the index of a specified node's parents.
	public int parent(int index) {
		return index/2;
	}

	// Returns true if a node has a left child.
	public boolean hasLeft(int index) {
		return (heap.get(index*2) != null);
	}

	// Returns the index of a nodes left child.
	public int left(int index) {
		return (index * 2);
	}

	// Returns true if a node has a right child.
	public boolean hasRight(int index) {
		return (heap.get((index * 2) - 1) != null);
	}

	// Returns the index of a node's right child.
	public int right(int index) {
		return ((index * 2) + 1);
	}

	// Returns true if the specified node is an external
	// node and false otherwise.
	public boolean isExternal(int index) {
		if (index > heap.size() - 1 || index < 1) {
			System.out.println("This node doesn't exist!");
			return false;
		}
		return ((heap.get(index *2)) == null && heap.get((index * 2) + 1) == null);
	}

	// Returns true if the specified node is an internal
	// node and false otherwise.
	public boolean isInternal(int index) {
		if (index > heap.size() - 1 || index < 1) {
			System.out.println("This node doesn't exist!");
			return false;
		}
		return ((heap.get(index *2)) != null || heap.get((index * 2) + 1) != null);
	}

	// Adds a node to the heap.
	public void addNode(T value) {
		HeapNode<T> nodeToAdd = new HeapNode<T>(value);

		heap.add(nodeToAdd);

		if (heap.indexOf(nodeToAdd) != 0) {
			int index = heap.indexOf(nodeToAdd);

			while (parent(index) >= 1 && (heap.get(parent(index)).value).compareTo(heap.get(index).value) > 0) {
				swap(index, parent(index));
				index = parent(index);
			}
		}		
	}

	// Print graphical representation of the tree.
	public void display() {
		if (heap.get(1) == null) {
			System.out.println("Empty heap.");
		} else {
			
			//System.out.println(heap.get(1).value);
			int level = 0;

			for (int i = 1; i < heap.size(); i++) {
				if (i > (Math.pow(2, level + 1) - 1)) {
					System.out.println();
					level++;
				}

				System.out.print(heap.get(i).value + " ");
			}
		}
	}

	// Returns the size of the tree.
	public int size() {
		return heap.size() - 1;
	}
}

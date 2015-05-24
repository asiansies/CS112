/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 07
 * 
 */

import java.lang.Iterable;

public class MyLinkedList<T> implements Iterable<T> {
	private DLNode<T> firstNode;
	private DLNode<T> lastNode;
	private T value;
	private int size;

	// Returns size of list.
	public int size() {
		return size;
	}

	// Returns true if list is empty.
	public boolean isEmpty() {
		return size == 0;
	}

	// Returns position of first node.
	public Position<T> first() {
		Position<T> pos = new Position<T>(firstNode);

		return pos;
	}

	// Returns position of last node.
	public Position<T> last() {
		Position<T> pos = new Position<T>(lastNode);

		return pos;
	}

	// Returns position of previous node.
	public Position<T> prev(Position<T> pos) throws InvalidPositionException {
		if (!pos.isValid()) {
			throw new InvalidPositionException("Invalid position!");
		}

		DLNode<T> node = pos.getNode();
		DLNode<T> prevNode = null;

		if (node != null) {
			prevNode = node.prev();
		}

		Position<T> prevPos = new Position<T>(prevNode);

		return prevPos;
	}

	// Returns position of next node.
	public Position<T> next(Position<T> pos) throws InvalidPositionException {
		if (!pos.isValid()) {
			throw new InvalidPositionException("Invalid position!");
		}

		DLNode<T> node = pos.getNode();
		DLNode<T> nextNode = null;

		if (node != null) {
			nextNode = node.next();
		}

		Position<T> nextPos = new Position<T>(nextNode);

		return nextPos;
	}

	// Adds node to beginning of list.
	public void addFirst(T value) {
		DLNode<T> newNode = new DLNode<T>(value);
		newNode.setNext(firstNode);

		if (firstNode != null) {
			firstNode.setPrev(newNode);
		}

		firstNode = newNode;

		if (lastNode == null) {
			lastNode = newNode;
		}
		
		size++;
	}

	// Adds node to end of list.
	public void addLast(T value) {
		DLNode<T> newNode = new DLNode<T>(value);
		newNode.setPrev(lastNode);

		if (lastNode != null) {
			lastNode.setNext(newNode);
		}

		lastNode = newNode;

		if (firstNode == null) {
			firstNode = newNode;
		}
		
		size++;
	}

	// Adds a node at a position before the specified position.
	public void addBefore(Position<T> pos, T value) throws InvalidPositionException {
		DLNode<T> first = firstNode;
		DLNode<T> newNode = new DLNode<T>(value);

		for (DLNode<T> i = first; i != null; i = i.next()) {
			if (pos.getNode() == i) {
				newNode.setNext(i);
				newNode.setPrev(i.prev());
				(i.prev()).setNext(newNode);
				i.setPrev(newNode);
				break;
			}
		}
		
		size++;
	}

	// Adds a node after the specified position.
	public void addAfter(Position<T> pos, T value) throws InvalidPositionException {
		DLNode<T> first = firstNode;
		DLNode<T> newNode = new DLNode<T>(value);

		for (DLNode<T> i = first; i != null; i = i.next()) {
			if (pos.getNode() == i) {
				newNode.setPrev(i);
				newNode.setNext(i.next());
				(i.next()).setPrev(newNode);
				i.setNext(newNode);
				break;
			}
		}
		
		size++;
	}

	// Sets a node to a position.
	public T set(Position<T> pos, T value) throws InvalidPositionException {
		if (!pos.isValid()) {
			throw new InvalidPositionException("");
		}

		DLNode<T> node = pos.getNode();
		T val = null;

		if (node != null) {
			val = node.setValue(value);
		}

		return val;
	}

	// Removes a node from the list.
	public T remove(Position<T> pos) throws InvalidPositionException {
		if (!pos.isValid()) {
			throw new InvalidPositionException("");
		}

		DLNode<T> node = pos.getNode();
		T val = null;

		if (node != null) {
			val = node.value();
			(node.prev()).setNext(node.next());
			(node.next()).setPrev(node.prev());
			node.setInvalid();
		}

		size--;
		return val;
	}
	
	// Creates an iterator.
	public NodeListIterator<T> iterator() {
		return new NodeListIterator<T>(this);
	}

}
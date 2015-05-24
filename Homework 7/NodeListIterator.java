/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 07
 * 
 * NodeListIterator class.
 * 
 */

import java.util.*;

public class NodeListIterator<T> implements Iterator<T> {
	Position<T> pos = new Position<T>(null);
	MyLinkedList<T> list;
	
	// Constructor.
	public NodeListIterator(MyLinkedList<T> list) {
		this.pos = list.first();
		this.list = list;
	}
	
	// Returns true if there is a next element in the list.
	public boolean hasNext() {
		return (!pos.isNull());
	}
	
	// Returns next value.
	public T next() {
		if (pos.isNull()) {
			return null;
		} 
		try {
			T value = pos.element();
			pos = list.next(pos);
			return value;
		} catch (InvalidPositionException e) {
			return null;
		}
	}

	// Removes a value. Not implemented.
	public void remove() {
	}
}

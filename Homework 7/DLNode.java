/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 07
 * 
 * A class for doubly-linked nodes.
 * 
 */

public class DLNode<T> {
	private DLNode<T> next;
	private DLNode<T> prev;
	private T value;
	private boolean isValid;
	
	// Constructor.
	public DLNode(T value) {
		this.value = value;
		isValid = true;
	}
	
	// Returns next node.
	public DLNode<T> next() {
		return next;
	}
	
	// Returns previous node.
	public DLNode<T> prev() {
		return prev;
	}
	
	// Sets the next node.
	public void setNext(DLNode<T> next) {
		this.next = next;
	}
	
	// Sets the previous node.
	public void setPrev(DLNode<T> prev) {
		this.prev = prev;
	}
	
	// An accessor method to retrieve the value in a node.
	public T value() {
		return value;
	}
	
	// Sets the value of a node.
	public T setValue(T value) {
		T val = this.value;
		this.value = value;
		
		return val;
	}
	
	// Returns true if the node is valid.
	public boolean isValid() {
		return isValid;
	}
	
	//Sets a node to invalid.
	public void setInvalid() {
		this.isValid = false;
	}
}
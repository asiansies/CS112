/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 07
 * 
 */

public class Position<T> {
	private DLNode<T> node;
	
	// Constructor.
	public Position(DLNode<T> node) {
		this.node = node;
	}
	
	// Returns the node.
	public DLNode<T> getNode() {
		return node;
	}
	
	// Returns the value stored in a node.
	public T element() throws InvalidPositionException {
		if (node == null) {
			throw new InvalidPositionException("Invalid position!");
		}
		return node.value();
	}
	
	// Returns true if the node contains a null value.
	public boolean isNull() {
		return (node == null);
	}
	
	// Returns true if two nodes are equal.
	public boolean equals(Position<T> pos) {
		return (this.node == pos.node);
	}
	
	// Returns true if a node is valid.
	public boolean isValid() {
		return (node != null && node.isValid());
	}
}

/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 05
 * 
 */

public class Node<T> {
	Node<T> next;
	T s;
	
	public Node() {
		this(null, null);
	}
	
	public Node(T s, Node<T> next) {
		this.s = s;		
		this.next = next;
	}
}
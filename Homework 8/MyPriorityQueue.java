/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 08
 * 
 * Priority queue class implemented using a FastHeap.
 * 
 */

import java.util.ArrayList;

public class MyPriorityQueue<T extends Comparable<T>> {
	FastHeap<T> q;
	ArrayList<T> qCopy;
	
	public MyPriorityQueue () {
		q = new FastHeap<T>();
		qCopy = new ArrayList<T>();
	}
	
	public int size() {
		return q.size();
	}
	
	public boolean isEmpty() {
		return (q.size() == 0);
	}
	
	public T min() {
		return q.value(q.root());
	}
	
	public void insert(T value) {
		q.addNode(value);
		qCopy.add(value);
	}
	
	public T removeMin() {
		return q.remove();
	}
	
}

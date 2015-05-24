/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 08
 * 
 * Note: Output included at the end of this file.
 * 
 * Tester class for both problems 2 and 3.
 * 
 */

import java.util.ArrayList;

public class HeapTester {

	public static void main(String[] args) {
		// Create heap.
		FastHeap<String> stringHeap = new FastHeap<String>();
		
		// Add nodes to the heap.
		stringHeap.addNode("gamma");
		stringHeap.addNode("delta");
		stringHeap.addNode("epsilon");
		stringHeap.addNode("zeta");
		stringHeap.addNode("beta");
		stringHeap.addNode("eta");
		stringHeap.addNode("theta");
		stringHeap.addNode("iota");
		stringHeap.addNode("kappa");
		
		// Display heap.
		stringHeap.display();
		
		System.out.println();
		System.out.println();
		
		// Add another node to the heap and redisplay.
		stringHeap.addNode("alpha");
		stringHeap.display();
		
		System.out.println();
		System.out.println();
		System.out.println("----------------------");
		
		// Create priority queue using heap.
		MyPriorityQueue<String> PQ = new MyPriorityQueue<String>();
		ArrayList<String> PQcopy = new ArrayList<String>();
		
		// Insert elements into queue.
		PQ.insert("gamma");
		PQ.insert("delta");
		PQ.insert("epsilon");
		PQ.insert("zeta");
		PQ.insert("beta");
		PQ.insert("eta");
		PQ.insert("theta");
		PQ.insert("iota");
		PQ.insert("kappa");
	
		while (!PQ.isEmpty()) {			
			PQcopy.add(PQ.removeMin());			
		}
		System.out.println(PQcopy.toString());
		
		for (int i = 0; i < PQcopy.size(); i++) {
			PQ.insert(PQcopy.get(i));
		}
		
		System.out.println();
		
		// Insert element into queue and redisplay.
		PQ.insert("alpha");
		PQcopy.clear();
		
		while (!PQ.isEmpty()) {			
			PQcopy.add(PQ.removeMin());			
		}
		System.out.println(PQcopy.toString());
		
	}

}


/* 
 * OUTPUT OF CODE:
 * 
 * beta 
 * delta epsilon 
 * iota gamma eta theta 
 * zeta kappa 
 * 
 * alpha 
 * beta epsilon 
 * iota delta eta theta 
 * zeta kappa gamma 
 * 
 * ----------------------
 * [beta, delta, epsilon, eta, gamma, iota, kappa, theta, zeta]
 * 
 * [alpha, beta, delta, epsilon, eta, gamma, iota, kappa, theta, zeta]
 * 
 */
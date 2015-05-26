import java.util.*;

public class Problem1 {
	static PriorityQueue<String> q = new PriorityQueue<String>();

	public static void main(String[] args) {
		q.offer("gamma");
		q.offer("delta");
		q.offer("epsilon");
		q.offer("zeta");
		q.offer("beta");
		q.offer("eta");
		q.offer("theta");
		q.offer("iota");
		q.offer("kappa");
		q.offer("alpha");
		
		while (!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}
}


public class Node<T> {
	Node<T> nextNode;
	T data;
	
	public Node(T data, Node<T> nextNode) {
		this.nextNode = nextNode;
		this.data = data;
	}
	
	public static void main(String[] args) {
		Node<Integer> n3 = new Node<Integer>(4, null);
		Node<Integer> n2 = new Node<Integer>(2, n3);
		Node<Integer> n1 = new Node<Integer>(1, n2);	
		
		System.out.println("Before:");
		for (Node<Integer> i = n1; i != null; i = i.nextNode) {
			System.out.println(i.data);			
		}
		
		Node<Integer> node = n1;
		Node<Integer> newnode = new Node<Integer>(3, null);
		
		for (Node<Integer> i = node; i != null; i = i.nextNode) {
			if (i.data == 2) {
				newnode.nextNode = i.nextNode;
				i.nextNode = newnode;
				
			}
		}
		
		System.out.println("After:");
		for (Node<Integer> i = n1; i != null; i = i.nextNode) {
			System.out.println(i.data);			
		}
	}
}

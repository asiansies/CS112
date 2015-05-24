/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 08
 * 
 * Note: Output included at the end of this file.
 * 
 */

public class TreeNodeApp {

	public static void main(String[] args) {
		
		// Create nodes.
		TreeNode<String> rootNode = new TreeNode<String>("root");
		TreeNode<String> child1 = new TreeNode<String>("child1");
		TreeNode<String> child2 = new TreeNode<String>("child2");
		TreeNode<String> grandchild1 = new TreeNode<String>("grandchild1");
		TreeNode<String> grandchild2 = new TreeNode<String>("grandchild2");
		TreeNode<String> grandchild3 = new TreeNode<String>("grandchild3");
		TreeNode<String> grandchild4 = new TreeNode<String>("grandchild4");

		// Link nodes to each other.
		rootNode.parent = null;
		rootNode.leftChild = child1;
		rootNode.rightChild = child2;

		child1.parent = rootNode;
		child1.leftChild = grandchild1;
		child1.rightChild = grandchild2;

		child2.parent = rootNode;
		child2.leftChild = grandchild3;
		child2.rightChild = grandchild4;

		grandchild1.parent = child1;
		grandchild1.leftChild = null;
		grandchild1.rightChild = null;

		grandchild2.parent = child1;
		grandchild2.leftChild = null;
		grandchild2.rightChild = null;

		grandchild3.parent = child2;
		grandchild3.leftChild = null;
		grandchild3.rightChild = null;

		grandchild4.parent = child2;
		grandchild4.leftChild = null;
		grandchild4.rightChild = null;

		// Print graphical representation of tree.
		rootNode.printTree();
	}
}

/* 
 * OUTPUT OF CODE:
 * 
 * root 
 * child1 child2 
 * grandchild1 grandchild2 grandchild3 grandchild4 
 *
 */
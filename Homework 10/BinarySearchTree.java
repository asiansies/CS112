/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 10
 * 
 * Note: All outputs and question #7 found at end of BSTdisplay.java
 * 
 */

import java.util.*;

public class BinarySearchTree {

	BinaryTreeNode rootNode; 
	BinaryTreeNode currentNode;
	private Random generator = new Random();

	// Constructor for BinarySearchTree.
	public BinarySearchTree() {
		rootNode = null;
	}

	// Inserts an entry into the BST using the "regular" method.
	public void insertRegular(int key, String value) {
		Entry treeEntry = new Entry(key, value);
		BinaryTreeNode newNode = new BinaryTreeNode(treeEntry);
		insertRegular(newNode);
	}

	// Determines where to insert a node using "regular" insert method.
	private void insertRegular(BinaryTreeNode newNode) {
		if (rootNode == null) {
			rootNode = newNode;
			currentNode = rootNode;
		} else if (newNode.getKey() <= currentNode.getKey()) {
			if (!currentNode.hasLeftChild()) {
				currentNode.leftChild = newNode;
				newNode.parent = currentNode;
				currentNode = rootNode;
			} else {
				currentNode = currentNode.leftChild;
				insertRegular(newNode);
			}
		} else {
			if (!currentNode.hasRightChild()) {
				currentNode.rightChild = newNode;
				newNode.parent = currentNode;
				currentNode = rootNode;
			} else {
				currentNode = currentNode.rightChild;
				insertRegular(newNode);
			}
		}
	}

	// Inserts a root node.
	private void insertRoot(Entry treeEntry) {
		rootNode = new BinaryTreeNode(treeEntry);
	}

	// Inserts an entry into the BST using the "random" method.
	public void insertRandom(int key, String value) {

		Entry treeEntry = new Entry(key, value);

		if (rootNode == null) {
			insertRoot(treeEntry);
			currentNode = rootNode;
		} else if (ifInsertAtRoot()) {
			BinaryTreeNode newNode = new BinaryTreeNode(treeEntry);
			insertRegular(newNode); 
			bubbleUp(newNode);
			rootNode = newNode;
		} else if (key <= currentNode.getKey()) {
			if (!currentNode.hasLeftChild()) {
				BinaryTreeNode newNode = new BinaryTreeNode(treeEntry);
				currentNode.leftChild = newNode;
				newNode.parent = currentNode;
				currentNode = rootNode;
			} else {
				currentNode = currentNode.leftChild;
				insertRandom(key, value);
			}
		} else {
			if (!currentNode.hasRightChild()) {
				BinaryTreeNode newNode = new BinaryTreeNode(treeEntry);
				currentNode.rightChild = newNode;
				newNode.parent = currentNode;
				currentNode = rootNode;
			} else {
				currentNode = currentNode.rightChild;
				insertRandom(key, value);
			}
		}
	}

	// Decide randomly whether or not to insert an entry at the root.
	private boolean ifInsertAtRoot() { //Needs to take in node, key and value?
		final int range = 1000000;	
		int value = generator.nextInt(range);
		int numNodes = numNodes(currentNode);

		return value <= (range/(numNodes + 1));

	} 

	// Returns number of nodes in a subtree.
	private int numNodes(BinaryTreeNode node) {
		int numNodes = 1;

		if (node.hasLeftChild()) {
			numNodes += numNodes(node.leftChild);
		}

		if (node.hasRightChild()) {
			numNodes += numNodes(node.rightChild);
		}

		return numNodes;
	}

	// Bubble up a node to the root of its tree.
	private void bubbleUp(BinaryTreeNode node) {
		while (node != currentNode) {
			if (node.parent.leftChild == node) {
				rotateRight(node);
			} else {
				rotateLeft(node);
			}
		}
	}

	// Performs a left-wise rotation.
	private void rotateLeft(BinaryTreeNode node) {
		BinaryTreeNode x = node;
		BinaryTreeNode p = node.parent;
		BinaryTreeNode lc = node.leftChild;
		BinaryTreeNode g = node.parent.parent;
		boolean parentIsOnLeft = false;

		if (g != null) {
			parentIsOnLeft = (g.leftChild == p);
		}

		if (p == currentNode) {
			currentNode = node;
		}

		p.rightChild = lc;
		if (lc != null) {
			lc.parent = p;
		}
		x.leftChild = p;
		p.parent = x;

		if (g != null) {
			if (parentIsOnLeft) {
				g.leftChild = x;
			} else {
				g.rightChild = x;
			}			
		}
		x.parent = g;
	}

	// Performs a right-wise rotation.
	private void rotateRight(BinaryTreeNode node) {
		BinaryTreeNode x = node;
		BinaryTreeNode p = node.parent;
		BinaryTreeNode rc = node.rightChild;
		BinaryTreeNode g = node.parent.parent;
		boolean parentIsOnLeft = false;

		if (g != null) {
			parentIsOnLeft = (g.leftChild == p);
		}

		if (p == currentNode) {
			currentNode = node;
		}

		p.leftChild = rc;
		if (rc != null) {
			rc.parent = p;
		}
		x.rightChild = p;
		p.parent = x;

		if (g != null) { 
			if (parentIsOnLeft) {
				g.leftChild = x;
			} else {
				g.rightChild = x;
			}
		}
		x.parent = g;
	}

	// Inserts an entry into the BST using the "AVL" method.
	public void insertAVL(int key, String value) {
		Entry treeEntry = new Entry(key, value);
		BinaryTreeNode newNode = new BinaryTreeNode(treeEntry);
		
		rootNode = currentNode;
		insertRegular(newNode); 
		resolveImbalance(newNode);
	}

	// Resolves imbalances.
	private void resolveImbalance(BinaryTreeNode x) {		
		if (x == null || x.parent == null || x.parent.parent == null) {
			return;
		}
		
		BinaryTreeNode p = x.parent;
		BinaryTreeNode g = x.parent.parent;

		if (isBalanced(g)) {
			resolveImbalance(p);
		} else {
			if (p.rightChild == x && g.rightChild == p) {
				rotateLeft(p);
			} else if (p.leftChild == x && g.leftChild == p) {
				rotateRight(p);
			} else if (p.leftChild == x && g.rightChild == p) {
				rotateRight(x);
				rotateLeft(x);
			} else if (p.rightChild == x && g.leftChild == p) {
				rotateLeft(x);
				rotateRight(x);
			}			
		}
	}

	// Returns the height of a specified node.
	private int height(BinaryTreeNode g) {
		int heightRight = 0;
		int heightLeft = 0;

		if (g.hasLeftChild()) {
			heightLeft = 1 + height(g.leftChild);
		}

		if (g.hasRightChild()) {
			heightRight = 1 + height(g.rightChild);
		}

		return Math.max(heightLeft, heightRight);		
	}

	// Returns whether or not a node is balanced.
	private boolean isBalanced(BinaryTreeNode g) {
		if (g.hasLeftChild() && !g.hasRightChild()) {
			return (height(g.leftChild) <= 1);
		}
		if (g.hasRightChild() && !g.hasLeftChild()) {
			return (height(g.rightChild) <= 1);
		}
		return (Math.abs(height(g.leftChild) - height(g.rightChild)) <= 1);
	}

	// Displays the keys held in the tree in a tree-like fashion.
	public void displayKeys() {
		ArrayDeque<BinaryTreeNode> queue = new ArrayDeque<BinaryTreeNode>();
		int depth = 0;
		queue.push(rootNode);

		while (queue.size() > 0) {
			BinaryTreeNode node = queue.pop();
			if (depth(node) > depth) {
				depth++;
				System.out.println("\n");
			}

			int leftChildKey = -1;
			int rightChildKey = -1;
			if (node.hasLeftChild()) {
				leftChildKey = node.leftChild.getKey();
			}

			if (node.hasRightChild()) {
				rightChildKey = node.rightChild.getKey();
			}
			System.out.print (node.getKey() + " (" + leftChildKey + ", " + rightChildKey + "); ");

			if (node.hasLeftChild()) {
				queue.addLast(node.leftChild);
			}
			if (node.hasRightChild()) {
				queue.addLast(node.rightChild);
			}
		}
	}

	// Returns the depth of a specified node.
	private static int depth(BinaryTreeNode node) {
		int depth = 0;
		BinaryTreeNode current = node;

		while (current.parent != null) {
			depth++;
			current = current.parent;
		}

		return depth;
	}
}

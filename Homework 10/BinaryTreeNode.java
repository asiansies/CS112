/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 10
 * 
 * Note: All outputs and question #7 found at end of BSTdisplay.java
 * 
 * Creates a BinaryTreeNode object.
 * 
 */

public class BinaryTreeNode {
	BinaryTreeNode parent;
	BinaryTreeNode leftChild;
	BinaryTreeNode rightChild;
	
	Entry entry;
	
	public BinaryTreeNode(Entry entry) {
		this.entry = entry;
	}

	public int getKey() {
		return entry.key;
	}
	
	public String getValue() {
		return entry.value;
	}
	
	public boolean hasLeftChild() {
		return this.leftChild != null;
	}

	public boolean hasRightChild() {
		return this.rightChild != null;
	}
}

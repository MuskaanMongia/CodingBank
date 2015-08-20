package treesAndGraphs;

public class NextNodeBST {

	/*
	 * Problem Statement:
	 *	Find Next Node in BST with/without link to parentNode (assuming inorder traversal)
	 *
	 *	IN-ORDER TRAVERSAL: leftChild -> parent -> rightChild
	 * 
	 * Solution:
	 * With Link to parent Node
	 * 		1. IF right child is not NULL, then find the leftmost child of the right subtree.
	 * 		2. IF right child is NULL, then next node is one the ancestors. traverse up the tree
	 *			till you find a node which is to left of its parent. 
	 * 
	 * Without Link to parent Node
	 *		1. IF right child is not NULL, then find leftmost child of right subtree
	 *		2. IF right child is NULL, you need to do search from root Node,
	 *			Compare the data of the node, if node data > root node traverse right
	 *			if node data < root data traverse left  
	 *
	 */
	
	class Node{
		int data;
		Node leftChild;
		Node parent;
		Node rightChild;
	}
	
	
	public Node nextNodeWithP(Node input){
		
		Node succNode = null;
		
		if(input.rightChild != null){
			// search for leftmostChild
			Node n = input.rightChild;
			while(n.leftChild != null){
				n = n.leftChild;
			}
			succNode = n;
			
		}
		else{
			// traverse up the tree
			Node p = input.parent;
			while(p != null && input == p.rightChild){
				input = p;
				p = p.parent;
			}
			succNode = p;
		}
		
		return succNode;
		
	}
	
	public Node nextNodeWithoutP(Node root, Node input){
		
		Node succNode = null;
		
		if(input.rightChild != null){
			// search for leftmostChild
			Node n = input.rightChild;
			while(n.leftChild != null){
					n = n.leftChild;
			}
			succNode = n;
		}
		else{
			while(root != null){
				if(input.data < root.data){
					succNode = root;
					root = root.leftChild;
				}
				else if(input.data > root.data){
					root = root.rightChild;
				}
				else
					break;
			}
			
		}
		
		return succNode;
		
	}
	
	
	public void driver()
	{
		System.out.println("DRIVER FOR NEXT NODE IN BST");
	}
	
}

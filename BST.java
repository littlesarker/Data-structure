import java.io.*;
import java.util.*;
public class BST {
	
	class Node{
		
		int k;
		Node left,right;
		
		public Node(int item) {
			k=item;
			left=right=null;
		}
		
	}

	Node root;
	
	BST(){
		root=null;
	}
	void insert(int k) {
		root=insertK(root,k);
	}
	
	Node insertK(Node root,int k) {
		
		if(root== null) {
			root=new Node(k);
	
			return root;
		}
		
	if(k < root.k)
		root.left=insertK(root.left,k);
	else if(k >root.k)
		root.right=insertK(root.right,k);
	return root;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST t=new BST();
		
		t.insert(5);

		t.insert(1);

		t.insert(6);

		t.insert(4);

		t.insert(2);

		t.insert(3);
		t.insert(10);
		t.insert(15);
		t.insert(5);
		
		
		System.out.println("inorder traversal");
		t.inorder();
		
		System.out.println("\nAfter delete 15");
		t.delK(15);
		System.out.println("inorder traversal");
		t.inorder();

	}
	void  inorder()
	{
		inorderRec(root);
	}
	void  inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.k+" -> ");
			inorderRec(root.right);
		}
	}
	
	void delK(int k) {
		root=delKRec(root,k);
	}
	
	Node delKRec(Node root,int k) {
		if(root==null) 
			return root;
		
		
		if(k < root.k)
			root.left=delKRec(root.left,k);
		else if(k >root.k)
		         root.right=delKRec(root.right,k);
		else
		{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			root.k=minValue(root.right);
			root.right=delKRec(root.right,root.k);
		}
		return root;
		
	}
	int minValue(Node root)
	{
		int m=root.k;
		while(root.left!=null) {
			m=root.left.k;
			root=root.left;
		}
		return m;
	}

}

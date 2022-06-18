import java.io.*;
import java.util.*;

public class Tree {

	Node root;

	Tree() {
		root = null;

	}

	void postorder(Node node) {
		if (node == null)
			return;

		postorder(node.left);
		postorder(node.right);

		System.out.println(node.item + " - >");

	}

	void inorder(Node node) {
		if (node == null)
			return;
		inorder(node.left);
		System.out.println(node.item + " - >");
		inorder(node.right);
	}

	void preorder(Node node) {
		if (node == null)
			return;

		System.out.println(node.item + " - >");
		preorder(node.left);
		preorder(node.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree t = new Tree();
		t.root = new Node(1);
		t.root.left = new Node(12);
		t.root.right = new Node(9);
		t.root.left.left = new Node(5);
		t.root.left.right = new Node(6);

		System.out.println("Inorder traversal");
		t.inorder(t.root);

		System.out.println("\nPreorder traversal ");
		t.preorder(t.root);

		System.out.println("\nPostorder traversal");
		t.postorder(t.root);

	}

}

class Node {
	int item;
	Node left, right;

	public Node(int k) {
		item = k;
		left = right = null;
	}

}

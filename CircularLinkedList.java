import java.io.*;
import java.util.*;

public class CircularLinkedList {

	public Node head = null;
	public Node last = null;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void add(int data) {
		Node nnode = new Node(data);

		if (head == null) {
			head = nnode;
			last = nnode;
			nnode.next = head;
		} else {
			last.next = nnode;
			last = nnode;
			last.next = head;
		}

	}

	public void insertAtPos(int data, int position) {
		Node temp, nNode;
		int i, count;
		nNode = new Node(data);
		temp = head;
		count = size();
		if (temp == null || size() < position)
			System.out.println("Index is greater than size of the list");
		else {
			nNode.data = data;
			for (i = 1; i < position - 1; i++) {
				temp = temp.next;
			}
			nNode.next = temp.next;
			temp.next = nNode;
		}
	}

	public void DelFirst()
	{
		if(head==null) {
			System.out.println("\nList is Empty\n");
		}else {
			if(head!=last) {
				head=head.next;
				last.next=head;
			}else {
				head=last=null;
			}
		}
	}
	
	
	public int size() {
		int size = 0;
		if (head != null) {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
				size++;
			}
			size++;
		}
		return size;
	}

	public void show() {
		Node cur = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {

			do {

				System.out.print(" " + cur.data);
				cur = cur.next;
			} while (cur != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLinkedList l = new CircularLinkedList();
		l.add(10);
		l.add(2);
		l.add(3);
		l.add(4);
        l.add(8);
		l.show();
		l.insertAtPos(5, 5);
		l.show();
		l.DelFirst();
		l.show();
		

	}

}

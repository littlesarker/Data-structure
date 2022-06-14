import java.util.*;
import java.io.*;

public class DoublyLinkedList {
	public Dlnode head;
	public Dlnode tail;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	class Dlnode{
		int data;
		Dlnode next;
		Dlnode prev;
		
		Dlnode(int data){
			this.data=data;
			
		}
		public void displayData() {
			System.out.print(" " + data);
		}
		
	}
	
	public int getSize() {
		return size;
	}
	public int size=0;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void insertFirst(int data)
	{
		Dlnode nnode=new Dlnode(data);
		if(isEmpty()) {
			tail=nnode;
		}else {
			head.prev=nnode;
		}
		nnode.next=head;
		head=nnode;
		size++;
	}
	public void insertAtEnd(int data)
	{
		Dlnode nnode=new Dlnode(data);
		if(isEmpty()) {
			head=nnode;
		}else {
			tail.next=nnode;
			nnode.prev=tail;
		}
		tail=nnode;
		size++;
		
	}
	
	public void insertAtPosition(int data,int pos)
	{
		if (pos >= 0 && pos <= size) {
			Dlnode newDllNode = new Dlnode(data);
			Dlnode current = head;
			if (pos == 0) {
				insertFirst(data);
			} else if (pos == size) {
				insertAtEnd(data);
			} else {
				for (int i = 0; i < pos && current.next != null; i++) {
					current = current.next;
				}
				newDllNode.next = current;
				current.prev.next = newDllNode;
				newDllNode.prev = current.prev;
				current.prev = newDllNode;
				size++;
			}
		} else {
			System.out.println("Index " + pos + " not valid for linked list of size " + size);
		}	
		
	}
	
	public void delFirstNode()
	{
		if(head==null) {
			System.out.println("List is Empty");
		}
		Dlnode f=head;
		if(head.next==null)
		{
			tail=null;
		}else
		{
			head.next.prev=null;
		}
		head=head.next;
		size--;
	}
	public void dellastNode()
	{
		if(tail==null) {
			throw new RuntimeException("List is empty");
		}
		Dlnode last=tail;
		if(head.next==null) {
			head=null;
		}else {
			tail.prev.next=null;
		}
		tail=tail.prev;
		size--;
	}
	
	
	public void delAtPos(int pos)
	{
		if (pos + 1 >= 0 && pos + 1 <= size) {
			Dlnode current = head;
			//remove at the start
			if (pos == 0) {
				delFirstNode();
			}
			// remove at last
			else if (pos == size - 1) {
				dellastNode();
			} else {
				for (int j = 0; j < pos && current.next != null; j++) {
					current = current.next;
				}
				current.prev.next = current.next;
				current.next.prev = current.prev;
				size--;
			}
		} else {
			System.out.println("Index " + pos + " not valid for linked list of size " + size);
		}
		
	}
	public void displayFirstToLast() {
		Dlnode current = head;
		System.out.print("The doubly linked list is --> ");
		while (current != null) {
			current.displayData();
			current = current.next;
		}
		System.out.println("");
	}

	public void displayLastToFirst() {
		Dlnode current = tail;
		System.out.print("The doubly linked list is --> ");
		while (current != null) {
			current.displayData();
			current = current.prev;
		}
		System.out.println("");
	}
	public void searchNode(int data) {
		//Node current will point to head
		Dlnode current = head;
		if (head == null) {
			System.out.println("Doubly linked list is empty");
			return;
		}
		System.out.println("Search node with data " + data + " in doubly linked list");
		while (current != null) {
			if (current.data == data) {
				System.out.println("node with data " + data + " found");
				break;
			}
			current = current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(1);
		list.displayFirstToLast();
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();
		list.insertFirst(2);
		list.displayFirstToLast();
		System.out.println("size :" + list.getSize());
		list.insertAtEnd(3);
		list.displayFirstToLast();
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();
		list.insertAtEnd(4);
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();
		list.insertAtPosition(5, 3);
		System.out.println("size :" + list.getSize());
		System.out.println("Linked list backward traversal");
		list.displayLastToFirst();
		System.out.println("Linked list forward traversal");
		list.displayFirstToLast();

		list.delAtPos(2);
		System.out.println("Node at index 2 has been deleted");
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();

		list.delFirstNode();
		System.out.println("First Node  has been deleted");
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();

		list.dellastNode();
		System.out.println("Last Node  has been deleted");
		System.out.println("size :" + list.getSize());
		list.displayFirstToLast();

		list.searchNode(5);
		list.displayFirstToLast();
		
		
	}

}

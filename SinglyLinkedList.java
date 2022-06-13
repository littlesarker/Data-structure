import java.util.*;
public class SinglyLinkedList {

	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head=null;
	public Node last=null;
	
	public void addNode(int data) {
		Node nNode =new Node(data);
		
		if(head==null)
		{
			head=nNode;
			last=nNode;
		}else
		{
			last.next=nNode;
			last=nNode;
		}
	}
	
	public void inserAtHead(int data)
	{
		Node hnode=new Node(data);
		if(this.head==null)
		{
			this.head=hnode;
		}else
		{
            
			hnode.next=this.head;
			this.head=hnode;
			
		}
				
	}
	public void inserAtEnd(int data)
	{
	
		Node enode=new Node(data);
		if(this.head==null)
		{
			this.head=enode;
		}else {
			Node cur=this.head;
			
			while(cur.next!=null) {
				cur=cur.next;
			}
			cur.next=enode;
		}
		
	}

	public void inserAtPosition(int position,int data)
	{
			Node newNode = new Node(data);

			// Init the cur and prev nodes to the head
			Node cur = this.head, prev = this.head;

			if (position == 1) {
				// Point the new node's next to head
				newNode.next = head;
				// Make the new node as head
				this.head = newNode;
				return;
			}

			while(cur.next !=null && --position >0) {
             prev=cur;
             cur=cur.next;

			}
			
			prev.next=newNode;
			newNode.next=cur;
	}

	
	public void show()
	{
		Node curent=head;
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
	   System.out.println("Nodes ");
	   while(curent!=null) {
		   System.out.println(curent.data);
		   curent=curent.next;
	   }
	   
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList l=new SinglyLinkedList();
		
		l.addNode(10);
		l.addNode(20);
		l.addNode(30);
		l.addNode(40);

		l.show();
		l.inserAtHead(500);
		l.show();
		l.inserAtEnd(1000);
		l.show();
		l.inserAtPosition(3, 10000);
	    l.show();
	
	}

}

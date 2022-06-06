import java.io.*;
import java.util.*;

public class Stack {

	static  int top=-1;
	static int size=2;
	static final int stack_ar[]=new int [size];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner o=new Scanner (System.in);
		int choice;
		boolean f=false; 

		while(1>0) {
			
			
			
			System.out.println("\nStack ");
			System.out.printf("\n1.Push the element\n2.Pop the element\n3.Show\n4.End");
			System.out. printf("\n\nChoose an Action :");
		       
			choice=o.nextInt();
			
			switch(choice){
			case 1 :
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				show();
			break;
			case 4 :
				f=true;
				break;
				default:
					System.out.println("\nInvalid");
			}
			if(f==true)
			{
				
				System.out.flush();  
				break;
				
			}
			
		}
		
		
		

	}
	static void push() {
		int data ;
		Scanner o=new Scanner (System.in);
		if(top==size-1)
		{
			System.out.println("\nStack is Full ! Overflow");
		}else {
			System.out.println("\nEnter Stack Element ");
			
			data=o.nextInt();
			top=top+1;
			stack_ar[top]=data;
			
			
			
		}
			
		
	}
	static void pop() {
		
		if(top==-1) {
			System.out.println("\nStack is Empty ! Unerflow");
		}else
		{
			System.out.println("Poped elements "+stack_ar[top]);
			top=top-1;
		}
			
	}
	static void show() {
		
		System.out.println("\nElements In Stack\n");
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack_ar[i]);
			
		}
		
	}
	
	
}

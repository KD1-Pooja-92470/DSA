package question1;

public class Stack 
{
	private static class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	private Node top;
	
	public Stack()
	{
		this.top=null;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(int val)
	{
		Node node = new Node(val);
		
		if(top==null)top=node;
		else {
			node.next=top;
			top=node;
		}
		
	}
	
	public int pop()
	{
		int temp=-1;
		if(isEmpty())
		{
		  System.out.println("Stack is Empty");
		}
		else {
			temp=top.data;
			top=top.next;
		}
		return temp;
	}
	
	public int peek()
	{
		int temp=-1;
		if(isEmpty())
		{
		  System.out.println("Stack is Empty");
		}
		else {
			temp=top.data;
		}
		return temp;
	}
}



package question1;

public class Queue 
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
	
	private Node front;
	private Node rear;
	
	public Queue()
	{
		this.front=null;
		this.rear=null;
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
	public void enqueue(int val)
	{
		Node newNode = new Node(val);
		
		if(front == null) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public int dequeue()
	{
		int temp = -1;
		if(isEmpty())
		{
		  System.out.println("Queue is Empty");
		}
		else {
			temp = front.data;
			front = front.next;
			
			if(front == null) {
				rear = null;
			}
		}
		return temp;
	}
	
	public int peek()
	{
		int temp=-1;
		if(isEmpty())
		{
		  System.out.println("Queue is Empty");
		}
		else {
			temp=front.data;
		}
		return temp;
	}
}
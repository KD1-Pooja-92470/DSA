
public class LinkedList {

	private static class Node{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	private Node tail;
	public LinkedList()
	{
		this.tail=null;
	}
	
	public boolean isEmpty()
	{
		return tail==null;
	}
	
	public void addFirst(int data)
	{
		Node newnode=new Node(data);
		
		if(isEmpty())
		{
			tail=newnode;
			tail.next=newnode;
		}
		
		else if(tail.next==tail)
		{
			newnode.next=tail;
			tail.next=newnode;
		}
		
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
		}
	}
	
	public void addLast(int data)
	{
		Node newnode = new Node(data);
		if(isEmpty())
		{
			tail=newnode;
			tail.next=newnode;
		}
		
		else if(tail.next==tail)
		{
			newnode.next=tail;
			tail.next=newnode;
			tail=newnode;
		}
		
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
			return;
		else if(tail.next ==tail)
			tail=null;
		else {
			Node trav=tail.next;
			while(trav.next !=tail)
				trav=trav.next;
			trav.next=trav.next.next;
			tail=trav;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			return;
		else if(tail.next==tail)
			tail=null;
		else {
			tail.next=tail.next.next;
		}
	}
	
	public void display() {
		if(isEmpty())
			return;
		else {
			Node trav=tail.next;
			do {
				System.out.println(trav.data);
				trav=trav.next;
			}while(trav!=tail.next);
		}
	}
}



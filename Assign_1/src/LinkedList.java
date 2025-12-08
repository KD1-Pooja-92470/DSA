
public class LinkedList 
{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next = null;
		}
	}
	
	private Node head;
	public LinkedList() {
		this.head = null;
	}
	
	public void addFirst(int value) {
		Node newnode =new Node(value);
		if(head==null)
			head = newnode;
		
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void addAftervalue(int val, int data) {
		Node newnode = new Node(data);
		if(head ==null)
			head=newnode;
		else {
			Node trav=head;
			while(trav.data!=val)
				trav=trav.next;
			newnode.next=trav.next;
			trav.next=newnode;
		}
	}
	
	public void addBeforeValue(int val, int data) {
		Node newnode = new Node(data);
		if(head==null)
			head=newnode;
		
		else {
			Node trav=head;
			
			while(trav.next.data !=val)
				trav=trav.next;
			newnode.next=trav.next;
			trav.next=newnode;
		}
	}
	
	public void insertInsortedorder(int data)
	{
		Node newnode = new Node(data);
		
		if(head ==null)
			head=newnode;
		else if(head.next==null)
		{
			if(newnode.data > head.data)
				head.next=newnode;
			else {
				newnode.next=head;
				head=newnode;
			}
		}
		
		else {
			Node trav=head;
			if(trav.data > newnode.data) {
				newnode.next=head;
				head=newnode;
			}
			else {
				while(trav !=null) {
					if(trav.next!=null && newnode.data <trav.next.data)
					{
						newnode.next=trav.next;
						trav.next=newnode;
						return;
					}
					
					trav=trav.next;
				}
			}
		}
	}
	
	public void display() {
		Node trav=head;
		while(trav !=null) {
			System.out.println(trav.data+" ");
			trav=trav.next;
		}
	}

	
}

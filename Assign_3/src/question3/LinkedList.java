package question3;


public class LinkedList 
{
   private static class Node{
	   
	   String data;
	   Node next;
	   Node prev;
	   
	   public Node(String data)
	   {
		   this.data=data;
		   this.next=null;
		   this.prev=null;
	   }
   }
   
   private Node head;
   private Node tail;
   private int size;
   private int undoCount;
   private Node undoTail;
   
   
   public LinkedList()
   {
	   this.head=null;
	   this.tail=null;
	   size=0;
   }
   
   public boolean isEmpty()
   {
	   return head==null;
   }
   
   public int size()
   {
	   return size;
   }
   
   public void forwardDisplay() {
		
		Node trav = head;
		System.out.print("Forward List : ");
		while(trav != null) {
			
			System.out.print(" " + trav.data);
			
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void backwardDisplay() {
		
		Node trav = tail;
		System.out.print("Backward List : ");
		while(trav != null) {
			
			System.out.print(" " + trav.data);
			
			trav = trav.prev;
		}
		System.out.println("");
	}

   
   public void addFirst(String val)
   {
	   
	   
	   Node newNode = new Node(val);
	   if(head==null)
	   {
		   head=tail=newNode;
	   }
	   else if(head.next==null)
	   {
		   if(undoTail!=null)
		   {
			   undoTail=null;
			   head=tail=newNode;
			   
		   }
		   else
		   {
			   newNode.next=head;
			   head.prev=newNode;
			   head=newNode;
		   }
	   }
	   else {
		   
		   if(undoTail!=null)
		   {
		   tail=undoTail.prev;
		   undoTail.prev=null;
		   undoTail=null;
		   tail.next=null;
		   size-=undoCount;
		   undoCount=0;
		   }
		   
		   
		   newNode.next=head;
		   head.prev=newNode;
		   head=newNode;
	   }
	   size++;
   }
   
   public void addLast(String val)
   {
	   Node newNode = new Node(val);
	   if(head==null)
	   {
		   head=tail=newNode;
	   }
	   else {
		   
		   newNode.prev=tail;
		   tail.next=newNode;
		   tail=newNode;
	   }
	   size++;
   }
   
   public void addPosition(String val, int pos)
   {
	   Node newNode = new Node(val);
	   if(head==null)
	   {
		   head=tail=newNode;
		   return;
	   }
	   else if(pos==1)
	   {
		   newNode.next=head;
		   head.prev=newNode;
		   head=newNode;
	   }
	   else if(pos==size+1)
	   {
		   newNode.prev=tail;
		   tail.next=newNode;
		   tail=newNode;
	   }
	   else {
		   Node trav=head;
		   
		   for(int i=1;i<pos-1;i++)
		   {
			   trav=trav.next;
		   }
		   
		   newNode.prev=trav;
		   newNode.next=trav.next;
		   trav.next=newNode;
		   trav.next.prev=newNode;
	   }
   }
   
   public void deleteFirst()
   {
	   if(head==null)return;
	   else if(head.next==null)head=tail=null;
	   else {
		   head=head.next;
		   head.prev=null;
	   }
	   size--;
   }
   
   public void deleteLast()
   {
	   if(head==null)return;
	   else if(head.next==null)head=tail=null;
	   else 
	   {
		   tail=tail.prev;
		   tail.next=null;
	   }
	   size--;
	   
   }
   
   public void deletePosition(int pos)
   {
	   if(head==null)return;
	   else if(head.next==null)
	   {
		   head=head.next;
		   head.prev=null;
	   }
	   else if(size==pos)
	   {
		   tail=tail.prev;
		   tail.next=null;
	   }
	   else
	   {
           Node trav=head;
		   
		   for(int i=1;i<pos-1;i++)
		   {
			   trav=trav.next;
		   }
           
		  
		   trav.next=trav.next.next;
		   trav.next.prev=trav;
		   
	   }
   }
   
   public void undo()
   {
	   if(undoCount==0)undoTail=tail;
	   if(undoCount>size-1)
	   {
		   System.out.println("No Task To Undo");
		   return ;
	   }
	   addLast(head.data);
	   deleteFirst();
	   undoCount++;
	   
	   
   }
   
   public void redo()
   {
	   
	
	   if(undoCount>0)
	   {
		   addFirst(tail.data);
		   deleteLast();
		   undoCount--;
	   }
	   else {
		   System.out.println("Nothing to Redo");
	   }
	   
   }
}

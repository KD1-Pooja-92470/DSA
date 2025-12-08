
public class Employee 
{
	private static class Node{
		private String Name;
		private int Empid;
		private int Salary;
		private Node next;
		
		
		public Node(String Name, int Empid, int Salary) {
			this.Name=Name;
			this.Empid=Empid;
			this.Salary = Salary;
			this.next=null;
		}
	}
	
	private Node head;
	public Employee() {
		this.head=null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addEmployee(String Name,int Empid,int Salary) {
		Node newemployee = new Node(Name,Empid,Salary);
		
		if(isEmpty()) {
			head=newemployee;
			head.next=null;
		}
		
		else if(head.next == null)
			head.next=newemployee;
		else {
			Node trav=head;
			while(trav.next !=null)
				trav=trav.next;
			
			trav.next=newemployee;
		}
	}
	
	public void displayByName(String name) {
		
		if(isEmpty())
			return;
		else {
			Node trav=head;
			while(trav.Name !=name)
				trav=trav.next;
			
			System.out.println(trav.Empid);
			System.out.println(trav.Name);
			System.out.println(trav.Salary);
			
			System.out.println();
		}
	}
	
	
	public void deleteByEmpid(int id) {
		if(isEmpty())
			return;
		
		else if(head.next == null)
			head =null;
		else {
			Node trav=head;
			while(trav.next.Empid !=id)
				trav=trav.next;
			
			
			trav.next=trav.next.next;
		}
	}
	
	
	public void updateSalary(String name,int salary) {
	 	
	 	if(isEmpty())
	 		return;
	 	else if(head.next==null)
	 		 head.Salary=salary;
	 	else {
	 		Node trav=head;
	 		while(trav.Name != name) 
	 			trav=trav.next;
	 		
	 		trav.Salary=salary;
	 		System.out.println(trav.Empid);
	 		System.out.println(trav.Name);
	 		System.out.println(trav.Salary);
	 		
	 		System.out.println();
	 		
	 		
	 	}
		
	  }
	
	public void display() {
		if(isEmpty())
			return;
		else {
			Node trav=head;
			while(trav != null) {
				
				System.out.println(trav.Empid);
				System.out.println(trav.Name);
				System.out.println(trav.Salary);
				
				System.out.println();
				trav=trav.next;
			}
		}
	}
	
}


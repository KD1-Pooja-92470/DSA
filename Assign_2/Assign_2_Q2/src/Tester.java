import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		
		int choice;
		
		do {
			System.out.println("1. Add Employee");
			System.out.println("2.Search Employee by name");
			System.out.println("3.Delete Employee by Empid");
			System.out.println("4.Update Employee salary");
			System.out.println("5. Sort Employee by Salary");
			
			System.out.println("6. Display Employee");
			
			Scanner sc  = new Scanner(System.in);
			
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:System.out.println("Add new Employee;");
		     System.out.println("Enter Employee  name");
		       String name =sc.next();
		       System.out.println("Enter Employee id");
		       int id=sc.nextInt();
		       System.out.println("Enter Employee salary");
		       int salary=sc.nextInt();
		       emp.addEmployee(name, id, salary);
		       break;
		       
			case 2: System.out.println("Search Employee by name");
		       System.out.println("Enter Employee name");
		       String name1 =sc.next();
		       emp.displayByName(name1);
		       break;
		       
			case 3:System.out.println("Delete Employee by id");       
		       System.out.println("Enter Employee id");
	            int id1=sc.nextInt();
	            emp.deleteByEmpid(id1);
	            break;
	            
			case 4:System.out.println("Update Employee salary");
		      System.out.println("Enter Employee  name");
	           String name2 =sc.next();
	           System.out.println("Enter Employee new salary");
		       int salary1=sc.nextInt();
		       emp.updateSalary(name2, salary1);
		       break;
		       
			case 6:System.out.println("Display all employees:");
		      emp.display();
		       
			}
		}while(choice !=0);
	}

}

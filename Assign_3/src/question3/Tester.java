package question3;

import java.util.Scanner;

public class Tester {
	
	 public static int menu() {
    	 Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("***********************************");
        System.out.println("1. Add New Task");
        System.out.println("2. Undo Task");
        System.out.println("3. Redo Task");
        System.out.println("4. Display Tasks");
        System.out.println("0. Exit");
        System.out.println("***********************************");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        return choice;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		int choice;
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1 : 
				System.out.println("Enter Task");
				String ch = sc.nextLine();	
				list.addFirst(ch);
				break;
			case 2 : 
				list.undo();
				break;
			case 3 : 
				list.redo();
				break;
			case 4 : 
				list.forwardDisplay();
				break;
			default : 
				System.out.println("Invalid Choice");
				break;
			}
		}
		
	}

}

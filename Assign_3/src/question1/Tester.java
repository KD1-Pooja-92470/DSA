package question1;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter data to be pushed : ");
				int data = sc.nextInt();
				st.push(data);
				break;
			case 2:
				System.out.println("Popped data : " + st.pop());
				break;
			case 3:
				System.out.println("Peeked data : " + st.peek());
				break;
			}
		}while(choice != 0);
		
		
		
		sc.close();
	}

}











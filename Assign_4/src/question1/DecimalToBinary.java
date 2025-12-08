package question1;

import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args) {
		
		System.out.print("Enter a Decimal Number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		DecimalToBinary(n);
	}
	
	public static void DecimalToBinary(int n)
	{
		if(n<=0)return;
		System.out.print(n%2);
		DecimalToBinary(n/2);
		
	}
}

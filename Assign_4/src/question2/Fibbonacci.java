package question2;

import java.util.Scanner;

public class Fibbonacci 
{
  
	public static void main(String[] args) {
		
		System.out.print("Enter a Number n to find nth term of Fibbonacci series: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int result = fib(n);
		System.out.println(n+"th Fibbonacci No is " + result);
	}
	
	public static int fib(int n)
	{
		if(n==0)return 0;
		else if(n<=2)return 1;
		
		return fib(n-1)+fib(n-2);
	}
}

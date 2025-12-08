package question3;

import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,6,8,9,55,33,52,59};
		System.out.print("Enter Key to Search : ");
		Scanner sc = new Scanner(System.in);
		int key=sc.nextInt();
		int result = search(arr,key);
		if(result==-1)
		{
			System.out.println("Key Not Found");
		}
		else {
			System.out.println(key + " Found at Index "+result);
		}
	}
	
	public static int search(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)if(arr[i]==target)return i;
	    return -1;
	}
	

}

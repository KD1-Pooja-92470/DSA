package question2;

import java.util.Stack;

public class ExpressionEvaluation 
{
	
	public static void main(String[] args) {
		String post = "15 3 * 6 / 20 +";
		System.out.println("Posfix Result : " + postfix(post));
		
		String pre = "- * 25 + 10 5 / 100 20";
		System.out.println("Prefix Result : " + prefix(pre));

	}
	
	public static int calculate(int op1,int op2,char opr)
	{
		switch(opr)
		{
		case '+' : return op1+op2;
		case '-' : return op1-op2;
		case '*' : return op1*op2;
		case '/' : return op1/op2;
		}
		return 0;
	}
	
	public static int  postfix(String s)
	{
		String [] arr = s.split(" ");
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<arr.length;i++)
		{
			String str = arr[i];
			
			if(Character.isDigit(str.charAt(0)))
			{
				stack.push(Integer.parseInt(str));
			}
			else
			{
				int op2 = stack.pop();
				int op1 = stack.pop();
				
				int result = calculate(op1,op2,str.charAt(0));
				stack.push(result);
			}
		}
		
		if(!stack.isEmpty())return stack.pop();
		else return 0;
	}
	
	public static int  prefix(String s)
	{
		String [] arr = s.split(" ");
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			String str = arr[i];
			
			if(Character.isDigit(str.charAt(0)))
			{
				stack.push(Integer.parseInt(str));
			}
			else
			{
				int op1 = stack.pop();
				int op2 = stack.pop();
				
				int result = calculate(op1,op2,str.charAt(0));
				stack.push(result);
			}
		}
		
		if(!stack.isEmpty())return stack.pop();
		else return 0;
	}
	
//	public static int  prefix(String s)
//	{
//		Stack<Integer> stack = new Stack<>();
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			char ch = s.charAt(i);
//			
//			if(Character.isDigit(ch))
//			{
//				stack.push(ch-'0');
//			}
//			else
//			{
//				int op1 = stack.pop();
//				int op2 = stack.pop();
//				
//				int result = calculate(op1,op2,ch);
//				stack.push(result);
//			}
//		}
//		
//		if(!stack.isEmpty())return stack.pop();
//		else return 0;
//	}

}

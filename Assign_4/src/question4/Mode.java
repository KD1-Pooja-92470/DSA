package question4;

import java.util.HashMap;

public class Mode {
	
	public static void main(String[] args) {
		int arr[] = {1,4,5,6,8,9,5,3,2,5};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int ele:arr)map.put(ele, map.getOrDefault(ele,0)+1);
		
		int maxvalue=0;
		int maxKey=-1;
		for(int key : map.keySet())
		{
		   if(map.get(key)>maxvalue)
		   {
			   maxvalue=map.get(key);
			   maxKey=key;
            
		   }
		}
		
		System.out.println("Mean is " +maxKey);
	}

}

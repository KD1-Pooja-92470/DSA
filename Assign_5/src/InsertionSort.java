
public interface InsertionSort {
	
	public static void main(String[] args) 
	{
		int arr[] = {1,2,66,8,9,55,33,52,-1,59};
		System.out.print("Before Sorting :");
		for(int i:arr)System.out.print(i+" ");
		
		System.out.println();
		//selectionSort(arr);
		insertionSort(arr);
		
		System.out.print("After Sorting :");
		for(int i:arr)System.out.print(i+" ");
	}
	
	
	
	public static void insertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int current=arr[i];
			int j;
			for( j=i-1;j>=0;j--)
			{
				if(current>arr[j])
				{
					arr[j+1]=arr[j];
				}
				else break;
			}
			
			arr[j+1]=current;
		}
	}

}

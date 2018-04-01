/*
选择排序
内循环结束一次，最值出现头角标位置上。
*/
class Sort{
	public static void selectSort(int[] arr)
	{
	      for(int x=0;  x<arr.length-1;  x++)
		for(int y=x+1 ; y<arr.length ; y++)
		{
			if(arr[x]>arr[y])
			{
			    int temp = arr[x];
			    arr[x] = arr[y];
			    arr[y] = temp;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int [] arr = {5,7,3,8,9,2,1};
		//排序前
		printArray(arr);
		//排序
		selectSort(arr);
		//排序后
		printArray(arr);
	}

	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for(int x=0;x<arr.length;x++)
		{
		       if(x!=arr.length-1)
			System.out.print(arr[x]+",");
		       else
			System.out.println(arr[x]+"]");
		}
	}
}
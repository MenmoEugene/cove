/*
����Ĳ��Ҳ���

*/
class ArrayTest
{
	public static void main(String[] args)
	{
		int[] arr = {2,4,6,8,9,10,34,67};
		int index = getIndex(arr,4);
		System.out.println("index="+index);
	}
	//�۰�ĵڶ��ַ�ʽ��
	public  static int halfSearch_2(int[] arr,int key)
	{
		int min = 0,max = arr.length-1,mid;

		while (min<max)
		{
			mid = (max+min)>>1;
			if (key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid -1;
			else
				return mid;
		}
		return -1;
	}
	//�۰����,���Ч�ʣ����Ǳ���Ҫ��֤����ʱ��������顣
	public static int halfSearch(int[] arr,int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		mid = (max+min)/2;

		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min = mid+1;
			else if(key<arr[mid])
				max = mid-1;

			if(min>max)
				return -1;
			mid= (max+min)/2;
		}
		return mid;
	}
	
	//���幦�ܣ���ȡkey��һ�γ����������е�λ�á����������-1����ô�����key�������в����ڡ�	
	public static int getIndex(int[] arr,int key)
	{
		for (int x=0; x<arr.length; x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
}

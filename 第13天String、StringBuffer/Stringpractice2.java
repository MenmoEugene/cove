/*
字符串反转
思路：
1，将字符串变成数组
2，对数组反转
3，将数组变成字符串
*/
class  Stringpractice2
{
	public static String reverseString(String s)
	{
		//字符串变数组
		char[] chs = s.toCharArray();

		//反转数组
		reverse(chs);

		//将数组变成字符串
		return new String(chs);
	}
	private static void reverse(char[] arr)
	{
		for (int start=0,end=arr.length-1;start<end;start++,end--)
		{
			swap(arr,start,end);
		}
	}
	private static void swap(char[] arr,int x,int y)
	{
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
public static void sop(String str)
	{
		System.out.println(str);
	}


	public static void main(String[] args) 
	{
		String s = "abcdefg";
		sop("("+s+")");
		sop("("+reverseString(s)+")");
	}
}

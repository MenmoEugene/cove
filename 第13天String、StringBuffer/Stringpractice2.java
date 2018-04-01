/*
�ַ�����ת
˼·��
1�����ַ����������
2�������鷴ת
3�����������ַ���
*/
class  Stringpractice2
{
	public static String reverseString(String s)
	{
		//�ַ���������
		char[] chs = s.toCharArray();

		//��ת����
		reverse(chs);

		//���������ַ���
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

/*
��ȡһ���ַ�������һ���ַ����г��ֵĴ�����
*/
class  Stringpractice3
{
	public static int getSubCount(String str,String key)
	{
		int count = 0;
		int index = 0;

		while ((index=str.indexOf(key))!=-1)
		{
			sop("str="+str);
			str = str.substring(index+key.length());
			count++;
		}
		return count;
	}
	public static void sop(String str)
	{
		System.out.println(str);
	}
/*
��ʽ��
*/
	public static int getSubCount_2(String str,String key)
	{
		int count = 0;
		int index = 0;
		while ((index= str.indexOf(key,index))!=-1)
		{
			sop("index="+index);
			index = index + key.length();
			count++;
		}
		return count;
	}


	public static void main(String[] args) 
	{
		String str = "kkarfkkadfkkadfkksfd";

		//sop("count======"+str.split("kk").length);//������ʹ�ã��������������ͨ�á�

		sop("count="+getSubCount_2(str,"kk"));
	}
}

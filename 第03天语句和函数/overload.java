/*
函数重载

结果：值有返回，返回值用return
*/

class overload{
	public static void main(String[] args)
	{
		add(3,4);
		add(2,55,2);
	}
	public static int add(int x,int y)
	{
		int sum=0;
		sum=x+y;
		System.out.println(sum);
		return sum;
	}	
	public static int add(int x,int y,int z)
	{
		int sum=0;
		sum=x+y+z;
		System.out.println(sum);
		return sum;
	}
}


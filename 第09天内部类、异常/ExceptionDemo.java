class Demo
{
	int div(int a ,int b)
	{
		return a/b;
	}
}

class ExceptionDemo
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,0);
			System.out.println("x="+x);
		}
		catch (Exception e)//Exception e = new AritchmeticException();
		{
			System.out.println("分母不能为零");
			System.out.println(e.getMessage());
			System.out.println(e.toString());//异常名称：异常信息

			e.printStackTrace();//异常名称：异常信息，异常出现的位置。
								//其实jvm默认的异常处理机制，就是在调用printStackTrace方法。打印异常的堆栈的跟踪信息。
		}
		System.out.println("over");
	}
}
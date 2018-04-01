/*
匿名内部类：
1.	匿名内部类其实就是内部类的简写格式。
2.	定义匿名内部类的前提：
		内部类必须是继承一个类或者实现接口。
*/
abstract class AbsDemo
{
	abstract void show();
}
class Outer 
{
	int x = 3;
	
		class Inner extends AbsDemo
		{
			 void show()
			{
				System.out.println("show:"+x);
			}
		}
		public void function()
		{
			new Inner().show();
		}
}

class hideinner
{
	public static void main(String[] args)
	{
		new Outer().function();
	}
}
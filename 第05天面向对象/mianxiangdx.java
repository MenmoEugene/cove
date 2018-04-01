/*
成员变量和局部变量作用范围：

成员变量作用于整个类中。局部变量作用于函数或者语句中。

在内存中的位置：
成员变量：在堆内存中，因为对象的存在，才在内存中存在。
局部变量：存在栈内存中。
*/
//实现功能
	class Car
	{
	    String color="red",name="Barry ";
	    int num = 1;
	    void run()
		{
		   System.out.println("run!"+name+color+"; hero:"+num);
		}
	}
//创建、调用对象
class mianxiangdx
{
      public static void main(String[] args)
	{
		Car c = new Car();
		
		c.color = "blue";
		c.num = 3;
		c.run();

		Car c1 = new Car();
		c1.run();		
	}
      
}

/*
new Car().cun();

匿名对象使用方法一：当对对象的方法只调用一次时，可以使用，这样比较简化。

如果对一个对象进行多个成员调用，则必须给这个对象起个名字。

匿名对象使用方法二：可以将匿名对象作为实际参数进行传递。

*/
/*
单例设计模式：解决一个类在内存只存在一个对象。

思路：想要保证对象唯一。
1，为了避免其他程序过多建立该类对象，需要先禁止其他程序建立该类对象。
2，还为了让其他程序可以访问到该类对象，只好在本类中自定义一个对象。
3，为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。

如何实现这三步的代码
1，将构造函数私有化。
2，在类中创建一个本类对象。
3，提供一个方法可以获取到该对象。
*/

class Single
{
       private int num;
       public void setNum(int num)
	{
	      this.num = num;
	}
       public int getNum()
	{
	      return num;
	}
       private Single(){}
       private static Single s = new Single();
       public static Single getInstance()
       {
	return  s;
       }
}

class danli
{
	public static void main(String[] args)
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		s1.setNum(23);
		s2.setNum(21);
		System.out.println(s2.getNum());
		System.out.println(s1.getNum());
	}
}









































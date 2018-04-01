import java.util.*;
/*
	泛型：JDK1.5版本以后出现的新特性，用于解决安全问题，是一个类型安全机制。

	好处：
		1.将运行时期出现问题ClassCastException，转移到了编译时期。
			便于程序员解决问题，让运行事情问题减少，安全。
			
		2,避免了强转换的麻烦。
*/
class GenericDemo
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("sdfdsf");
		al.add("sdfd1");
		al.add("sdfd31");

		//al.add(4);

		Iterator <String>it = al.iterator();
		while (it.hasNext())
		{
			String s = it.next();

			System.out.println(s+":"+s.length());
		}
	}
}

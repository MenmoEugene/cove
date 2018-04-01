import java.util.*;
/*
1，add方法的参数类型是Object。以便于接受任意类型对象。
2，集合中存储的都是对象的引用(地址)


什么是迭代器呢？
其实就是集合的取出元素的方式。
*/
class CollectionDemo 
{
	public static void main(String[] args) 
	{
		method_get();
	}
	public static void method_get()
	{
		ArrayList a1 = new ArrayList();
		a1.add("java01");//add(Object obj);
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");

		Iterator it = a1.iterator();//获取迭代器，用于取出集合中的元素。
		while (it.hasNext())
		{
			sop(it.next());
		} 
/*		
		for (Iterator it = a1.iterator(); it.hasNext(); )
		{
			sop(it.next());
		}
*/
	}

	public static void method_2()
	{
		ArrayList al1 = new ArrayList();
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");

		ArrayList al2 = new ArrayList();
		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");

		//获取交集
		al1.retainAll(al2);//取交集，al1中只会保留和al2中相同的元素。
		al1.removeAll(al2);//删除相同的交集。

		sop("al1:"+al1);
		sop("al1:"+al2);
	}
	public static void base_methiod()
	{
		//创建一个集合容器，使用Collection接口的子类，ArrayList
		ArrayList a1 = new ArrayList();

		//1,添加元素。
		a1.add("java01");//add(Object obj);
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");
		
		//打印原集合
		sop("原集合:"+a1);
	
		//3,删除元素
//		a1.remove("java02");
//		a1.clear();//清空集合

		//4，判断元素
		sop("java03是否存在:"+a1.contains("java03"));
		sop("集合是否为空？"+a1.isEmpty());

		//2，获取个数，集合长度。
		sop("size:"+a1.size());
		
		//打印改变后的集合
		sop(a1);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

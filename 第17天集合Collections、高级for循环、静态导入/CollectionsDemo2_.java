import java.util.*;

class StrComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		/*
		int num = s1.compareTo(s2);
		if(num>0)
			return -1;
		if(num<0)
			return 1;
		return num;
		*/ 

		return s2.compareTo(s1);
	}
}

class StrLenComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}
class CollectionsDemo2_ 
{
	public static void main(String[] args) 
	{
		orderDemo();
		shuffleDemo();
	}

//Ï´ÅÆ¡¢½Á»ìÓÃ
	public static void shuffleDemo()
	{
		List<String> list = new ArrayList<String>();

		list.add("abcd");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");
		list.add("zdvz");
		list.add("jjjjk");

		sop(list);
		Collections.shuffle(list);
		sop(list);
	}

	public static void orderDemo()
	{
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new StrLenComparator()));

		ts.add("abcde");
		ts.add("aaa");
		ts.add("k");
		ts.add("cc");

		Iterator it = ts.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

import java.util.*;
/*
���Զ��������ΪԪ�ش浽ArrayList�����У���ȥ���ظ�Ԫ�ء�

���磺���˶���ͬ����ͬ������Ϊͬһ���ˣ�Ϊ�ظ�Ԫ�ء�

˼·��
1�����������������ݷ�װ���˶���
2���������������˴��롣
3��ȡ����


List�����ж�Ԫ���Ƿ���ͬ�����ݵ���Ԫ�ص�equals������
*/
class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
			return false;
		
		Person p = (Person)obj;
//		System.out.println(this.name+"...."+p.name);

		return this.name.equals(p.name) && this.age == p.age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}

class ArrayListTest2 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(new Person("java01",20));//al.add(Object odj);---Object obj = new Person("list",24); 
		al.add(new Person("java02",22));
		al.add(new Person("java03",23));
		al.add(new Person("java02",22));

		al = singleElement(al);


		Iterator it = al.iterator();

		while (it.hasNext())
		{
			Person p = (Person)it.next();//��̬�쳣����Ҫ��ǿת����(����ת��)
			sop(p.getName()+"::"+p.getAge());
		}
	}
	public static ArrayList singleElement(ArrayList al)
	{
		ArrayList newAl = new ArrayList();

		Iterator it = al.iterator();

		while (it.hasNext())
		{
			Object obj =it.next();

			if(!newAl.contains(obj))
				newAl.add(obj);
		}
		return newAl;
	}
}

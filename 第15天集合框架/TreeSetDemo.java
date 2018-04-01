import java.util.*;
/*
Set:���򣬲������ظ�Ԫ�ء�
	|--HashSet:���ݽṹ�ǹ�ϣ���߳���ͬ���ġ�
				��֤Ԫ��Ψһ�Ե�ԭ���ж�Ԫ�ص�hashCodeֵ�Ƿ���ͬ��
				�����ͬ����������ж�Ԫ�ص�equals�������Ƿ�Ϊtrue��

	|--TreeSet�����Զ�Set�����е�Ԫ�ؽ�������
				�ײ����ݽṹ�Ƕ�������
				��֤Ԫ��Ψһ�Ե����ݡ�
				compareTo����return 0��

				TreeSet����ĵ�һ�ַ�ʽ����Ԫ������߱��Ƚ��ԡ�
				Ԫ����Ҫʵ��Comparable�ӿڣ�����compareTo������
				���ַ�ʽҲ��ΪԪ�ص���Ȼ˳�򣬻��߽���Ĭ��˳��

				

����
��TreeSet�����д洢�Զ������ѧ����
ϣ������ѧ���������������

��ס������ʱ������Ҫ������ͬʱ��һ��Ҫ�ж�һ�´�Ҫ������
*/
class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();

		ts.add(new Student("xml",22));
		ts.add(new Student("lisi",20));
		ts.add(new Student("lisi09",19));
		ts.add(new Student("lisi00",30));

		Iterator it = ts.iterator();
		while (it.hasNext())
		{
			Student stu = (Student)it.next();
			System.out.println(stu.getName()+"..."+stu.getAge());
		}
	}
}

class Student implements Comparable //�ýӿ�ǿ����ѧ���߱��Ƚ��ԡ�
{
	private String name;
	private int age;

	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}

	public int compareTo(Object obj)
	{

		
		if(!(obj instanceof Student))
			throw new RuntimeException("����ѧ������");
		Student s = (Student)obj;
		System.out.println(this.name+"......compareto....."+s.name);
		if(this.age>s.age)
			return 1;
		if(this.age==s.age)
		{
			return this.name.compareTo(s.name);
		}

		return -1;
		
	}
}

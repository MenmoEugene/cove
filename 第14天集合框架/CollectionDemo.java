import java.util.*;
/*
1��add�����Ĳ���������Object���Ա��ڽ����������Ͷ���
2�������д洢�Ķ��Ƕ��������(��ַ)


ʲô�ǵ������أ�
��ʵ���Ǽ��ϵ�ȡ��Ԫ�صķ�ʽ��
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

		Iterator it = a1.iterator();//��ȡ������������ȡ�������е�Ԫ�ء�
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

		//��ȡ����
		al1.retainAll(al2);//ȡ������al1��ֻ�ᱣ����al2����ͬ��Ԫ�ء�
		al1.removeAll(al2);//ɾ����ͬ�Ľ�����

		sop("al1:"+al1);
		sop("al1:"+al2);
	}
	public static void base_methiod()
	{
		//����һ������������ʹ��Collection�ӿڵ����࣬ArrayList
		ArrayList a1 = new ArrayList();

		//1,���Ԫ�ء�
		a1.add("java01");//add(Object obj);
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");
		
		//��ӡԭ����
		sop("ԭ����:"+a1);
	
		//3,ɾ��Ԫ��
//		a1.remove("java02");
//		a1.clear();//��ռ���

		//4���ж�Ԫ��
		sop("java03�Ƿ����:"+a1.contains("java03"));
		sop("�����Ƿ�Ϊ�գ�"+a1.isEmpty());

		//2����ȡ���������ϳ��ȡ�
		sop("size:"+a1.size());
		
		//��ӡ�ı��ļ���
		sop(a1);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

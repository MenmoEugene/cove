import java.util.*;
class GenericDemo7 
{
	public static void main(String[] args) 
	{
		TreeSet<Student> ts = new TreeSet<Student>(new Comp());

		ts.add(new Student("abc03"));
		ts.add(new Student("abc06"));
		ts.add(new Student("abc01"));
		ts.add(new Student("abc07"));

		Iterator<Student> it = ts.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next().getName());
		}

		TreeSet<Worker> ts1 = new TreeSet<Worker>(new Comp());

		ts1.add(new Worker("abc__03"));
		ts1.add(new Worker("abc__06"));
		ts1.add(new Worker("abc__01"));
		ts1.add(new Worker("abc__07"));

		Iterator<Worker> it1 = ts1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next().getName());
		}
	}
}
/*
class StuComp implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}
class WorComp implements Comparator<Worker>
{
	public int compare(Worker s1,Worker s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}
*/

class Comp implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		return p2.getName().compareTo(p1.getName());
	}
}

class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
}

class Worker extends Person
{
	Worker(String name)
	{
		super(name);
	}
}
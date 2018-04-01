class Employee
{
	private String name;
	private String id;
	private double pay;
	
	Employee(String name,String id,double pay)
	{
		this.name = name;
		this.id =  id;
		this.pay = pay;
	}
	public abstract void work();
}

class Manager extends Employee
{
	private int bonus;
	Manager(String name,String id,double pay,int bonus)
	{
		super(name,id,pay);
		this.bonus = bonus;
	}
	public void work()
	{
		System.out.println("manager work");
	}
}
class Pro extends Employee
{
	Pro(String name,String id,double pay)
	{
		super(name,id,pay);
	}
	public void work()
	{
		System.out.println("Pro work");
	}
}

class Abstract
{
	public static void main(String[] args)
	{
		Pro.work();
		Manager.work();
	}
}
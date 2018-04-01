/*
private：私有，权限修饰符：用于修饰类中的成员（成员变量、成员函数）
私有只在本类中有效。

将age私有以后，类以外即使建立了对象也不能直接访问。
但是人应该有年龄，就需要在person类中提供对应访问age的方式。
*/

class Person
{
   private int age;

   public void setAge(int a)//设置
   {
	age = a;
   }
/*

 	public void getAge()//获取
   	 {
		return age；
  	 }
*/
   void speak()
  {
	System.out.println("age="+age);
   }
}

class siyou
{
       public static void main(String[] args)
	{
		Person p =new Person();
		p.speak();
		p.setAge(20);
	}
}
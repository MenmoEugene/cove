/*
1，多态的体现
	父类的引用指向了自己的子类对象
	父类的引用也可以接收自己的子类对象
2，多态的前提
	必须是类与类之间有关系。要么继承，要么实现
	通常还有一个前提：存在覆盖
3，多态的好处
	多态的出现大大的提高程序的扩展性。
4，多态的局限性
	虽然提高了扩展性，但是只能使用父类的引用访问父类中的成员
5，多态的应用
6，多态的出现在代码中的特点（多态使用的注意事项）
动物
猫，狗。
*/
abstract class Animal
{
	abstract void eat();
}

class Cat extends Animal
{
        public void eat()
	{
	       System.out.println("吃鱼");
	}
        public void catchMouse()
	{
	        System.out.println("捕鼠");
	}
}
class Dog extends Animal
{
	public void eat()
	{
	        System.out.println("吃饭");
	}
	public void catchThief()
	{
	        System.out.println("捕人");
	}
}
class duotai
{
       public static void main(String[] args)
	{
		Animal a = new Cat();
		a.eat();
	//如果想要调用猫的特有方法时，如何操作？
	//强制将父类的引用，转成子类类型。
	Cat  c = (Cat)a;
	c.catchMouse();

	function(new Dog());
	Dog d = (Dog)a;
	d.catchThief();
	}

        public static void function(Animal a)
	{
	        a.eat(); 
	}
}
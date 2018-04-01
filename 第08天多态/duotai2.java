/*
学生
基础班
冲刺班
*/
abstract class  Student
{
      abstract public void study();
       public  void sleep()
	{
	   System.out.println("躺着睡");
	}
}
class  BaseStudent extends Student
{
          public void study()
	{
	     System.out.println("基础学习");
	}
}
class  DashStudent extends Student
{
          public void study()
	{
	      System.out.println("项目学习");
	}
         public void sleep()
	{
	       System.out.println("坐着睡");
	}
}
class  DoStudent
{
          public void dosome(Student stu)
	{
	      stu.study();
	      stu.sleep();
	}
}
class duotai2
{
          public static void main(String[] args)
	{
	     DoStudent ds = new DoStudent();
	     ds.dosome(new BaseStudent());
	      ds.dosome(new DashStudent());
	}
}
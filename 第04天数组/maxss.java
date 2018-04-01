/*
获取数组中的最大值
思路：
1.获取最值需要进行比较，每一次比较都会有一个比较大的值，因为值不确定，
通过一个变量进行临时存储。
2.让数组中的每一个元素和这个变量中的值进行比较。如果大于变量的值，
就用该变量记录较大值。
3.当所有的元素都比较完成，那么该变量中存储的就是数组中的最大值了。

步骤：
1.定义变量，初始化为数组中任意一个元素即可。
2.通过循环语句对数组进行遍历。
3.在遍历过程中定义判断条件，如果遍历到的元素比变量中的元素大，就赋值给该变量。

需要定义一个功能来完成，以便提高代码复用性。
1，明确结果，数组中的最大元素 int。
2，为知内容：一个数组。int []
功能函数内需要传递参数，有参与计算的需要返回计算值。
添加内容要放在主函数内
*/
public class maxss{
	public static int getMax(int [] arr)
	{
	     int max = arr[0];
	     for(int x=1;x<arr.length;x++)
	     {
		if(arr[x]>max)
		       max=arr[x];
	      }return max;	
	}
	public static int getMin(int [] arr)
	{
	     int min=arr[0];
	     for(int x=1;x<arr.length;x++)
		{
		     if(arr[x]<min)
			min=arr[x];
		}return min;
	}
	public static void main(String[] args)
	{
	     int [] arr = {5,2,6,7,2,8,8,9};
	      int max = getMax(arr);
	      int min = getMin(arr);
	     System.out.println("max ="+max+";");
	     System.out.print("min ="+min+";");
	}
}
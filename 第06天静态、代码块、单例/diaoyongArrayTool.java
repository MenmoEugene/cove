class diaoyongArrayTool
{
         public static void main(String[] args)
	{
		int [] arr  =  {1,6,36,7,8,3,85};
		
		int max = ArrayTool.getMax(arr);
		System.out.println("max="+max);
		int min = ArrayTool.getMin(arr);
		System.out.println("min="+min);
/*
		ArrayTool tool = new ArrayTool();
		int max = tool.getMax(arr);
		System.out.println("max="+max);
		int min = tool.getMin(arr);
		System.out.println("min="+min);
		
		tool.printArray(arr);
		tool.selectSort(arr);
		tool.printArray(arr);
		
		int [] arr1 = {};
		ArrayTool tool1 = new ArrayTool();
*/
	}
}
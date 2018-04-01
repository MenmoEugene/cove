
public class Function {

	/*
定义一个功能，用于打印矩形

思路：

1）确定结果：没有，直接打印，所以返回类型为void
2）有未知内容：两个，为矩形内容的行和列。

	 */ 

	public static void main(String[] args) {
		
		draw(6,7);
		printHR();
		draw(3,5);
		printHR();

		//99();
}
/*打印99乘法表
		public static void 99(){
			for(int x=1;x<=9;x++){
				for(int y=1;y<=x;y++){
				   System.out.print(y+"*"+x+"="+y*x+"\t");
				}System.out.println();
					}
				}
*/
		public static void draw(int row,int col){
			for(int x=0;x<row;x++){
				for(int y=0;y<col;y++)
				{
					System.out.print("*");
				}System.out.println();
			}
		}
		public static void printHR()
		{
			System.out.println("-----------------------");
		}
	}


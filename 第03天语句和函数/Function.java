
public class Function {

	/*
����һ�����ܣ����ڴ�ӡ����

˼·��

1��ȷ�������û�У�ֱ�Ӵ�ӡ�����Է�������Ϊvoid
2����δ֪���ݣ�������Ϊ�������ݵ��к��С�

	 */ 

	public static void main(String[] args) {
		
		draw(6,7);
		printHR();
		draw(3,5);
		printHR();

		//99();
}
/*��ӡ99�˷���
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


/*
实现思路：尖朝上改变条件

1
12
123
1234
12345

*/

class dayingshuzi{
     public static void main(String[] arg){
		int x=0,y=0;
		for(x=0;x<5;x++){
		   for(y=1;y<=x+1;++y){
			System.out.print(y);
			}System.out.println();
		}
	}
}
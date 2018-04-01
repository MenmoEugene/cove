/*
思路：打印倒三角形星星
大圈套小圈原则
外圈为行，内圈为列

样式图形

*****
****
***
**
*

*/
class sanjiaoxing{
    public static void main(String[] args){
/*		int x=0,y=0;
		int z=5;
		for(x=0;x<5;x++){
			for(y=0;y<z;y++){
				System.out.print("*");
				
			}z--;
			System.out.println();
		}
*/



/*
		int x=0,y=0,z=0;
		for(x=0;x<5;x++){
			for(y=z;y<5;y++){

			System.out.print("*");

			}z++;
			System.out.println();
		}
*/


		int x=0,y=0;
		for(x=0;x<5;x++){
			for(y=x;y<5;y++){
			    System.out.print("*");
			}System.out.println();
		}

	System.out.print("\n");

		int a=0,b=0;
		for(a=0;a<5;a++){
			for(b=0;b<a+1;b++){
			    System.out.print("*");
			}System.out.println();
		}
	}
}
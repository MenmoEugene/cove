/*
定义功能，用于打印数组中的元素，元素间用逗号隔开
*/
public class shuzuyingyong{
        public static void main(String[] args){
	int [] arr = {1,5,7,89,3,7,3,22,54};
	for(int x = 0;x<arr.length;x++){
		System.out.print(arr[x]+" ");
		if(x<arr.length-1){
		System.out.print(",");
			}
		}
	}
} 
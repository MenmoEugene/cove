/*
定义一个根据月份数判断季节的判断条件语句 分别定义 春（3、4、5）夏（6、7、8）秋（9、10、11）冬（1、2、12）
*/
class season{
       public static void main(String[] args){
	   int s = 81;
	   if(s>12 || s<1)
		System.out.println("不存在该月份");
	   else if(s>=3&&s<=5)
		System.out.println(s+"月份属于春季");
	   else if(s>=6&&s<=8)
		System.out.println(s+"月份属于夏季");
	   else if(s>=9&&s<=11)
		System.out.println(s+"月份属于秋季");
	   else
		System.out.println(s+"月份属于冬季");
	}
}
/*
����һ�������·����жϼ��ڵ��ж�������� �ֱ��� ����3��4��5���ģ�6��7��8���9��10��11������1��2��12��
*/
class season{
       public static void main(String[] args){
	   int s = 81;
	   if(s>12 || s<1)
		System.out.println("�����ڸ��·�");
	   else if(s>=3&&s<=5)
		System.out.println(s+"�·����ڴ���");
	   else if(s>=6&&s<=8)
		System.out.println(s+"�·������ļ�");
	   else if(s>=9&&s<=11)
		System.out.println(s+"�·������＾");
	   else
		System.out.println(s+"�·����ڶ���");
	}
}
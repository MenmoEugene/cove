/*
public static void main(String[] args)

主函数：是一个特殊的函数，作为程序的入口，可以被jvm调用。
定义：
public：代表着该函数访问权限是最大的。
static：代表主函数随着类的加载就已经存在了。
void：主函数没有具体的返回值。
main：不是关键字，但是一个特殊的单词，可以被jvm识别。
     （String[] args）:函数的参数，参数类型是一个数组，该数组中的元素是字符串，字符串类型的数组。
主函数是固定格式的：jvm识别
jvm在调用主函数时，传入的是new String[0]；

cmd: javac Main.java      java Main   X M L
*/
class Main
{
	public static void main(String[] args)
	{
	       
		for(int x=0;x<args.length;x++)
		{
	       		System.out.println(args[x]);
		}System.out.println(args.length);
	}
}
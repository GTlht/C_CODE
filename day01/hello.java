/*
对第一个Java程序进行总结
1.Java程序编写-编译-运行的过程
编写：我们将编写的Java代码保存在以.java结尾的源文件中
编译：使用Javac.exe命令辩题我们的Java源文件。格式：javac 源文件名.java
运行：使用Java.exe命令解释运行我们的字节码文件。格式：Java 类名

2.
在一个Java源文件中可以声明多个class。但是，最多只能有一个类声明为public的。
而且要求声明为public的类的类名必须与源文件名相同。
3.程序的入口时main（）方法。格式是固定的。
4.输出语句：
system.out.println():先输出后换行
system.out.print()：直接输出没有换行
5.每一行执行语句都以；结束。
6.编译的过程：编译以后，会生成一个或多个字节码文件。字节码文件的文件名与
Java源文件中的类名相同
*/
class  Hello
{ 
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}



import java.util.Scanner;
class IfTest2
{
	public static void main(String[] args)
	{
		int temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("�������һ����:");
		int num1=scan.nextInt();
		System.out.println("������ڶ�����:");
		int num2=scan.nextInt();
		System.out.println("�������������:");
		int num3=scan.nextInt();
		if(num2>num1)
		{
			temp=num2;
			num2=num1;
			num1=temp;
		}
		if(num3>num1)
		{
			temp=num3;
			num3=num1;
			num1=temp;
		}
		if(num3>num2)
		{
			temp=num3;
			num3=num2;
			num2=temp;
		}
		System.out.println("�Ӵ�С��˳��Ϊ��");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
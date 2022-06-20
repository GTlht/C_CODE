import java.util.Scanner;
class SwitchTest3  
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=scan.nextInt();
		if(year%4==0&&year%400!=0)
		{
			System.out.println("你输入的"+year+"是闰年");
		}
		else 
		{
            System.out.println("你输入的"+year+"不是闰年");
		}

		System.out.println("Hello World!");
	}
}

import java.util.Scanner;
class SwitchTest3  
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=scan.nextInt();
		if(year%4==0&&year%400!=0)
		{
			System.out.println("�������"+year+"������");
		}
		else 
		{
            System.out.println("�������"+year+"��������");
		}

		System.out.println("Hello World!");
	}
}

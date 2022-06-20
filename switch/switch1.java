import java.util.Scanner;

class  SwichTest1
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int number=scan.nextInt();
		switch(number)
		{
		case 0:
			System.out.println("zero");
		case 1:
			System.out.println("one");
		default:
			System.out.println("other");
		}

	}
}

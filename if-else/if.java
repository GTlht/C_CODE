
import java.util.Scanner;
class IfTest
{
	public static void main (String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������ɼ���");
		int score=scan.nextInt();
		if(score==100)
		{
			System.out.println("����һ��BWM");
		}
		else if(score>80 && score<=99) 
		{
			System.out.println("����һ̨iphone xs max");
		}
		else if(score>=60 && score<=80)
		{
			System.out.println("����һ��iPad");
		}
		else
	    {
		System.out.println("ɶҲû��");
		}

		

	}
}
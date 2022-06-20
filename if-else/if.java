
import java.util.Scanner;
class IfTest
{
	public static void main (String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score=scan.nextInt();
		if(score==100)
		{
			System.out.println("奖励一辆BWM");
		}
		else if(score>80 && score<=99) 
		{
			System.out.println("奖励一台iphone xs max");
		}
		else if(score>=60 && score<=80)
		{
			System.out.println("奖励一个iPad");
		}
		else
	    {
		System.out.println("啥也没有");
		}

		

	}
}
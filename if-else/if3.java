
import java.util.Scanner;

class IfTest3
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������������:(cm)");
		double height=scan.nextDouble();
		System.out.println("��������ĲƸ�����ǧ��");
		double wealth=scan.nextDouble();
		/*System.out.println("���������Ƿ�˧����true/false��");
		boolean isHandsome=scan.nextBoolean();
		if(height>=180&&wealth>=2&&isHandsome)
		{
			System.out.println("��");
		}
		else if(height>=180||wealth>=2||isHandsome)
		{
			System.out.println("���Ǽ�");
		}
			else
				{
				System.out.println("����");
			}

	}
}
*/
System.out.println("���������Ƿ�˧������/��");
		String isHandsome=scan.next();
		if(height>=180&&wealth>=2&&isHandsome.equals("��"))
		{
			System.out.println("��");
		}
		else if(height>=180||wealth>=2||isHandsome.equals("��"))
		{
			System.out.println("���Ǽ�");
		}
			else
				{
				System.out.println("����");
			}

	}
}

import java.util.Scanner;

class IfTest3
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãµÄÉí¸ß:(cm)");
		double height=scan.nextDouble();
		System.out.println("ÇëÊäÈëÄãµÄ²Æ¸»£º£¨Ç§Íò£©");
		double wealth=scan.nextDouble();
		/*System.out.println("ÇëÊäÈëÄãÊÇ·ñË§£º£¨true/false£©");
		boolean isHandsome=scan.nextBoolean();
		if(height>=180&&wealth>=2&&isHandsome)
		{
			System.out.println("¼Þ");
		}
		else if(height>=180||wealth>=2||isHandsome)
		{
			System.out.println("¿¼ÂÇ¼Þ");
		}
			else
				{
				System.out.println("²»¼Þ");
			}

	}
}
*/
System.out.println("ÇëÊäÈëÄãÊÇ·ñË§£º£¨ÊÇ/·ñ£©");
		String isHandsome=scan.next();
		if(height>=180&&wealth>=2&&isHandsome.equals("ÊÇ"))
		{
			System.out.println("¼Þ");
		}
		else if(height>=180||wealth>=2||isHandsome.equals("ÊÇ"))
		{
			System.out.println("¿¼ÂÇ¼Þ");
		}
			else
				{
				System.out.println("²»¼Þ");
			}

	}
}
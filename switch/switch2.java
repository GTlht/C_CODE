import java.util.Scanner;

class  SwitchTest2
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		String str=scan.next();
		char ch=str.charAt(0);
		switch(ch)
		{
		case 'A':
			System.out.println("������Ǵ�д���ֲ��䣺"+ch);
		    break;
		case 'B':
			System.out.println("������Ǵ�д���ֲ��䣺"+ch);
		    break;
		case 'C':
			System.out.println("������Ǵ�д���ֲ��䣺"+ch);
		    break;
		case 'D':
			System.out.println("������Ǵ�д���ֲ��䣺"+ch);
		    break;
		default:
			ch-=32;
		    System.out.println("ת��Ϊ��д֮��"+ch);
			break;
			}
		//System.out.println("Hello World!");
	}
}
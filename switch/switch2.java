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
			System.out.println("输入的是大写保持不变："+ch);
		    break;
		case 'B':
			System.out.println("输入的是大写保持不变："+ch);
		    break;
		case 'C':
			System.out.println("输入的是大写保持不变："+ch);
		    break;
		case 'D':
			System.out.println("输入的是大写保持不变："+ch);
		    break;
		default:
			ch-=32;
		    System.out.println("转换为大写之后："+ch);
			break;
			}
		//System.out.println("Hello World!");
	}
}

package �������ַ���;
import java.util.Scanner;

public class UpperCaseLast 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		char cs[] = str.toCharArray();
		
		cs[cs.length-1] = Character.toUpperCase(cs[cs.length-1]);
		
		System.out.println("�����"+new String(cs));
	}

}

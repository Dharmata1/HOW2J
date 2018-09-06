package Êý×ÖÓë×Ö·û´®;
import java.util.Scanner;

public class StringToArray 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str =  s.nextLine();
		char[] cs = str.toCharArray();
		
		for(int i = 0; i<cs.length; i++)
		{
			if (Character.isUpperCase(cs[i])||Character.isDigit(cs[i]))
			{
				System.out.print(cs[i]);
			}
		}
	}

}

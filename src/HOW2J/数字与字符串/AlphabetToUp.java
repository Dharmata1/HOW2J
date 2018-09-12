package HOW2J.数字与字符串;
import java.util.Scanner;

public class AlphabetToUp 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入英文句子：");
		String str = s.nextLine();
		char cs[] = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++)
		{
			if ((0 == i)&&Character.isAlphabetic(cs[0]))
			{
				cs[0] = Character.toUpperCase(cs[0]);
			}
			else
			{
				if (Character.isAlphabetic(cs[i])
					&&((' ' == cs[i-1])||('\t' == cs[i-1])))
				{
					cs[i] = Character.toUpperCase(cs[i]);
				}
			}
		}
		
		System.out.println("首字母大写："+new String(cs));
	}

}

package HOW2J.数字与字符串;
import java.util.Scanner;

public class FirstRepetitionSum 
{
	public static void main(String args[])
	{
		String  str = new String("peter piper picked a peck of pickled peppers");
		
		String words[] = str.split(" ");
		
		int count = 0;
		
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].charAt(0) == 'p')
			{
				count++;
			}
		}
		
		System.out.println("p开头的字母一共："+count+"个");
	}

}

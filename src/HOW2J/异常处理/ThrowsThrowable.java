package HOW2J.�쳣����;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsThrowable 
{
	public static void main(String args[])throws Throwable
	{
		try
		{
			File f = new File("d:/lol1.txt");
			new FileInputStream(f);
			System.out.println("return 1!");
		}
		catch (FileNotFoundException e) 
		{
			System.out.print("�ļ�δ�ҵ���");
			e.printStackTrace();
			System.out.println("return 2!");
		}
		finally
		{
			System.out.println("return 3!");
		}
	}
}

package HOW2J.异常处理;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchReturnValue 
{
	public static void main(String args[])
	{
		System.out.println(method());
	}
	
	public static int method()
	{
		try
		{
			File f = new File("d:/lol1.txt");
			new FileInputStream(f);
			System.out.println("return 1!");
			return 1;
		}
		catch (FileNotFoundException e) 
		{
			System.out.print("文件未找到。");
			e.printStackTrace();
			System.out.println("return 2!");
			return 2;
		}
		finally
		{
			System.out.println("return 3!");
			return 3;
		}
	}

}

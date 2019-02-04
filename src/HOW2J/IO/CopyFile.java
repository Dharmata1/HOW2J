package HOW2J.IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile 
{
	public static void main(String args[])
	{
		copyFile("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/templet.java","F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/copyTemplet.java");
	}

	public static void copyFile(String srcFile, String destFile)
	{
		//合法性判断
		if ((null == srcFile)||(null == destFile))
		{
			System.out.println("输入文件包含空文件");
			return;
		}
		
		File srcf = new File(srcFile);
		File destf = new File(destFile);
		
		if (false == srcf.exists())
		{
			System.out.println("源文件不存在");
			return;
		}
		
		if ((true == srcf.isDirectory())||(true == destf.isDirectory()))
		{
			System.out.println("源文件或目标文件为文件夹");
			return;			
		}
		
		try (FileInputStream srcfin = new FileInputStream(srcf);
			FileOutputStream destfout = new FileOutputStream(destf);)
		{
			byte all[] = new byte[(int)srcf.length()];
			srcfin.read(all);//需要留意的是，read会返回实际的读取数量，有可能实际的读取数量小于缓冲的大小,故此段代码需要完善
			destfout.write(all);			
		}
		catch(IOException e) 
		{
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
	}
	
}

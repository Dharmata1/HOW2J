package HOW2J.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFolder 
{
	public static void main(String args[])
	{
		copyFolder("F:/eclipse/Workspace/j2se/src/HOW2J/Testfiles/Src","F:/eclipse/Workspace/j2se/src/HOW2J/Testfiles/Dest");		
	}	
	
	public static void copyFolder(String srcFolder, String destFolder)
	{
		//合法性判断
		if ((null == srcFolder)||(null == destFolder))
		{
			System.out.println("copyFolder输入文件包含空文件");
			return;
		}
		
		File srcfd = new File(srcFolder);
		File destfd = new File(destFolder);
		
		if (false == srcfd.exists())
		{
			System.out.println("copyFolder源文件不存在");
			return;
		}
		

		if (false == srcfd.isDirectory())
		{
			System.out.println("copyFolder源文件不是文件夹");
			return;			
		}
		
		if (true == destfd.isFile())
		{
			System.out.println("copyFolder目标文件不是文件夹");
			return;			
		}
		
		if (false == destfd.exists())
		{
			destfd.mkdir();
			System.out.println("copyFolder创建文件夹"+destFolder);
		}
		
		//源文件夹下文件、文件夹分别处理
		File[] srcFilelist =  srcfd.listFiles();
		
		for (int i = 0;i < srcFilelist.length; i++)
		{
		    //如果是文件
			if (false == srcFilelist[i].isDirectory())
			{
				copyFile(srcFilelist[i].getAbsoluteFile().toString(),destFolder+"\\"+srcFilelist[i].getName());	
			}
			
		    //如果是文件夹
			if (true == srcFilelist[i].isDirectory())
			{
				copyFolder(srcFilelist[i].getAbsoluteFile().toString(),destFolder+"\\"+srcFilelist[i].getName());	
			}			
		}
		
	}
	
	public static void copyFile(String srcFile, String destFile)
	{
		//合法性判断
		if ((null == srcFile)||(null == destFile))
		{
			System.out.println("copyFile输入文件包含空文件");
			return;
		}
		
		File srcf = new File(srcFile);
		File destf = new File(destFile);
		
		if (false == srcf.exists())
		{
			System.out.println("copyFile源文件不存在");
			return;
		}
		
		if ((true == srcf.isDirectory())||(true == destf.isDirectory()))
		{
			System.out.println("copyFile源文件或目标文件为文件夹");
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



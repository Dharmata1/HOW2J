package HOW2J.IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class MergeFile
{
	
	
	public static void main(String args[])
	{
		File destFile = new File("D:/xyz/bootmgr");
		File srcFile[] = new File[4];
		
		for (int i = 0; i < 4 ;i++)
		{
			srcFile[i] = new File("D:/xyz/bootmgr"+i);	
		}
		
		mergeFile(srcFile, destFile);
	}
	
	public static void mergeFile(File[] srcFile,File destFile)
	{
		//判断输入文件是否为空
		for (File f : srcFile)
		{
			if (null == f)
			{
				System.out.println("Find NULL srcFile!");
				return;
			}
		}
		
		if (null == destFile)
		{
			System.out.println("Find NULL destFile!");
			return;
		}

		try
		{
			long destFileLen = 0;
        	FileOutputStream fos = new FileOutputStream(destFile);
			
			//循环读入文件，写入目标文件
			for (File f : srcFile)
			{
	        	FileInputStream fis = new FileInputStream(f);
	        	
	        	byte all[] = new byte[(int)(f.length())];
	        	
	        	fis.read(all);
	        	
	        	//fos.write(all, (int)destFileLen, (int)(f.length()));
	        	fos.write(all);
		        
		        fis.close();
		        
		        destFileLen += f.length();
			}
			
			fos.close();
		}		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

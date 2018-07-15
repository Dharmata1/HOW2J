package j2se;
import java.util.*;
import java.io.*;

public class IOtest
{
	
	public static void copyFile(String srcFile, String destFile)
	{
        File srcf = new File(srcFile);
        File destf = new File(destFile);
        char[] tmp = new char[1024];
		
		try (FileReader fr = new FileReader(srcf)) 
		{
			try (FileWriter fw = new FileWriter(destf)) 
			{
				while(fr.read(tmp) != -1 )
				{
					fw.write(tmp);	
				}
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }  

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}	
	
	public static void copyFolder(String srcFolder, String destFolder)
	{
		//判断是否都是目录
		File srcF = new File(srcFolder);
		File destF = new File(destFolder);
				
		if((false == srcF.isDirectory())||(false == destF.isDirectory()))
	    {
			System.out.print("Not all directory");
			return;
	    }
		
		//源目录文件夹遍历
		File[] srcFiles = srcF.listFiles();
			
		
		//拷贝文件及文件夹到目标目录，这里假定目标目录没有同名文件
		for(File file : srcFiles)
		{
			if(file.isDirectory())
			{
				new File(destFolder,file.getName()).mkdir();
				
				copyFolder(file.getAbsolutePath(),destFolder+"/"+file.getName());
				
				continue;
			}
			
			copyFile(srcFolder+"/"+file.getName(),destFolder+"/"+file.getName());
		}
		
	}
	
  	public static void main(String[] args)
  	{
  		File f = new File("d:/lol2.txt");
  		
  		copyFile("d:/lol1.txt","d:/lol2.txt");
  		
  		copyFolder("d:/lol1","d:/lol2");
  		
  	}

}

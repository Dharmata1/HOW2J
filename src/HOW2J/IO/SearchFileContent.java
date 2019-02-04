package HOW2J.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchFileContent 
{

	public static void main(String args[])
	{
		//查找包含Magic字符串的问价
		File folder = new File("F:/eclipse/Workspace/j2se/src/HOW2J/Testfiles/Src");
		
		search(folder,"Magic");
	}
	
	public static void search(File folder, String search)
	{
		if ((null == folder)||(false == folder.exists()))
		{
			System.out.println("search:folder dosen't exist.");
			return;
		}
		
		if (null == search)
		{
			System.out.println("search:Search String is null.");
			return;		
		}
		
		if (true == folder.isFile())
		{
			String str = fileToString(folder);
			
			if (null == str)
			{
				return;
			}

			if  (true ==  str.contains(search))
			{
				System.out.println("找到子目標字符串"+search+"在文件："+folder.getAbsolutePath());
			}
			
			return;
		}
		
		if (true == folder.isDirectory())
		{
			File[] searchFile = folder.listFiles();
			
			for (int i = 0; i < searchFile.length; i++)
			{
				search(searchFile[i], search);
			}
		}
	}
	
    static String fileToString(File inputFile)
	{
		if((null == inputFile)||(false == inputFile.exists()))
		{
			System.out.println("searchContent:inputFile doesn't exist.");
            return null; 
		}
		
		try(FileReader fr = new FileReader(inputFile))
		{
           //缓存区，一次性读取1024字节
           char[] buffer = new char[(int)inputFile.length()];
		   fr.read(buffer);
		   
		   return new String(buffer);

		}
		catch(IOException e)
    	{
    		e.printStackTrace();
    		return null;
		}		
	}
}
 

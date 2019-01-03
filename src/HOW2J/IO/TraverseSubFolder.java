package HOW2J.IO;

import java.io.File;

public class TraverseSubFolder 
{
    static long minSize = Integer.MAX_VALUE;
    static long maxSize = 0;
    static File minFile = null;
    static File maxFile = null;
	
	public static void main(String args[])
	{
        // 创建文件对象
        File f1 = new File("c:/windows");
         
        traverseSubFolder(f1); 
        
        System.out.println("最大的文件是"+maxFile.getAbsolutePath()+"，其大小是"+maxSize+"字节");
        System.out.println("最小的文件是"+minFile.getAbsolutePath()+"，其大小是"+minSize+"字节");
	}
	
	public static void traverseSubFolder(File inputFile)
	{
		//参数检查
		if (null == inputFile)
		{
    		System.out.println("输入非法null文件");
    		return;
		}
		
		//如果是文件，返回该文件
		if (inputFile.isFile())
		{
			if (maxSize < inputFile.length())
			{
				maxFile = inputFile;	
				maxSize = inputFile.length();
			}
			
			if((0 != inputFile.length())&&(minSize > inputFile.length()))
			{
				minFile = inputFile;	
				minSize = inputFile.length();
			}
			
			return;
		}
				
		//如果是文件夹，遍历其中文件，记录最大文件
		if (inputFile.isDirectory())
		{
			File fs[] = inputFile.listFiles();
			
			if (null == fs)
			{
				return;
			}
			
			for (File f : fs)
			{
				traverseSubFolder(f);
			}
			return;
		}
	
		System.out.println("既不是文件也不是文件夹？？！！");
		
	    return;
	}
}

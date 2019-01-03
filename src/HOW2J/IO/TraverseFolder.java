package HOW2J.IO;
import java.io.File;
import java.io.IOException;

public class TraverseFolder 
{
	public static void main(String args[])
	{
        // 创建文件对象
        File f1 = new File("c:/windows");
        
        //获取文件夹下所有文件
        File[] fs = f1.listFiles();
        if (null == fs)
        {
        	return;
        }
        
        long maxFileLen = 0;
        long minFileLen = Integer.MAX_VALUE;
        String maxFilePath = "";
        String minFilePath = "";
        
        for (int i = 0;i < fs.length; i++)
        {
        	if (fs[i].isDirectory())
        	{
        		continue;
        	}
        	
        	if (maxFileLen < fs[i].length())
        	{
        		maxFileLen = fs[i].length();
        		maxFilePath = fs[i].getAbsolutePath();
        	}
        	
        	if ((minFileLen > fs[i].length())&&(0 != fs[i].length()))
        	{
        		minFileLen = fs[i].length();
        		minFilePath = fs[i].getAbsolutePath();
        	}
        }
        
        System.out.println("最大的文件是"+maxFilePath+"，其大小是"+maxFileLen+"字节");
        System.out.println("最小的文件是"+minFilePath+"，其大小是"+minFileLen+"字节");
	}
	

}


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
		//�ж��Ƿ���Ŀ¼
		File srcF = new File(srcFolder);
		File destF = new File(destFolder);
				
		if((false == srcF.isDirectory())||(false == destF.isDirectory()))
	    {
			System.out.print("Not all directory");
			return;
	    }
		
		//ԴĿ¼�ļ��б���
		File[] srcFiles = srcF.listFiles();
			
		
		//�����ļ����ļ��е�Ŀ��Ŀ¼������ٶ�Ŀ��Ŀ¼û��ͬ���ļ�
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

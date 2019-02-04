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
		//�Ϸ����ж�
		if ((null == srcFolder)||(null == destFolder))
		{
			System.out.println("copyFolder�����ļ��������ļ�");
			return;
		}
		
		File srcfd = new File(srcFolder);
		File destfd = new File(destFolder);
		
		if (false == srcfd.exists())
		{
			System.out.println("copyFolderԴ�ļ�������");
			return;
		}
		

		if (false == srcfd.isDirectory())
		{
			System.out.println("copyFolderԴ�ļ������ļ���");
			return;			
		}
		
		if (true == destfd.isFile())
		{
			System.out.println("copyFolderĿ���ļ������ļ���");
			return;			
		}
		
		if (false == destfd.exists())
		{
			destfd.mkdir();
			System.out.println("copyFolder�����ļ���"+destFolder);
		}
		
		//Դ�ļ������ļ����ļ��зֱ���
		File[] srcFilelist =  srcfd.listFiles();
		
		for (int i = 0;i < srcFilelist.length; i++)
		{
		    //������ļ�
			if (false == srcFilelist[i].isDirectory())
			{
				copyFile(srcFilelist[i].getAbsoluteFile().toString(),destFolder+"\\"+srcFilelist[i].getName());	
			}
			
		    //������ļ���
			if (true == srcFilelist[i].isDirectory())
			{
				copyFolder(srcFilelist[i].getAbsoluteFile().toString(),destFolder+"\\"+srcFilelist[i].getName());	
			}			
		}
		
	}
	
	public static void copyFile(String srcFile, String destFile)
	{
		//�Ϸ����ж�
		if ((null == srcFile)||(null == destFile))
		{
			System.out.println("copyFile�����ļ��������ļ�");
			return;
		}
		
		File srcf = new File(srcFile);
		File destf = new File(destFile);
		
		if (false == srcf.exists())
		{
			System.out.println("copyFileԴ�ļ�������");
			return;
		}
		
		if ((true == srcf.isDirectory())||(true == destf.isDirectory()))
		{
			System.out.println("copyFileԴ�ļ���Ŀ���ļ�Ϊ�ļ���");
			return;			
		}
		
		try (FileInputStream srcfin = new FileInputStream(srcf);
			FileOutputStream destfout = new FileOutputStream(destf);)
		{
			byte all[] = new byte[(int)srcf.length()];
			srcfin.read(all);//��Ҫ������ǣ�read�᷵��ʵ�ʵĶ�ȡ�������п���ʵ�ʵĶ�ȡ����С�ڻ���Ĵ�С,�ʴ˶δ�����Ҫ����
			destfout.write(all);			
		}
		catch(IOException e) 
		{
	        // TODO Auto-generated catch block
	        e.printStackTrace();
		} 
    }
}



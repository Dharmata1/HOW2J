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
		//�Ϸ����ж�
		if ((null == srcFile)||(null == destFile))
		{
			System.out.println("�����ļ��������ļ�");
			return;
		}
		
		File srcf = new File(srcFile);
		File destf = new File(destFile);
		
		if (false == srcf.exists())
		{
			System.out.println("Դ�ļ�������");
			return;
		}
		
		if ((true == srcf.isDirectory())||(true == destf.isDirectory()))
		{
			System.out.println("Դ�ļ���Ŀ���ļ�Ϊ�ļ���");
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

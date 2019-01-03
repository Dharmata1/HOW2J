package HOW2J.IO;
import java.io.File;
import java.io.IOException;

public class TraverseFolder 
{
	public static void main(String args[])
	{
        // �����ļ�����
        File f1 = new File("c:/windows");
        
        //��ȡ�ļ����������ļ�
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
        
        System.out.println("�����ļ���"+maxFilePath+"�����С��"+maxFileLen+"�ֽ�");
        System.out.println("��С���ļ���"+minFilePath+"�����С��"+minFileLen+"�ֽ�");
	}
	

}


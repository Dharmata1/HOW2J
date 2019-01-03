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
        // �����ļ�����
        File f1 = new File("c:/windows");
         
        traverseSubFolder(f1); 
        
        System.out.println("�����ļ���"+maxFile.getAbsolutePath()+"�����С��"+maxSize+"�ֽ�");
        System.out.println("��С���ļ���"+minFile.getAbsolutePath()+"�����С��"+minSize+"�ֽ�");
	}
	
	public static void traverseSubFolder(File inputFile)
	{
		//�������
		if (null == inputFile)
		{
    		System.out.println("����Ƿ�null�ļ�");
    		return;
		}
		
		//������ļ������ظ��ļ�
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
				
		//������ļ��У����������ļ�����¼����ļ�
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
	
		System.out.println("�Ȳ����ļ�Ҳ�����ļ��У�������");
		
	    return;
	}
}

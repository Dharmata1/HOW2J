package HOW2J.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CloseStreamHandle 
{
	public static void main(String args[])
	{
		//�� ����ļ� �йر����ķ���޸ĳ� finally ��ʽ
		
		//������ļ����� "D:\xyz\bootmgr"
		File fIn = new File("D:/xyz/bootmgr");
		FileInputStream fis = null;
		
		try
		{			
	        fis = new FileInputStream(fIn);
	        
	        /*
			//�����ֽ����飬�䳤�Ⱦ����ļ��ĳ���
	        byte[] all =new byte[(int) fIn.length()];
	        //���ֽ�������ʽ��ȡ�ļ���������
	        fis.read(all);
	        
			
			//��100kΪ��λ����������������ֽ�������
			for (long i = 0; i*102400 <= fIn.length(); i++)
			{
					File fOut = new File("D:/xyz/bootmgr"+i);			
					FileOutputStream fos = new FileOutputStream(fOut); //��������ӵ�����ļ�
            
					if (fIn.length()-i*102400 >= 102400)
					{
	                    fos.write(all, (int)(i*102400), 102400);
					}
					else
					{
						fos.write(all, (int)(i*102400), (int)(fIn.length()-i*102400));
					}
			}
			
        
			//���ݲ�ֺ���ֽ�����������ļ�����ָ�������������ļ�
	        */
	        	        
		}
		catch(IOException e) 
		{
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
		finally
		{           // ��finally�йر�
            try 
            {
                if(null!=fis)
                {
                	fis.close();
                }
                    
            }
            catch (IOException e) 
            {
  
                e.printStackTrace();
            }
		}
		
		
		//�� �ϲ��ļ� �йر����ķ���޸ĳ� try() ��ʽ
		try(FileOutputStream fos = new FileOutputStream(fIn);)
		{
			/*
			long destFileLen = 0;
        	FileOutputStream fos = new FileOutputStream(destFile);
			
        	
			//ѭ�������ļ���д��Ŀ���ļ�
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
			*/
		}		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

package HOW2J.IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SpilitFile 
{
	public static void main(String args[])
	{
		try
		{			
			//������ļ����� "D:\xyz\bootmgr"
			File fIn = new File("D:/xyz/bootmgr");
			
	        FileInputStream fis = new FileInputStream(fIn);
	        
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
	        
	        
	        fis.close();		
		}
		catch(IOException e) 
		{
            // TODO Auto-generated catch block
            e.printStackTrace();
		}

	}

}

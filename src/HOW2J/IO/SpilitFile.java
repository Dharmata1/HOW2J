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
			//待拆分文件输入 "D:\xyz\bootmgr"
			File fIn = new File("D:/xyz/bootmgr");
			
	        FileInputStream fis = new FileInputStream(fIn);
	        
			//创建字节数组，其长度就是文件的长度
	        byte[] all =new byte[(int) fIn.length()];
	        //以字节流的形式读取文件所有内容
	        fis.read(all);
	        
			
			//以100k为单位，将输入流输入的字节数组拆分
			for (long i = 0; i*102400 <= fIn.length(); i++)
			{
					File fOut = new File("D:/xyz/bootmgr"+i);			
					FileOutputStream fos = new FileOutputStream(fOut); //输出流连接到输出文件
            
					if (fIn.length()-i*102400 >= 102400)
					{
	                    fos.write(all, (int)(i*102400), 102400);
					}
					else
					{
						fos.write(all, (int)(i*102400), (int)(fIn.length()-i*102400));
					}
			}
			
        
			//各份拆分后的字节流输出到新文件，按指定规则命名新文件
	        
	        
	        fis.close();		
		}
		catch(IOException e) 
		{
            // TODO Auto-generated catch block
            e.printStackTrace();
		}

	}

}

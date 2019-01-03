package HOW2J.IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class RemoveBom 
{
	
	public static void main(String args[])
	{
		File RemoveBomSource = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/RemoveBomSource.txt");
		
		File RemoveBomAim = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/RemoveBomAim.txt");

		try(//*FileOutputStream fos = new FileOutputStream(RemoveBomSource);
		    FileInputStream fis = new FileInputStream(RemoveBomSource);
			FileOutputStream fosAim = new FileOutputStream(RemoveBomAim);)
		{	
			//以UTF-8格式保存”aaabbb”字至文件F:\eclipse\Workspace\j2se\src\HOW2J\Testfiles\RemoveBomSource.txt
			//fos.write("中".getBytes("UTF-8"));
			
			//获取文件内容至内存
			byte all[] = new byte[(int)RemoveBomSource.length()];
			
			fis.read(all);
			
			//将”aaa”前面的所有字节保存下来，即为BOM
			String str = new String(all,"ISO-8859-1");
			
			int indexAfterBom =  str.indexOf("aaa");
		
			if (indexAfterBom != -1)
			{
				byte result[] = Arrays.copyOfRange(all, indexAfterBom, all.length);
				
				fosAim.write(result);
			}

		}
		catch(IOException e) 
		{
	        // TODO Auto-generated catch block
	        e.printStackTrace();
		}

		String s="heisa??\t\nboy";
		int result=s.indexOf("boy");
        System.out.println(result);
		//删除”中”字前面的BOM头		
	}


}

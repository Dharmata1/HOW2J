package HOW2J.IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamToNewFile 
{
	public static void main(String args[])
	{
		try
		{
			File outFile = new File("d:/xyz/abc/def/lol2.txt");
			outFile.getParentFile().mkdirs();
			byte data[] = {88, 89};
			FileOutputStream fos = new FileOutputStream(outFile);
			fos.write(data);
			fos.close();
			
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}

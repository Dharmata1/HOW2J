package HOW2J.IO;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteNumberToFile 
{
	public static void main(String args[])
	{
		File numFile = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/WriteNumberToFile.txt");
		
		try(FileOutputStream fos = new FileOutputStream(numFile);
			DataOutputStream dos =new DataOutputStream(fos);
			FileInputStream fis = new FileInputStream(numFile);
			DataInputStream dis =new DataInputStream(fis))
		{
			int i1 = 33;
			int i2 = 44;
			
			dos.writeInt(i1);
			dos.writeInt(i2);
			
			int i1test = dis.readInt();
			int i2test = dis.readInt();
            
            System.out.println("读取到第一个整型值:"+i1test);
            System.out.println("读取到第二个整型值:"+i2test);		
		}
		catch(IOException e) 
		{
            e.printStackTrace();	
		}
	}

}

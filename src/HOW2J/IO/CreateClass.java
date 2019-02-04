package HOW2J.IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

import HOW2J.IO.ObjectStream.Hero;

public class CreateClass 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		System.out.println("������������ƣ�");
		String className = s.nextLine();
		
		System.out.println("���������Ե����ͣ�");
		String propertyType = s.nextLine();
		
		System.out.println("���������Ե����ƣ�");
		String propertyName = s.nextLine();
		char upperCaseFirst = Character.toUpperCase(propertyName.charAt(0));
		String upProtertyName = upperCaseFirst+propertyName.substring(1);

	    File fin = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/templet.java");
	    File fout = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/"+className+".java");
	    
	    try(    //�������������
	            FileOutputStream fos = new FileOutputStream(fout);
	            //��������������              
	            FileInputStream fis = new FileInputStream(fin);
	    	)
	    {
	    	//ģ���ļ����ݶ����ڴ�
	    	byte all[] =new byte[(int)fin.length()];
	        fis.read(all);
	    	
	    	//�滻ģ���е������ơ��������͡���������
	        String templetStr = new String(all);
	        
	        templetStr = templetStr.replaceAll("@class@", className);
	        templetStr = templetStr.replaceAll("@type@", propertyType);
	        templetStr = templetStr.replaceAll("@property@", propertyName);
	        templetStr = templetStr.replaceAll("@Uproperty@", upProtertyName);
	        
	    	//�����޸ĺ�ģ�嵽�����
	    	fos.write(templetStr.getBytes());
	    	
			System.out.println("�滻������ݣ�");
			System.out.println(templetStr);
			
			System.out.print("�ļ������ڣ�");
			System.out.println(fout.getAbsolutePath());	    	
	    }
	    catch(IOException e) 
	    {
            // TODO Auto-generated catch block
            e.printStackTrace();
	    }
	}

}

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

		System.out.println("请输入类的名称：");
		String className = s.nextLine();
		
		System.out.println("请输入属性的类型：");
		String propertyType = s.nextLine();
		
		System.out.println("请输入属性的名称：");
		String propertyName = s.nextLine();
		char upperCaseFirst = Character.toUpperCase(propertyName.charAt(0));
		String upProtertyName = upperCaseFirst+propertyName.substring(1);

	    File fin = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/templet.java");
	    File fout = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/"+className+".java");
	    
	    try(    //创建对象输出流
	            FileOutputStream fos = new FileOutputStream(fout);
	            //创建对象输入流              
	            FileInputStream fis = new FileInputStream(fin);
	    	)
	    {
	    	//模板文件内容读入内存
	    	byte all[] =new byte[(int)fin.length()];
	        fis.read(all);
	    	
	    	//替换模板中的类名称、属性类型、属性名称
	        String templetStr = new String(all);
	        
	        templetStr = templetStr.replaceAll("@class@", className);
	        templetStr = templetStr.replaceAll("@type@", propertyType);
	        templetStr = templetStr.replaceAll("@property@", propertyName);
	        templetStr = templetStr.replaceAll("@Uproperty@", upProtertyName);
	        
	    	//保存修改后模板到输出流
	    	fos.write(templetStr.getBytes());
	    	
			System.out.println("替换后的内容：");
			System.out.println(templetStr);
			
			System.out.print("文件保存在：");
			System.out.println(fout.getAbsolutePath());	    	
	    }
	    catch(IOException e) 
	    {
            // TODO Auto-generated catch block
            e.printStackTrace();
	    }
	}

}

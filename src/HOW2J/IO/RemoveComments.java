package HOW2J.IO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class RemoveComments 
{
	public static void main(String[] args)
	{
		//使用缓存流读取测试java文件至内存，使用缓存流打开目标java文件
		File fin = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/TestInput.java");

		File fout = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/TestOutput.java");


        try (   // 创建文件字符流
        		// 缓存流必须建立在一个存在的流的基础上
                FileReader fr = new FileReader(fin);
                BufferedReader br = new BufferedReader(fr);
        		
                FileWriter fw = new FileWriter(fout);
        		PrintWriter bw = new PrintWriter(fw);
        		)
        {
            while (true) 
            {
                // 一次读一行
                String line = br.readLine();
                if (null == line)
                {
                    break;                	
                }
                
                int index = line.indexOf("//");

                if (0 == index)
                {
                	continue;
                }
                
                bw.println(line);
                System.out.println(line);	
                
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
  
		
		//逐行读取，非注释行写入目标java文件		
	}

}

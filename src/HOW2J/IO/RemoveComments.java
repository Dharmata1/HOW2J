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
		//ʹ�û�������ȡ����java�ļ����ڴ棬ʹ�û�������Ŀ��java�ļ�
		File fin = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/TestInput.java");

		File fout = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/TestOutput.java");


        try (   // �����ļ��ַ���
        		// ���������뽨����һ�����ڵ����Ļ�����
                FileReader fr = new FileReader(fin);
                BufferedReader br = new BufferedReader(fr);
        		
                FileWriter fw = new FileWriter(fout);
        		PrintWriter bw = new PrintWriter(fw);
        		)
        {
            while (true) 
            {
                // һ�ζ�һ��
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
  
		
		//���ж�ȡ����ע����д��Ŀ��java�ļ�		
	}

}

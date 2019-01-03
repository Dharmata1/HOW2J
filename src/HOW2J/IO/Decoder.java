package HOW2J.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decoder 
{
	 public static void main(String args[])
	 {
         //��Դ�ļ���Ŀ���ļ������кϷ����ж�
    	File decodingFile = new File("d:/encodedFile.txt");
    	
        File decodedFile = new File("d:/decodedFile.txt");

        //���ü��ܷ������ļ����м���
        decodeFile(decodingFile, decodedFile);

	}

    public static void decodeFile(File decodingFile, File decodedFile)
    {
    	try
    	{
            //�����ַ���
            FileReader fin = new FileReader(decodingFile);

            //ȫ�������ڴ�
            char[] content = new char[(int)decodingFile.length()];
            fin.read(content);

            //��������н���
            for (int i = 0; i < content.length ; i++)
            {
                if (('0'<= content[i])&&(content[i]  <= '9'))
                {
                    if ('0' == content[i])
                    {
                    	content[i] = '9';
                    }
                    else
                    {
                    	content[i] -= 1;
                    }

                }
                else if ((('a'<= content[i])&&(content[i] <= 'z'))||(('A'<= content[i])&&(content[i] <= 'Z')))
                {
                    if ('a' == content[i])
                    {
                    	content[i] = 'z';
                    }
                    else if ('A' == content[i])
                    {
                    	content[i] = 'Z';
                    }
                    else
                    {
                    	content[i] -= 1;
                    }
                }
                else
                {

                }
            }

            //���д��Ŀ���ļ������
            FileWriter fout = new FileWriter(decodedFile);
            fout.write(content);
            fout.close();
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();

    	}

    }	

}

package HOW2J.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class  Encoder
{
    public static void main(String args[])
    {
         //��Դ�ļ���Ŀ���ļ������кϷ����ж�
    	File encodingFile = new File("d:/encodingFile.txt");
    	
        File encodedFile = new File("d:/encodedFile.txt");

        //���ü��ܷ������ļ����м���
        encodeFile(encodingFile, encodedFile);

    }

    public static void encodeFile(File encodingFile, File encodedFile)
    {
    	try
    	{
            //�����ַ���
            FileReader fin = new FileReader(encodingFile);

            //ȫ�������ڴ�
            char[] content = new char[(int)encodingFile.length()];
            fin.read(content);

            //��������м���
            for (int i = 0; i < content.length ; i++)
            {
                if (('0'<= content[i])&&(content[i]  <= '9'))
                {
                    if ('9' == content[i])
                    {
                    	content[i] = '0';
                    }
                    else
                    {
                    	content[i] += 1;
                    }

                }
                else if ((('a'<= content[i])&&(content[i] <= 'z'))||(('A'<= content[i])&&(content[i] <= 'Z')))
                {
                    if ('z' == content[i])
                    {
                    	content[i] = 'a';
                    }
                    else if ('Z' == content[i])
                    {
                    	content[i] = 'A';
                    }
                    else
                    {
                    	content[i] += 1;
                    }
                }
                else
                {

                }
            }

            //���д��Ŀ���ļ������
            FileWriter fout = new FileWriter(encodedFile);
            fout.write(content);
            fout.close();
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();

    	}

    }
}
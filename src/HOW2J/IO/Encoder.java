package HOW2J.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class  Encoder
{
    public static void main(String args[])
    {
         //打开源文件和目标文件，进行合法性判断
    	File encodingFile = new File("d:/encodingFile.txt");
    	
        File encodedFile = new File("d:/encodedFile.txt");

        //调用加密方法对文件进行加密
        encodeFile(encodingFile, encodedFile);

    }

    public static void encodeFile(File encodingFile, File encodedFile)
    {
    	try
    	{
            //生成字符流
            FileReader fin = new FileReader(encodingFile);

            //全部读入内存
            char[] content = new char[(int)encodingFile.length()];
            fin.read(content);

            //按规则进行加密
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

            //结果写到目标文件输出流
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
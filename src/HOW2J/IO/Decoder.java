package HOW2J.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decoder 
{
	 public static void main(String args[])
	 {
         //打开源文件和目标文件，进行合法性判断
    	File decodingFile = new File("d:/encodedFile.txt");
    	
        File decodedFile = new File("d:/decodedFile.txt");

        //调用加密方法对文件进行加密
        decodeFile(decodingFile, decodedFile);

	}

    public static void decodeFile(File decodingFile, File decodedFile)
    {
    	try
    	{
            //生成字符流
            FileReader fin = new FileReader(decodingFile);

            //全部读入内存
            char[] content = new char[(int)decodingFile.length()];
            fin.read(content);

            //按规则进行解密
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

            //结果写到目标文件输出流
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

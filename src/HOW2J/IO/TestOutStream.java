package HOW2J.IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutStream 
{ 
    public static void main(String[] args) {
        try {
            File f = new File("d:/lol.txt");
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 通过这个输出流，就可以把数据从文件（内存）输出到硬盘；
 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}

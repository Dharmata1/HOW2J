package HOW2J.IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutStream 
{ 
    public static void main(String[] args) {
        try {
            File f = new File("d:/lol.txt");
            // ���������ļ��������
            FileOutputStream fos = new FileOutputStream(f);
            // ͨ�������������Ϳ��԰����ݴ��ļ����ڴ棩�����Ӳ�̣�
 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}

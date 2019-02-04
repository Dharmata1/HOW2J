package HOW2J.���Ͽ��;
import java.util.ArrayList;
import java.util.Iterator;

public class TraverseAlist 
{
	public static void main(String args[])
	{
		ArrayList test = new ArrayList();
		
		for (int i = 0 ; i<= 24 ; i++)
		{
			test.add(new Test("Hero "+i));
		}
		
        //�ڶ��ֱ�����ʹ�õ�����
        System.out.println("--------ʹ��while��iterator-------");
        Iterator<Test> it= test.iterator();
        //���ʼ��λ���ж�"��һ��"λ���Ƿ�������
        //����о�ͨ��nextȡ���������Ұ�ָ�������ƶ�
        //ֱ��"��һ��"λ��û������
        while(it.hasNext()){
            Test t = it.next();
            int a = Integer.parseInt(t.name.substring(5, t.name.length()));
            if (0 == a%8)
            {
            	it.remove();
            }
        }
        
        
        //��������forд��
        System.out.println("--------ʹ��for��iterator-------");
        for (Iterator<Test> iterator = test.iterator(); iterator.hasNext();) {
            Test t = (Test) iterator.next();
            System.out.println(t.name);
        }
		
		
	}
}

class Test
{
	public String name;
	
	Test(String name)
	{
		this.name = name;
	}
}

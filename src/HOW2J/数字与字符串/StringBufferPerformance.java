package HOW2J.�������ַ���;
import HOW2J.�������ַ���.CountDuplication;

public class StringBufferPerformance 
{
	public static void main(String args[])
	{
		String strRadom = CountDuplication.randomString(10);
		String str = "";
		StringBuffer strBuf = new StringBuffer();
	
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
		{
			str += strRadom;
		}
		long end = System.currentTimeMillis();
		System.out.printf("ʹ���ַ�������+�ķ�ʽ������10000�Σ���ʱ%d����%n",(end-start));
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
		{
			strBuf.append(strRadom);
		}
		end = System.currentTimeMillis();
		System.out.printf("ʹ��StringBuffer��append����������10000�Σ���ʱ%d����%n",(end-start));

		
	}

}

package HOW2J.数字与字符串;
import HOW2J.数字与字符串.CountDuplication;

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
		System.out.printf("使用字符串连接+的方式，连接10000次，耗时%d毫秒%n",(end-start));
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
		{
			strBuf.append(strRadom);
		}
		end = System.currentTimeMillis();
		System.out.printf("使用StringBuffer的append方法，连接10000次，耗时%d毫秒%n",(end-start));

		
	}

}

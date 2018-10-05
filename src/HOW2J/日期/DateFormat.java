package HOW2J.����;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormat 
{
	public static void main(String args[])
	{
		//������������
		Date d[] = new Date[9];
		
		//��ȡ������ڣ��������������ǰ����
		System.out.println("�õ�������������飺");
	
		int leapYearCount = 0;
		for (int year = 1970; year <= 2000; year++)
		{
			if (((0 == year%4)&&(0 != year%100))||((0 == year%400)&&(0 == year%100)))
			{
				leapYearCount++;
			}
			
		}
		
		long dateGapMillis = ((2001-1970-(long)leapYearCount)*365+(long)leapYearCount*366)*24*60*60*1000;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for (int i = 0; i < 9; i++)
		{
			long randomDateMillis = (long)(Math.random()*dateGapMillis); 
			d[i] = new Date(randomDateMillis);
			
			System.out.print(sdf.format(d[i])+" ");
			
			if (2 == i%3)
			{
				System.out.println();
			}
			
		}
		
		//��ʱ������
		sdf = new SimpleDateFormat("HH:mm:ss SSS" );	
         
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9-i-1; j++)
			{
				if (sdf.format(d[j]).compareTo(sdf.format(d[j+1]))<0)
				{
					Date temp = d[j];
					d[j] = d[j+1];
					d[j+1] = temp;
				}
			}
		}
		
		
		//������������
		System.out.println("\n����������������飺");
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for (int i = 0; i < 9; i++)
		{
			System.out.print(sdf.format(d[i])+" ");
			
			if (2 == i%3)
			{
				System.out.println();
			}
			
		}
	}

}

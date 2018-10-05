package HOW2J.����;

import java.util.Date;

public class DateRadom
{
	public static void main(String args[])
	{
		//���������������һ����1995.1.1 00:00:00 �� 1995.12.31 23:59:59 ֮����������
		// date��1970��1��1�� ����8��0��0�� ��ʼ����
		//����1970��1995����������
		int leapYearCount = 0;
		for (int year = 1970; year <= 1995; year++)
		{
			if (((0 == year%4)&&(0 != year%100))||((0 == year%400)&&(0 == year%100)))
			{
				leapYearCount++;
			}
			
		}
		
		long dateGapMillis = ((1995-1970-(long)leapYearCount)*365+(long)leapYearCount*366)*24*60*60*1000-8*60*60*1000;
		
		Date dStart = new Date(dateGapMillis);
		
		System.out.println("1995��ĵ�һ�죺"+dStart.toString());
		
		Date dEnd = new Date(dateGapMillis+(long)365*24*60*60*1000-1);
		
		System.out.println("1995������һ�죺"+dEnd.toString());
		
		long ramdonMillis = (long)(Math.random()*(long)365*24*3600*1000);
		
		Date ramdonDay = new Date(dateGapMillis+ramdonMillis);
		
		System.out.println("1995����һ���е�һ�����ʱ�䣺"+ramdonDay.toString());
		System.out.println("1996�����"+new Date(dateGapMillis+(long)365*24*3600*1000).toString());

	}

}

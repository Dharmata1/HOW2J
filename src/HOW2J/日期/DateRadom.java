package HOW2J.日期;

import java.util.Date;

public class DateRadom
{
	public static void main(String args[])
	{
		//借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
		// date从1970年1月1日 早上8点0分0秒 开始计算
		//计算1970到1995间的闰年次数
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
		
		System.out.println("1995年的第一天："+dStart.toString());
		
		Date dEnd = new Date(dateGapMillis+(long)365*24*60*60*1000-1);
		
		System.out.println("1995年的最后一天："+dEnd.toString());
		
		long ramdonMillis = (long)(Math.random()*(long)365*24*3600*1000);
		
		Date ramdonDay = new Date(dateGapMillis+ramdonMillis);
		
		System.out.println("1995年这一年中的一个随机时间："+ramdonDay.toString());
		System.out.println("1996年初："+new Date(dateGapMillis+(long)365*24*3600*1000).toString());

	}

}

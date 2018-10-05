package HOW2J.日期;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormat 
{
	public static void main(String args[])
	{
		//定义日期数组
		Date d[] = new Date[9];
		
		//获取随机日期，并输出倒序排序前日期
		System.out.println("得到的随机日期数组：");
	
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
		
		//按时间排序
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
		
		
		//输出排序后日期
		System.out.println("\n排序后的随机日期数组：");
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

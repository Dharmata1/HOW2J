package HOW2J.日期;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarDays 
{
	public static void main(String args[])
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("今天是："+sdf.format(c.getTime()));
        //c.add(Calendar.MONTH, 2);
        //c.set(Calendar.DATE, -2);
        
        c.add(Calendar.MONTH,2);
        //设置到月初
        c.set(Calendar.DATE,1);
        //再往回翻3天
        c.add(Calendar.DATE,-3);
		
		System.out.println("下个月倒数第三天是："+sdf.format(c.getTime()));
	}
}
/*
ParseException 解析异常，日期字符转换为日期对象的时候，有可能抛出异常
OutOfIndexException数组下标越界异常
OutOfMemoryException内存不足
ClassCastException类型转换异常
ArithmaticException除数为零
NullPointerException空指针异常
*/
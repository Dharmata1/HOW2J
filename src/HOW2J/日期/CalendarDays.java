package HOW2J.����;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarDays 
{
	public static void main(String args[])
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("�����ǣ�"+sdf.format(c.getTime()));
        //c.add(Calendar.MONTH, 2);
        //c.set(Calendar.DATE, -2);
        
        c.add(Calendar.MONTH,2);
        //���õ��³�
        c.set(Calendar.DATE,1);
        //�����ط�3��
        c.add(Calendar.DATE,-3);
		
		System.out.println("�¸��µ����������ǣ�"+sdf.format(c.getTime()));
	}
}
/*
ParseException �����쳣�������ַ�ת��Ϊ���ڶ����ʱ���п����׳��쳣
OutOfIndexException�����±�Խ���쳣
OutOfMemoryException�ڴ治��
ClassCastException����ת���쳣
ArithmaticException����Ϊ��
NullPointerException��ָ���쳣
*/
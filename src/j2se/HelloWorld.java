package j2se;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class HelloWorld {

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		
	
	public static void main(String[] args)
	{
		
		byte ba = 1;
		short sb = 2;
		float fc = 3;
		double dd = 4;
		int ie = 5;
		
		Byte bca = ba;
		Short scb = sb;
		byte ba2 = bca;
		
		Integer ice = (int)ba;
		byte ba3 = (byte)ie;
		
		String str = new String();
		str = Float.toString(3.14f);
		str = String.valueOf(3.14f);
		float f1 = Float.valueOf("3.14");
		
        System.out.println(Math.E);
        int n = Integer.MAX_VALUE;
        System.out.println(Math.pow(1+1d/n,n));
		
		System.out.println(f1);
		
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println("Hello World");
		
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
	
        System.out.println("当前日期：\t" + sdf.format(c.getTime()));
		
		c.add(Calendar.MONTH,2);
		c.set(Calendar.DAY_OF_MONTH,-2);
		
        System.out.println("下个月的倒数第3天：\t" + sdf.format(c.getTime()));
        
        
        //Scanner in = new Scanner(System.in);
        
        //int a = 1,b = 0;
        
        //a = in.nextInt();
        //b = in.nextInt();
        
        //System.out.println(a+b);
        //System.out.println(++a + a++ + ++a + ++a + a++);
        
        Scanner in1 = new Scanner(System.in);
        
        System.out.println("输入你的身高(m)：");
        double hight = in1.nextDouble();
        System.out.println("输入你的体重(kg)：");
        double weight = in1.nextDouble();
        
        System.out.println("你的BMI"+(weight/(hight*hight)));
	}

}

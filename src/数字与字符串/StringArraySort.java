package 数字与字符串;
import java.util.Arrays;

public class StringArraySort 
{
	public static void main(String args[])
	{
		String str[] = new String[8];
		
		for (int i = 0; i < str.length; i++)
		{
			String randomString = randomString(5);
			str[i] = randomString;
		}
		
        System.out.println("未排序前的字符串数组:");
        System.out.println(Arrays.toString(str));
        
		for (int i = str.length-1; i >=0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (Character.toLowerCase(str[j].charAt(0)) 
					< Character.toLowerCase(str[j+1].charAt(0)))
				{
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
				}
			}
		}
		
        System.out.println("未排序前的字符串数组:");
        System.out.println(Arrays.toString(str));		
	}
	
	static String randomString(int length)
	{
		String pool = "";
		
		for (short i = '0'; i <= '9'; i++)
		{
			pool += (char)i;
		}
		
		for (short i = 'a'; i <= 'z'; i++)
		{
			pool += (char)i;
		}
		
		for (short i = 'A'; i <= 'Z'; i++)
		{
			pool += (char)i;
		}
		
		char cs[] = new char[length];	
		
		for (int i = 0; i < length; i++)
		{
			cs[i] = (char)(pool.charAt((int)(Math.random()*(pool.length()))));
		}
		
		return new String(cs);
	}

}

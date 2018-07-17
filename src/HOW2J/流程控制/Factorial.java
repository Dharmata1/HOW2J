package HOW2J.流程控制;
import java.util.Scanner;

public class Factorial 
{
	
	public static void main(String args[])
	{
	    Scanner sIn = new Scanner(System.in);
	    System.out.println("请输入一个整数");
	    
	    int number = sIn.nextInt();
		long result = 1;
	    
	    while (number > 1)
	    {
	    	result *= number;
	    	number--;
	    }	
	    
	    if ( number == 1 )
	    {
	    	System.out.println("阶乘是："+result);
	    }
	    else
	    {
		    System.out.println("输入错误");
	    } 
	    
	}	

}

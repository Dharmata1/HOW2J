package HOW2J.���̿���;
import java.util.Scanner;

public class Factorial 
{
	
	public static void main(String args[])
	{
	    Scanner sIn = new Scanner(System.in);
	    System.out.println("������һ������");
	    
	    int number = sIn.nextInt();
		long result = 1;
	    
	    while (number > 1)
	    {
	    	result *= number;
	    	number--;
	    }	
	    
	    if ( number == 1 )
	    {
	    	System.out.println("�׳��ǣ�"+result);
	    }
	    else
	    {
		    System.out.println("�������");
	    } 
	    
	}	

}

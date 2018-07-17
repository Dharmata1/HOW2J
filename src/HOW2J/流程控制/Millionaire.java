package HOW2J.流程控制;

public class Millionaire 
{
	public static void main(String args[])
	{
		//int principal = 12000;
		double rate = 0.2;
		double finalCash = 12000;
		int year = 1;
		
		while (true)
		{
			finalCash = finalCash*(1+rate);
					
		    if (finalCash >= 1000000)
		    {
		    	System.out.println("持续投资"+year+"年，可实现收入百万");
		    	break;
		    }
		    
		    finalCash += 12000;
			
		    year++;
		}
	}

}

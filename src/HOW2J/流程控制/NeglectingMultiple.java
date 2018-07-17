package HOW2J.Á÷³Ì¿ØÖÆ;

public class NeglectingMultiple
{
	public static void main(String args[])
	{
		for (int i = 1;i <= 100;i++)
		{
		    if ((0 == i%3)||(0 == i%5))
		    {
		    	continue;
		    }
		    
		    System.out.println(i);
		}		
	}

}

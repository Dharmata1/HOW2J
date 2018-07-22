package HOW2J.สýื้;

public class ArrayMinValue 
{
    public static void main(String args[])
    {
    	int[] a = new int[5];
    	int minValue = 100;
    	
    	for (int i = 0;i < a.length;i++)
    	{
    		a[i] = (int)(Math.random()*100);
    		
    		if (minValue > a[i])
    		{
    			minValue = a[i];
    		}
    		
    		System.out.println(a[i]);
    	}
    	
		System.out.println("Min:"+minValue);
    }
}

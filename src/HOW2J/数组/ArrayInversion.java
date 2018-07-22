package HOW2J.สýื้;

public class ArrayInversion 
{
    public static void main(String args[])
    {
    	int[] a = new int[5];
    	
    	for (int i = 0;i < a.length;i++)
    	{
    		a[i] = (int)(Math.random()*100);
        	System.out.println(a[i]);
    	}
    	
    	for (int i = 0,temp;i < a.length/2;i++)
    	{
    		temp = a[i];
    		a[i] = a[a.length-1-i];
    		a[a.length-1-i] = temp;
    	}
    	
    	for (int i = 0;i < a.length;i++)
    	{
        	System.out.println(a[i]);
    	}
    	
    }
}

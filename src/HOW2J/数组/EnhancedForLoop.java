package HOW2J.สýื้;

public class EnhancedForLoop 
{
	public static void main(String args[])
	{
		int a[] =new int[]{3,44,3,22,42,1};
		int max = a[1];
		
		for (int each:a)
		{
			if (each > max)
			{
				max = each;
			}
		}
		
		System.out.print(max);
		
	}

}

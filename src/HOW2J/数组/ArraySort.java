package HOW2J.Êý×é;

public class ArraySort 
{
	public static void main(String args[])
	{
		int[] a = new int[5];
		
		for (int i = 0;i < a.length;i++)
		{
			a[i] = (int)(Math.random()*100);
		}
		
		for (int i = 0;i < a.length;i++)
		{
			int temp;
						
			for (int j = i+1;j < a.length;j++)
			{
				if (a[j] < a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;					
				}
			}
		}
		
		System.out.println("Ñ¡Ôñ·¨ÕýÐòÅÅÐò£º");
		for (int i = 0;i < a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for (int j = a.length-1;j >=0;j--)
		{
			for (int i = 0;i < j;i++)
			{
				int temp;
							
				if (a[i] < a[i+1])
				{
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;					
				}
				
			}
		}
			
		System.out.println("Ã°ÅÝ·¨µ¹ÐòÅÅÐò£º");
		for (int i = 0;i < a.length;i++)
		{
			System.out.println(a[i]);
		}		

	}

}

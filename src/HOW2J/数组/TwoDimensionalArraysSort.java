package HOW2J.สýื้;

import java.util.Arrays;

public class TwoDimensionalArraysSort 
{
	public static void main(String[] args)
	{
		int a[][]=new int[5][8];
		int b[] = new int[a.length*a[0].length];
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				a[i][j] = (int)(Math.random()*100);
				System.out.print(a[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.arraycopy(a[i], 0, b, i*a[0].length, a[0].length);	
		}		
		
		Arrays.sort(b);
		
		for (int i = 0; i < a.length; i++)
		{
			System.arraycopy(b, i*a[0].length, a[i], 0, a[0].length);	
		}			
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			
			System.out.println();
		}
	}

}

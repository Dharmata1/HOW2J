package HOW2J.Êı×ÖÓë×Ö·û´®;

public class JudgePrimeNumber 
{
	public static void main(String args[])
	{
		int primeNumber = 0;
		boolean primeFlag = true; 
		
		for (int i = 1;i <= 10000000;i++)
		{
			for (int j = 2; j <= Math.sqrt(i); j++)
			{
				if (i%j == 0)
				{	
					primeFlag = false;				
					break;
				}
			}
			
			if (primeFlag == true)
			{
				primeNumber++;	
			}
			
			primeFlag = true;
		}	
		
		System.out.print(primeNumber);
	}
}

package HOW2J.���̿���;

public class GoldenMean
{
	
	public static void main(String args[])
	{
		int numerator = 1;
		int denominator = 2;
		
		int goldNumerator = 1;
		int goldDenominator = 2;
		
		double dist = Math.abs(0.618 - (double)numerator/denominator);
		double minDist = dist;
		
		for (;numerator < 20;numerator++)
		{
			for (denominator = 2;denominator < 20;denominator++)
			{
				if ((0 == numerator%2)&&(0 == denominator%2))
				{
					continue;
				}
				
				dist = Math.abs(0.618 - (double)numerator/denominator);
				if ( dist < minDist)
				{
					minDist = dist;
					goldNumerator = numerator;
					goldDenominator = denominator;
				}
			}
		}
		
		System.out.println("��ƽ�ָ�㣨0.618������������������:"+goldNumerator+"/"+goldDenominator+"="+((double)goldNumerator/goldDenominator));
	}

	

}

package Êı×ÖÓë×Ö·û´®;

public class CapitalsAndLowercase
{
	public static void main(String[] args)
	{
		String str = " lengendary";
		char cs[] = str.toCharArray();
		
		for (int i = 0 ; i < cs.length; i++)
		{
			if (i%2 == 0)
			{
				cs[i] = Character.toLowerCase(cs[i]);
			}
			else
			{
				cs[i] = Character.toUpperCase(cs[i]);
			}
		}
		
		System.out.println(cs);
	}
}

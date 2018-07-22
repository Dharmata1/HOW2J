package HOW2J.Á÷³Ì¿ØÖÆ;

public class ArithmeticBlock
{
	public static void main(String args[])
	{
		for (int a = -100;a <= 100;a++)
		{
			for (int b = -100;b <= 100;b++)
			{
				for (int c = -100;c <= 100;c++)
				{
					for (int d = -100;d <= 100;d++)
					{
						if ((8 == a+b)&&(6 == c-d)&&(14 == a+c)&&(10 == b+d))
						{
							System.out.printf("a,b,c,d:%d,%d,%d,%d\n",a,b,c,d);
						}
					}
				}
			}
		}
	}

}

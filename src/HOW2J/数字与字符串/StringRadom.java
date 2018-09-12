package HOW2J.Êý×ÖÓë×Ö·û´®;

public class StringRadom 
{
	public static void main(String args[])
	{
		char[] cs = new char[5];
		//number:48-57 lowAlphet:97-122 upAlphet:65-90
		for (int i = 0; i <= 4; i++)
		{
			while(true)
			{
				char c = (char)(Math.random()*75+48);
				
				if ((48 <= (short)c) && ((short)c <= 57)
					||(97 <= (short)c) && ((short)c <= 122)
					||(65 <= (short)c) && ((short)c <= 90))
				//if (((short)c == 48)||((short)c == 122))
				{
					cs[i] = c;
					break;
				}
			}
			
		}
		
		String str = new String(cs);
		
		System.out.print(str);
	}

}

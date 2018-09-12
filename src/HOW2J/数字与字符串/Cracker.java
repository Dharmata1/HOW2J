package HOW2J.Êı×ÖÓë×Ö·û´®;

public class Cracker 
{
	public static void main(String[] args)
	{
	    String str = randomString(3);
	    System.out.println("ÃÜÂë:"+str);
	    boolean findFlag = false;
	    
	    for (short i = '0'; (i <= 'z')&&(findFlag == false); i++)
	    {
	    	for (short j = '0'; (j <= 'z')&&(findFlag == false); j++)
	    	{
	    		for (short k = '0'; (k <= 'z')&&(findFlag == false); k++)
	    		{
	    			if ((str.charAt(0) == i)
	    				&&(str.charAt(1) == j)
	    				&&(str.charAt(2) == k))
	    			{
	    				char cs[]={(char)i,(char)j,(char)k};
	    				
	    				findFlag = true;
	    	    	    System.out.println("ÆÆ½âÃÜÂë:"+new String(cs));
	    	    	    
	    			}	    				
	    		}
	    	}	    	
	    }
 
	}
	
	static String randomString(int length)
	{
		String pool = "";
		
		for (short i = '0'; i <= '9'; i++)
		{
			pool += (char)i;
		}
		
		for (short i = 'a'; i <= 'z'; i++)
		{
			pool += (char)i;
		}
		
		for (short i = 'A'; i <= 'Z'; i++)
		{
			pool += (char)i;
		}
		
		char cs[] = new char[length];	
		
		for (int i = 0; i < length; i++)
		{
			cs[i] = (char)(pool.charAt((int)(Math.random()*(pool.length()))));
		}
		
		return new String(cs);
	}
}

package HOW2J.“Ï≥£¥¶¿Ì;

public class CustomException 
{
	public static void main(String args[])
	{
		try
		{
			if (true)
			{
				throw  new IndexIsOutofRangeException();	
			}    	

		    if (true)
		    {
		    	throw  new IndexIsNagetiveException();
		    }	
		}
		catch(IndexIsNagetiveException e)
		{
			e.printStackTrace();
		}
		catch(IndexIsOutofRangeException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}

	}
}

class IndexIsNagetiveException extends Exception
{
	
}

class IndexIsOutofRangeException  extends Exception
{
	
}


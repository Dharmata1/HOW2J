package HOW2J.Êý×ÖÓë×Ö·û´®;

public class StringParse 
{
	
	public static void main(String args[])
	{
		Double d = 3.14;

		String s = d.toString();
		String s1 = String.valueOf(d);
		
		System.out.println(s);
		System.out.println(s1);
		
		float f = Float.parseFloat(s1);
		
		System.out.println(f);
	}

}


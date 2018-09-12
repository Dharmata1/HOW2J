package HOW2J.Êý×ÖÓë×Ö·û´®;

public class LastTwoUpperCase 
{
	public static void main(String args[])
	{
		String str = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
		
		int index = str.lastIndexOf(" two ");
		
		char cs[] = str.toCharArray();
		
		cs[index+1] = Character.toUpperCase(cs[index+1]);
		
		System.out.print(new String(cs));
	}	

}

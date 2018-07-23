package HOW2J.สýื้;

public class ArrayConcat 
{
	public static void main(String args[])
	{
		int a[] = new int[(int)(Math.random()*5)+5];
		int b[] = new int[(int)(Math.random()*5)+5];
		
		System.out.println("a:");
		for (int i = 0; i < a.length;i++)
		{
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		
		System.out.println("b:");
		for (int i = 0; i < b.length;i++)
		{
			b[i] = (int)(Math.random()*100);
			System.out.println(b[i]);			
		}
		
		int c[] = new int[a.length+b.length];
		
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		
		System.out.println("c:");
		for (int each:c)
		{
			System.out.println(each);			
		}
	}

}


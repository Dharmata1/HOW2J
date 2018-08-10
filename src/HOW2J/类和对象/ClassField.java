package HOW2J.类和对象;

public class ClassField 
{
	static String copyright = "Blizzard Entertainment Enterprise";

	public static void main(String args[])
	{
		ClassField a = new ClassField();
		
		a.copyright = "Test static field";
		
		System.out.println(a.copyright);
		System.out.println(ClassField.copyright);
		
		ClassField b = new ClassField();
		System.out.println(b.copyright);
	}
}

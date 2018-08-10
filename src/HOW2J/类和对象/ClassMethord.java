package HOW2J.类和对象;

public class ClassMethord 
{
	static void StaticMethord()
	{
		System.out.println("Static methords");
	}
	
	void NormalMethord()
	{
		System.out.println("Normal methords");
	}
	
	public static void main(String args[])
	{
		new ClassMethord().StaticMethord();
		ClassMethord.StaticMethord();
		//ClassMethord.NormalMethord();
		new ClassMethord().NormalMethord();
	}

}

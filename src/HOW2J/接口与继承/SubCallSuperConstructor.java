package HOW2J.½Ó¿ÚÓë¼Ì³Ð;

public class SubCallSuperConstructor 
{
	String name;
	
	SubCallSuperConstructor(String name)
	{
        this.name = name;		
	}
}

class SubTest extends SubCallSuperConstructor 
{
	SubTest()
	{
		super("");
	}
}
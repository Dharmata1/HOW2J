package HOW2J.�ӿ���̳�;

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
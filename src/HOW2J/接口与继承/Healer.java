package HOW2J.�ӿ���̳�;

public interface Healer 
{
	public void heal();
}

class Hero
{	
}

class Support extends Hero implements Healer
{
	public void heal()
	{
		System.out.println("heal of Support");
	}
}

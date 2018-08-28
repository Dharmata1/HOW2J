package HOW2J.½Ó¿ÚÓë¼Ì³Ð;

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

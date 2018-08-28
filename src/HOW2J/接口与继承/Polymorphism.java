package HOW2J.½Ó¿ÚÓë¼Ì³Ð;

public class Polymorphism
{
	public static void main(String args[])
	{
		Hero1 garen = new Hero1();
		Mortal adHero = new ADHero();
		Mortal apHero = new APHero();
		Mortal adaHero = new ADAHero();
		garen.kill(adHero);
		garen.kill(apHero);
		garen.kill(adaHero);
	}
}

interface Mortal
{
    public void die();	
}

class Hero1
{
	public void kill(Mortal m)
	{
		m.die();
	}
}

class ADHero extends Hero1 implements Mortal
{
    public void die()
    {
	    System.out.println("ADHero die.");	
    }
}

class APHero extends Hero1 implements Mortal
{
    public void die()
    {
	    System.out.println("APHero die.");	
    }
}

class ADAHero extends Hero1 implements Mortal
{
    public void die()
    {
	    System.out.println("ADAHero die.");	
    }
}
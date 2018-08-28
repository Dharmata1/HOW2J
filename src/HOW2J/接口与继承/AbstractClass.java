package HOW2J.½Ó¿ÚÓë¼Ì³Ð;

public abstract class AbstractClass 
{
	public abstract boolean disposable();
	
	public static void main(String[] args)
	{
		System.out.println(new LifePotion().disposable());
	}
}

class LifePotion extends AbstractClass
{
	public boolean disposable()
	{
		System.out.println("LifePotion");
		
		return true;
	}

}

class Weapon extends AbstractClass
{
	public boolean disposable()
	{
		System.out.println("Weapon");
		
		return false;
	}
	

}

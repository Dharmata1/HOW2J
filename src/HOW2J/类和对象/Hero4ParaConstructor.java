package HOW2J.类和对象;

public class Hero4ParaConstructor 
{
	Hero4ParaConstructor(String heroName,float heroHP, float heroArmor, int heroMoveSpeed)
	{
		System.out.println("heroName:"+heroName);
		System.out.println("heroHP:"+heroHP);
		System.out.println("heroArmor:"+heroArmor);
		System.out.println("heroMoveSpeed:"+heroMoveSpeed);		
	}
	
	public static void main(String args[])
	{
		new Hero4ParaConstructor("冬瓜", 101, 101, 200);
	}
}

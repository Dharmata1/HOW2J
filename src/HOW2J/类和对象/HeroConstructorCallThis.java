package HOW2J.类和对象;
public class HeroConstructorCallThis 
{
	String name;
	float  hp;
	float  armor;
	int    moveSpeed;
	
	public HeroConstructorCallThis(String name)
	{
		System.out.println("一个参数的构造函数");
		this.name = name;
	}
	
	public HeroConstructorCallThis(String name, float hp)
	{
		this(name);
		System.out.println("二个参数的构造函数");
		this.hp = hp;
	}
	
	public HeroConstructorCallThis(String name, float hp, float armor)
	{
		this(name, hp);
		System.out.println("三个参数的构造函数");
		this.armor = armor;
	}
	
	public HeroConstructorCallThis(String name, float hp, float armor, int moveSpeed)
	{
		this(name, hp, armor);
		System.out.println("四个参数的构造函数");
		this.moveSpeed = moveSpeed;
	}

	public static void main(String args[])
	{
		new HeroConstructorCallThis("冬瓜", 101, 101, 200);
		new HeroConstructorCallThis("马昊", 100);
	}
}

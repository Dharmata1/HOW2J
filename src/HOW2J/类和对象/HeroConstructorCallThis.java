package HOW2J.��Ͷ���;
public class HeroConstructorCallThis 
{
	String name;
	float  hp;
	float  armor;
	int    moveSpeed;
	
	public HeroConstructorCallThis(String name)
	{
		System.out.println("һ�������Ĺ��캯��");
		this.name = name;
	}
	
	public HeroConstructorCallThis(String name, float hp)
	{
		this(name);
		System.out.println("���������Ĺ��캯��");
		this.hp = hp;
	}
	
	public HeroConstructorCallThis(String name, float hp, float armor)
	{
		this(name, hp);
		System.out.println("���������Ĺ��캯��");
		this.armor = armor;
	}
	
	public HeroConstructorCallThis(String name, float hp, float armor, int moveSpeed)
	{
		this(name, hp, armor);
		System.out.println("�ĸ������Ĺ��캯��");
		this.moveSpeed = moveSpeed;
	}

	public static void main(String args[])
	{
		new HeroConstructorCallThis("����", 101, 101, 200);
		new HeroConstructorCallThis("���", 100);
	}
}

package HOW2J.���Ͽ��;
import java.util.ArrayList;

public  class FindObjectInArrayList 
{
	public static void main(String args[])
	{
		ArrayList test = new ArrayList();
		
		test.add(new Hero("hero1"));
		test.add(new Hero("hero2"));

		String objStr =  test.toString();
		
		for (int i = 0; i < test.size(); i++)
		{
			Hero aim = (Hero)test.get(i);
			
			if (aim.name.equals("hero1"))
			{
				System.out.println("�ҵ���name��hero1�Ķ���");
				break;
			}
		}

	}
}

class Hero
{
	String name;
	
	Hero()
	{
		
	}
	
	Hero(String name)
	{
		this.name = name;
	}
}

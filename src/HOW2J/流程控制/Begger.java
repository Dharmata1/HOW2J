package HOW2J.流程控制;

public class Begger
{
	public static void main(String args[])
	{
		int workDays = 10;
		long inCome = 1;
		
		for (int i = 1;i <= 10;i++)
		{
			inCome *= 2;
		}
		
		System.out.println("洪乞丐干"+workDays+"天，收入："+inCome+"元");
		
	}

}

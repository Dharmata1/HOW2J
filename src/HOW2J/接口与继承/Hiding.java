package HOW2J.½Ó¿ÚÓë¼Ì³Ð;

public class Hiding 
{
	public static void battleWin()
	{
		System.out.println("Father battleWin!");
	}

}

class HidingSon extends Hiding 
{
	public static void battleWin()
	{
		System.out.println("Son battleWin!");
	}

	public static void main(String args[])
	{
		Hiding h = new HidingSon();
		h.battleWin();
	}
}
package HOW2J.类和对象;

public class ArmorExtendItem extends Item
{
	int ac;
	
	public static void main(String args[])
	{
		ArmorExtendItem clothArmor = new ArmorExtendItem();
		ArmorExtendItem hauberkArmor = new ArmorExtendItem();
		
		clothArmor.name = "布甲";
		clothArmor.price = 300;
		clothArmor.ac    = 15;
		
		hauberkArmor.name = "锁子甲";
		hauberkArmor.price = 500;
		hauberkArmor.ac    = 40;		
	}
}

class Item
{
	String name;
    int price;
}
package HOW2J.��Ͷ���;

public class ArmorExtendItem extends Item
{
	int ac;
	
	public static void main(String args[])
	{
		ArmorExtendItem clothArmor = new ArmorExtendItem();
		ArmorExtendItem hauberkArmor = new ArmorExtendItem();
		
		clothArmor.name = "����";
		clothArmor.price = 300;
		clothArmor.ac    = 15;
		
		hauberkArmor.name = "���Ӽ�";
		hauberkArmor.price = 500;
		hauberkArmor.ac    = 40;		
	}
}

class Item
{
	String name;
    int price;
}
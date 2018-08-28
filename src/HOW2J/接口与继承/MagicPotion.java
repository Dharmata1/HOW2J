package HOW2J.接口与继承;

public class MagicPotion extends Item
{
    public void effect() 
    {
        System.out.println("蓝瓶使用后，可以回魔法");
    }
    
    public static void main(String args[])
    {
    	new MagicPotion().effect();	
    }    
}

class Item {
    String name;
    int price;
 
    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }
 
}
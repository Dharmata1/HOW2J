package HOW2J.类和对象;

public class HungerSingleton 
{
	private HungerSingleton()
    {
    	System.out.println("Init HungerSingleton");    	
    }
    
    private static HungerSingleton hungerSingleton = new HungerSingleton();    
    
    public static HungerSingleton getIntanceOfHungerSingleton()
    {
    	return hungerSingleton;
    }
}

class TestHungerSingleton 
{
    public static void main(String args[])
    {
    	HungerSingleton h1 = HungerSingleton.getIntanceOfHungerSingleton();
    	HungerSingleton h2 = HungerSingleton.getIntanceOfHungerSingleton();
    	HungerSingleton h3 = HungerSingleton.getIntanceOfHungerSingleton();
    	
        //都是同一个对象
        System.out.println(h1 == h2);
        System.out.println(h1 == h3);
    }
}
package HOW2J.¼¯ºÏ¿ò¼Ü;
import java.util.ArrayList;
import java.util.List;

public class AlistOfTwoType 
{
    public static void main(String args[])
    {
    	List<Base> test = new ArrayList<Base>();
    	test.add(new Hero1());
    	test.add(new Item());
    	System.out.println(test);
    }
    
}


interface Base
{
	 
}

class Hero1 implements Base
{
	
}

class Item implements Base
{
	
}

package HOW2J.��Ͷ���;

public class LazybonesSingleton 
{
	private LazybonesSingleton()
    {
    	System.out.println("Init LazybonesSingleton");    	
    }
    
    private static LazybonesSingleton lazybonesSingleton = null;    
    
    public static LazybonesSingleton getIntanceOfLazybonesSingleton()
    {
    	if (null == lazybonesSingleton)
    	{
    		lazybonesSingleton = new LazybonesSingleton();
    	}
    	
    	return lazybonesSingleton;
    }
}

class TestLazybonesSingleton 
{
    public static void main(String args[])
    {
    	LazybonesSingleton L1 = LazybonesSingleton.getIntanceOfLazybonesSingleton();
    	LazybonesSingleton L2 = LazybonesSingleton.getIntanceOfLazybonesSingleton();
    	LazybonesSingleton L3 = LazybonesSingleton.getIntanceOfLazybonesSingleton();
    	
        //����ͬһ������
        System.out.println(L1 == L2);
        System.out.println(L1 == L3);
    }
}

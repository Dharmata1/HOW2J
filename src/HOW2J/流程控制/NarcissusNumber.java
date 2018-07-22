package HOW2J.流程控制;

public class NarcissusNumber
{
	public static void main(String args[])
	{
		int gewei;
		int shiwei;
		int baiwei;
		
		for (int i = 100;i < 1000;i++)
		{
		    gewei  = i%10;
		    shiwei = (i/10)%10;
		    baiwei = (i/100);
		    
		    if ((Math.pow(gewei, 3)+Math.pow(shiwei, 3)+Math.pow(baiwei, 3)) == i)
		    {
		    	System.out.println(i+"是水仙花数");
		    }
		}		
	}
}

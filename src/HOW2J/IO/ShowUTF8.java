package HOW2J.IO;
import java.io.UnsupportedEncodingException;

public class ShowUTF8 
{
	public static void main(String[] args) throws UnsupportedEncodingException
	{
		byte[] all = new byte[3];
		all[0] = (byte)0xE5;
		all[1] = (byte)0xB1;
		all[2] = (byte)0x8C;

	    System.out.println("UTF-8格式下的字符是：");
	    String str = new String(all, "UTF-8");
	    System.out.println(str);  
	    
	    byte[] test =  str.getBytes("UTF-8");
	    
	    for (byte t:test)
	    {
	    	System.out.println(t);
	    	System.out.println(Integer.toHexString(t&0x000000ff)); 
	    }
    }
}


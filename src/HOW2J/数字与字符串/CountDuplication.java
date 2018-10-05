package HOW2J.数字与字符串;

public class CountDuplication 
{
	public static void main(String args[])
	{
		String str[] = new String[100];
		
		for (int i = 0 ; i < str.length; i++)
		{
			str[i] = randomString(2);
			System.out.print(str[i]+" ");
			
			if ((i+1)%20 == 0)
			{
				System.out.println();
			}
		}
		
		//从前往后两层循环遍历每个字符串，先判断字符串是否属于重复列表，是的话换下个字符串，如果找到重复的，放入重复列表
		String[] foundDuplicated = new String[100];
		int pos = 0;
		boolean duplicatedFlag = false;
		
		for (int i = 0; i < str.length; i++)
		{
			for (int k = 0;k < pos ;k++)
			{
				if (foundDuplicated[k].equalsIgnoreCase(str[i]))
				{   
					duplicatedFlag = true;
					break;
				}
			}
			
			if (duplicatedFlag == true)
			{
				duplicatedFlag = false;
				continue;
			}
			
			for (int j = i+1;j < str.length;j++)
			{
				if (str[i].equalsIgnoreCase(str[j]))
				{
					foundDuplicated[pos++] = str[i];
					break;
				}
			}
		}
		
		
		System.out.println("共有"+pos+"种重复的字符串，分别是：");
		for (int i = 0 ; i < pos; i++)
		{
			System.out.print(foundDuplicated[i]+" ");
			
			if ((i+1)%20 == 0)
			{
				System.out.println();
			}
		}
		
	}
	
    public static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}

package HOW2J.�������ַ���;

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
		
		//��ǰ��������ѭ������ÿ���ַ��������ж��ַ����Ƿ������ظ��б��ǵĻ����¸��ַ���������ҵ��ظ��ģ������ظ��б�
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
		
		
		System.out.println("����"+pos+"���ظ����ַ������ֱ��ǣ�");
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

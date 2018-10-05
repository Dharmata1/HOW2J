package HOW2J.�������ַ���;

interface IStringBuffer {
    public void append(String str); //׷���ַ���
    public void append(char c);  //׷���ַ�
    public void insert(int pos,char b); //ָ��λ�ò����ַ�
    public void insert(int pos,String b); //ָ��λ�ò����ַ���
    public void delete(int start); //�ӿ�ʼλ��ɾ��ʣ�µ�
    public void delete(int start,int end); //�ӿ�ʼλ��ɾ������λ��-1
    public void reverse(); //��ת
    public int length(); //���س���
}

public class MyStringBuffer implements IStringBuffer
{
    private int capacity = 16;
    private int length = 0;
    private char[] value;
    
    public MyStringBuffer(){
        value = new char[capacity];
    }
     
    //�вι��췽��
    public MyStringBuffer(String str){
        if(null!=str)
            value =str.toCharArray();
         
        length = value.length;
         
        if(capacity<value.length)
            capacity  = value.length*2;
    }
    
    public void append(String str) //׷���ַ���
    {
    	//��ָ���ж�
    	if (str == null)
    	{
    		System.out.println("MyStringBuffer��append���������ָ��");
    		return;
    	}
    	
    	//��capacity��Χ��
    	if (str.length() + length <= capacity )
    	{
    		System.arraycopy(str.toCharArray(), 0, value, length, str.length());
        	length += str.length();

    		return;
    	}
    	
    	//������ΧҪ���������ַ�����
    	capacity = (str.length()+length)*2;
    	char[] newValue = new char[capacity];
    	System.arraycopy(value, 0,newValue, 0, length);
    	System.arraycopy(str.toCharArray(), 0, newValue, length, str.length());
    	value = newValue; 
    	length += str.length();
    	
    	//System.out.print(value);
    	
    }
    
    public void append(char c) //׷���ַ�
    {
    	append(Character.toString(c));
    }
    
    public void insert(int pos,char b)//ָ��λ�ò����ַ�
    {
    	insert(pos,Character.toString(b));
    } 
    
    public void insert(int pos,String b) //ָ��λ�ò����ַ���
    {
    	//�ж�String b�Ƿ�Ϊ��
    	if (b == null)
    	{
    		System.out.println("MyStringBuffer��insert���������ָ�롣");
    		return;
    	}
    	
    	//�ж�pos������
    	if ((pos < 0)||(pos > length))
    	{
    		System.out.println("MyStringBuffer��insert�����Ƿ�posֵ:"+pos);
    		return;
    	}
    	
    	//�������capacity����Ҫ����
    	if (b.length()+length > capacity)
    	{
    		capacity = (b.length() + length)*2;
    		char[] newValue = new char[capacity];
        	System.arraycopy(value, 0, newValue, 0, length);
        	value = newValue;
    	}
    	
    	System.arraycopy(value, pos, value, pos+b.length(), length-pos);
    	System.arraycopy(b.toCharArray(), 0, value, pos, b.length());
    	
    	length += b.length();
    }
    
    public void delete(int start) //�ӿ�ʼλ��ɾ��ʣ�µ�
    {
    	delete(start,length);
    	
    }
    
    public void delete(int start,int end) //�ӿ�ʼλ��ɾ������λ��-1
    {
    	if ((start >= length)||(start < 0))
    	{
    		System.out.println("MyStringBuffer��delete�����Ƿ�startֵ:"+start);
    		return;
    	}
    		
    	if ((end >= length)||(end < 0)||(end <= start))
    	{
    		System.out.println("MyStringBuffer��delete�����Ƿ�endֵ:"+end);
    		return;
    	}    		
    	
    	System.arraycopy(value, end, value, start, length-end);
    	length -= (end-start);
    	
    	return;
    }
    
    public void reverse()//��ת
    {
    	char temp;
    	
    	for (int i = 0; i < (length/2); i++)
    	{
    		temp = value[i];
    		value[i] = value[length-1-i];
    		value[length-1-i] = temp;
    	}
    	
    }
    
    public int length()//���س���
    {
    	return length;
    }
    
    public static void main(String args[])
    {
    	
    	//MyStringBuffer test = new MyStringBuffer();
    	
    	//test.append("abcde");
    	
    	//test.append("fghijklmnopqrstuvwxyz");
    	
        int total = 5000000;
        String s = randomString(10);
        MyStringBuffer msb = new MyStringBuffer();
        StringBuffer sb = new StringBuffer();
          
        long start = System.currentTimeMillis();
        for (int i = 0; i <total; i++) {
            sb.append(s); //ʹ�� StringBuffer
        }
        long end = System.currentTimeMillis();
        System.out.printf("ʹ��StringBuffer�ķ�ʽ������%d�Σ���ʱ%d����%n",total,end-start);
        start = System.currentTimeMillis();
        for (int i = 0; i <total; i++) {
            msb.append(s); //ʹ��MyStringBuffer
        }
        end = System.currentTimeMillis();
        System.out.printf("ʹ��MyStringBuffer�ķ�ʽ������%d�Σ���ʱ%d����%n",total,end-start);
    }
    
    
    private static String randomString(int length) {
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

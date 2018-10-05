package HOW2J.数字与字符串;

interface IStringBuffer {
    public void append(String str); //追加字符串
    public void append(char c);  //追加字符
    public void insert(int pos,char b); //指定位置插入字符
    public void insert(int pos,String b); //指定位置插入字符串
    public void delete(int start); //从开始位置删除剩下的
    public void delete(int start,int end); //从开始位置删除结束位置-1
    public void reverse(); //反转
    public int length(); //返回长度
}

public class MyStringBuffer implements IStringBuffer
{
    private int capacity = 16;
    private int length = 0;
    private char[] value;
    
    public MyStringBuffer(){
        value = new char[capacity];
    }
     
    //有参构造方法
    public MyStringBuffer(String str){
        if(null!=str)
            value =str.toCharArray();
         
        length = value.length;
         
        if(capacity<value.length)
            capacity  = value.length*2;
    }
    
    public void append(String str) //追加字符串
    {
    	//空指针判断
    	if (str == null)
    	{
    		System.out.println("MyStringBuffer的append方法输入空指针");
    		return;
    	}
    	
    	//在capacity范围内
    	if (str.length() + length <= capacity )
    	{
    		System.arraycopy(str.toCharArray(), 0, value, length, str.length());
        	length += str.length();

    		return;
    	}
    	
    	//超出范围要重新生成字符数组
    	capacity = (str.length()+length)*2;
    	char[] newValue = new char[capacity];
    	System.arraycopy(value, 0,newValue, 0, length);
    	System.arraycopy(str.toCharArray(), 0, newValue, length, str.length());
    	value = newValue; 
    	length += str.length();
    	
    	//System.out.print(value);
    	
    }
    
    public void append(char c) //追加字符
    {
    	append(Character.toString(c));
    }
    
    public void insert(int pos,char b)//指定位置插入字符
    {
    	insert(pos,Character.toString(b));
    } 
    
    public void insert(int pos,String b) //指定位置插入字符串
    {
    	//判断String b是否为空
    	if (b == null)
    	{
    		System.out.println("MyStringBuffer的insert方法输入空指针。");
    		return;
    	}
    	
    	//判断pos合理性
    	if ((pos < 0)||(pos > length))
    	{
    		System.out.println("MyStringBuffer的insert方法非法pos值:"+pos);
    		return;
    	}
    	
    	//如果超过capacity，需要修正
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
    
    public void delete(int start) //从开始位置删除剩下的
    {
    	delete(start,length);
    	
    }
    
    public void delete(int start,int end) //从开始位置删除结束位置-1
    {
    	if ((start >= length)||(start < 0))
    	{
    		System.out.println("MyStringBuffer的delete方法非法start值:"+start);
    		return;
    	}
    		
    	if ((end >= length)||(end < 0)||(end <= start))
    	{
    		System.out.println("MyStringBuffer的delete方法非法end值:"+end);
    		return;
    	}    		
    	
    	System.arraycopy(value, end, value, start, length-end);
    	length -= (end-start);
    	
    	return;
    }
    
    public void reverse()//反转
    {
    	char temp;
    	
    	for (int i = 0; i < (length/2); i++)
    	{
    		temp = value[i];
    		value[i] = value[length-1-i];
    		value[length-1-i] = temp;
    	}
    	
    }
    
    public int length()//返回长度
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
            sb.append(s); //使用 StringBuffer
        }
        long end = System.currentTimeMillis();
        System.out.printf("使用StringBuffer的方式，连接%d次，耗时%d毫秒%n",total,end-start);
        start = System.currentTimeMillis();
        for (int i = 0; i <total; i++) {
            msb.append(s); //使用MyStringBuffer
        }
        end = System.currentTimeMillis();
        System.out.printf("使用MyStringBuffer的方式，连接%d次，耗时%d毫秒%n",total,end-start);
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

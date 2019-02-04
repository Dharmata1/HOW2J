package HOW2J.集合框架;
import java.util.ArrayList;

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

public class MyStringBufferAlist implements IStringBuffer
{
    //private int capacity = 16;
    //private int length = 0;
    private ArrayList value;
    
    public MyStringBufferAlist(){
        value = new ArrayList();
    }
     
    //有参构造方法
    public MyStringBufferAlist(String str){
        if(null!=str)
        {
        	char[] cs = str.toCharArray();
        	for (int i = 0; i < cs.length; i++)
        	{
                value.add(cs[i]);
        	}
        }
         
        //length = value.size();
        //capacity  = length*2;
    }
    
    public void append(String str) //追加字符串
    {
    	//空指针判断
    	if (str == null)
    	{
    		System.out.println("MyStringBuffer的append方法输入空指针");
    		return;
    	}
    	
    	char[] cs = str.toCharArray();
    	for (int i = 0; i < cs.length; i++)
    	{
            value.add(cs[i]);
    	}
    	
    	/*//在capacity范围内
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
    	
    	//System.out.print(value);*/
    	
    }
    
    public void append(char c) //追加字符
    {
    	//append(Character.toString(c));
    	value.add(c);
    }
    
    public void insert(int pos,char b)//指定位置插入字符
    {
    	//insert(pos,Character.toString(b));
    	value.add(pos,b);
    } 
    
    public void insert(int pos,String b) //指定位置插入字符串
    {
    	//判断String b是否为空
    	if (b == null)
    	{
    		System.out.println("MyStringBufferAlist的insert方法输入空指针。");
    		return;
    	}
    	
    	//判断pos合理性
    	if ((pos < 0)||(pos > value.size()))
    	{
    		System.out.println("MyStringBufferAlist的insert方法非法pos值:"+pos);
    		return;
    	}
    	
    	/*//如果超过capacity，需要修正
    	if (b.length()+length > capacity)
    	{
    		capacity = (b.length() + length)*2;
    		char[] newValue = new char[capacity];
        	System.arraycopy(value, 0, newValue, 0, length);
        	value = newValue;
    	}
    	
    	System.arraycopy(value, pos, value, pos+b.length(), length-pos);
    	System.arraycopy(b.toCharArray(), 0, value, pos, b.length());
    	
    	length += b.length();*/
    	char[] cs = b.toCharArray();
    	for (int i = 0; i < cs.length; i++)
    	{
            value.add(pos+i,cs[i]);
    	}
    	
    }
    
    public void delete(int start) //从开始位置删除剩下的
    {
    	delete(start,value.size());    	
    }
    
    public void delete(int start,int end) //从开始位置删除结束位置-1
    {
    	if ((start >= value.size())||(start < 0))
    	{
    		System.out.println("MyStringBufferAlist的delete方法非法start值:"+start);
    		return;
    	}
    		
    	if ((end >= value.size())||(end < 0)||(end <= start))
    	{
    		System.out.println("MyStringBufferAlist的delete方法非法end值:"+end);
    		return;
    	}    		
    	
    	//System.arraycopy(value, end, value, start, length-end);
    	//length -= (end-start);
    	
        for (int i = 0; i < end - start; i++) 
        {
            value.remove(start+i);
        }
    	
    	return;
    }
    
    public void reverse()//反转
    {
    	char temp;
    	
    	/*for (int i = 0; i < (length/2); i++)
    	{
    		temp = value[i];
    		value[i] = value[length-1-i];
    		value[length-1-i] = temp;
    	}*/
    	
        for (int i = 0; i < value.size() / 2; i++) 
        {
            int length = value.size();
            temp = (char)value.get(i);
 
            value.set(i, value.get(length - i - 1));
 
            value.set(length - i - 1, temp);
        }
    	
    }
    
    public int length()//返回长度
    {
    	return value.size();
    }
    
    public static void main(String args[])
    {
    	
    	//MyStringBuffer test = new MyStringBuffer();
    	
    	//test.append("abcde");
    	
    	//test.append("fghijklmnopqrstuvwxyz");
    	
        int total = 5000000;
        String s = randomString(10);
        MyStringBufferAlist msb = new MyStringBufferAlist();
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
        System.out.printf("使用MyStringBufferAlist的方式，连接%d次，耗时%d毫秒%n",total,end-start);
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

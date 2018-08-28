package 数字与字符串;

public class Autoboxing 
{
    byte b;
    short s;
    float f;
    double d;
    
    //自动装箱
    Byte bB = b;
    Short sS = s;
    Float fF = f;
    Double dD = d;
    Integer iI = 3;
    
    //非自动装箱
    Float fF1 = new Float(f);
    Double dD1 = new Double(d);
    
    //byte b1 = iI;
    //Integer iI1 = b;
    
    public static void main(String args[])
    {
        System.out.println(Byte.MAX_VALUE);
    }    
}


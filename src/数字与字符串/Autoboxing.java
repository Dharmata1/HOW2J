package �������ַ���;

public class Autoboxing 
{
    byte b;
    short s;
    float f;
    double d;
    
    //�Զ�װ��
    Byte bB = b;
    Short sS = s;
    Float fF = f;
    Double dD = d;
    Integer iI = 3;
    
    //���Զ�װ��
    Float fF1 = new Float(f);
    Double dD1 = new Double(d);
    
    //byte b1 = iI;
    //Integer iI1 = b;
    
    public static void main(String args[])
    {
        System.out.println(Byte.MAX_VALUE);
    }    
}


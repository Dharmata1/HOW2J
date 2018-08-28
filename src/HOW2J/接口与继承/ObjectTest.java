package HOW2J.�ӿ���̳�;

//��ӦItem�����ϰ��������Item��ΪObjectTest
public class ObjectTest extends Object
{
    public String name;
    public float price;
      
    public String toString(){
        return name+String.valueOf(price);
    }
    
    public void finalize(){
        System.out.println("ObjectTest���ڱ�����");
    }
    
    public boolean equals(Object o){
        if(o instanceof ObjectTest){
        	ObjectTest oIn = (ObjectTest)o;
        	return this.price == oIn.price;
        }
        return false;
    }
    
    public static void main(String args[])
    {
    	ObjectTest o1 = new ObjectTest();
    	o1.name = "o1";
    	o1.price = 100;
    	ObjectTest o2 = new ObjectTest();
    	o2.name = "o2";
    	o2.price = 100;
    	
    	System.out.println(o1.toString());
    	System.out.println(o2.toString());
    	System.out.println(o1.equals(o2));
    	o1.finalize();
    	o2.finalize();    	
    }
}


package HOW2J.�ӿ���̳�;

public class MagicPotion extends Item
{
    public void effect() 
    {
        System.out.println("��ƿʹ�ú󣬿��Ի�ħ��");
    }
    
    public static void main(String args[])
    {
    	new MagicPotion().effect();	
    }    
}

class Item {
    String name;
    int price;
 
    public void buy(){
        System.out.println("����");
    }
    public void effect() {
        System.out.println("��Ʒʹ�ú󣬿�����Ч��");
    }
 
}
package HOW2J.��Ͷ���;

public class ClassTypePara
{
    
    String name; //����
        
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
     
    public ClassTypePara(){
         
    }
     
    public ClassTypePara(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
 
    //����
    public void revive(ClassTypePara h){
        h = new ClassTypePara("��Ī",383);
    }
 
    public static void main(String[] args) {
    	ClassTypePara teemo =  new ClassTypePara("��Ī",383);
         
        //�ܵ�400�˺�������
        teemo.hp = teemo.hp - 400;
         
        teemo.revive(teemo);
         
        System.out.println(teemo.hp);// ������٣� ��ô��⣿
         
    }
      
}

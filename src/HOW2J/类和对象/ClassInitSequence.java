package HOW2J.��Ͷ���;

public class ClassInitSequence 
{
    {
        name = ClassInitSequence.getName("��ʼ����");
    }
	
	public String name =ClassInitSequence.getName("��������") ;
    
    public ClassInitSequence(){
        name = ClassInitSequence.getName("���췽��");
    }

     
    public static String getName(String pos){
        String result= "name "+pos;
        System.out.println(result);
        return result;
    }
     
    public static void main(String[] args) {
        new ClassInitSequence();
    }
}

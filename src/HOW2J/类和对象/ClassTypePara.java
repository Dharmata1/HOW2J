package HOW2J.类和对象;

public class ClassTypePara
{
    
    String name; //姓名
        
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
     
    public ClassTypePara(){
         
    }
     
    public ClassTypePara(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
 
    //复活
    public void revive(ClassTypePara h){
        h = new ClassTypePara("提莫",383);
    }
 
    public static void main(String[] args) {
    	ClassTypePara teemo =  new ClassTypePara("提莫",383);
         
        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;
         
        teemo.revive(teemo);
         
        System.out.println(teemo.hp);// 输出多少？ 怎么理解？
         
    }
      
}

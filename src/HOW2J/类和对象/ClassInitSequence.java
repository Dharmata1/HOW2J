package HOW2J.类和对象;

public class ClassInitSequence 
{
    {
        name = ClassInitSequence.getName("初始化块");
    }
	
	public String name =ClassInitSequence.getName("属性声明") ;
    
    public ClassInitSequence(){
        name = ClassInitSequence.getName("构造方法");
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

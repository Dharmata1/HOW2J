package j2se;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Hero {
	String name; //姓名
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	int money;
		
    public String name1 = "some hero"; 
     
    public Hero(int i){
        name1 = "one hero";
    }
    {
        name1 = "the hero";
    }
	
    //public Hero()
    //{
    	
    //}
    
    class AHero extends Hero
    {
    	public AHero()
    	{
    		super(1);
    	}
    }
    
	void legendary()
	{
		System.out.println("超神");
	}
	
	float getHp()
	{
		return hp;
	}
	
	void recovery(float blood)
	{
		hp += blood;
	}
	
	public static void removeComments(File javaFile)
	{
	
        try 
        {
        	FileReader fr = new FileReader(javaFile);
            BufferedReader br = new BufferedReader(fr);
            
            //FileWriter fw = new FileWriter(javaFile);
            //PrintWriter pw = new PrintWriter(fw);  
            
         
            while (true) {
                // 一次读一行
                String line1 = br.readLine();
                if (null == line1)
                {
                	break;
                }
                
                char[] tmpLine = line1.toCharArray();
                
                if ((tmpLine[0] == '/')&&(tmpLine[1] == '/'))
                {
                	continue;
                }
                
                //pw.println(line1);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    	
        try 
        {
	        FileReader fr1 = new FileReader(javaFile);
	        BufferedReader br1 = new BufferedReader(fr1);
	        
	        while (true) {
	            // 一次读一行
	            String line2 = br1.readLine();
	            if (null == line2)
	            {
	            	break;
	            }
	
	            System.out.println(line2);
	        }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
	}
	
	public static void main(String[] args)
	{
		Hero garen = new Hero(1);
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.money = 20000;
		
		Hero teemo = new Hero(2);
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		teemo.money = 50000;
			
		System.out.println(garen.name);
		System.out.println(garen.hp);
		System.out.println(garen.money);
		
		System.out.println(teemo.name);
		System.out.println(teemo.hp);
		System.out.println(teemo.money);
		System.out.println(garen.name1);
		System.out.println(teemo.name1);
		
        // 向文件lol2.txt中写入三行语句
        File f = new File("d:/lol2.txt");
          
        try{
            FileWriter fw = new FileWriter(f);
            // 缓存流必须建立在一个存在的流的基础上              
            PrintWriter pw = new PrintWriter(fw);   
        	
            pw.println("garen kill teemo");
            pw.println("//teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
            pw.flush();

            
            removeComments(f);
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
	}
}

package HOW2J.IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class ObjectStream 
{
	public static void main(String[] args)
	{
	    File f = new File("F:/eclipse/Workspace\\j2se\\src/HOW2J/Testfiles/heros.lol");	
		
	    try(    //创建对象输出流
	            FileOutputStream fos = new FileOutputStream(f);
	            ObjectOutputStream oos =new ObjectOutputStream(fos);
	            //创建对象输入流              
	            FileInputStream fis = new FileInputStream(f);
	            ObjectInputStream ois =new ObjectInputStream(fis);
	    	)
	    {
	    	Hero heros[] = new Hero[10];
	    	
	    	for (int i = 0; i < heros.length ; i++)
	    	{
	    		heros[i] = new Hero(i);  
	    	}
	    	
	    	oos.writeObject(heros);
	    	Hero heros2[] = (Hero[])ois.readObject();
	    	
	    	for (int i = 0; i < 10 ; i++)
	    	{
	    		System.out.println(heros2[i].hero);
	    	}
	    	
	    	
	    }
	    catch(IOException e) 
	    {
            // TODO Auto-generated catch block
            e.printStackTrace();
	    }
	    catch(ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	static class Hero implements Serializable
	{
		int hero = 0;
		
		Hero(int hero)
		{
			this.hero = hero;
		}
	}

	
}

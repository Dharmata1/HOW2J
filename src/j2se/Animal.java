package j2se;

public abstract class Animal 
{
    protected int legs;
    
    protected Animal(int legs)
    {
    	this.legs = legs;
    	System.out.println("Animal legs init");
    }
    
    public abstract void eat();
       	
    public void walk()
    {
    	System.out.println("Animal walks");
    	System.out.println("Animal legs counts:"+legs);    	
    }

}

interface Pet
{
	public String getName();
	public void setName(String name);
	public void play();
}

class Spider extends Animal
{
	Spider()
	{
	    super(8);
	    System.out.println("Spider legs counts:"+legs);
	}
	
	public void eat()
	{		
    	System.out.println("Spider eat");		
	}
	
	public static void main(String[] args)
	{
		new Spider().eat();
	}
	
}

class Cat extends Animal implements Pet
{
	String name;
	
    Cat(String name)
	{
	    super(4);
	    System.out.println("Cat legs counts:"+legs);
	    this.name = name;
	}
	
	Cat()
	{
		this("");
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void play()
	{
    	System.out.println("Cat play");			
	}
	
	public void eat()
	{		
    	System.out.println("Cat eat");	
	}
	
	public static void main(String[] args)
	{
		new Cat("cat").eat();
	}
	
}

class Fish extends Animal implements Pet
{
	private String name;
	
	Fish()
	{
		super(0);
		System.out.println("Fish init");	
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void play()
	{
    	System.out.println("Fish play");			
	}
	
	public void eat()
	{		
    	System.out.println("Fish eat");	
	}
	
    public void walk()
    {
    	System.out.println("Fish can't walks");
    	System.out.println("Fish has no legs"); 	
    }	
	public static void main(String[] args)
	{
		new Fish().walk();
	}//test git push
	
}



package HOW2J.接口与继承;


class ComprehensiveExercises 
{

}

abstract class Animal
{
    protected int legs;
    
    protected Animal(int legs)
    {
    	this.legs = legs;
    }
    
    abstract void eat();
    
    public void walk(){
        System.out.println("用 " + legs +  " 条腿走路");
    }
}

class Spider extends Animal
{
    Spider()
    {
    	super(8);
    }
    
    void eat()
    {
    	System.out.println("Spider eating");
    }
}

interface Pet
{
    public String getName();
    
    public void setName(String name);
    
    public void play();
}

class Cat extends Animal implements Pet
{
    String name;
    
    Cat(String name)
    {
    	super(4);
    	this.name = name;
    }
    
    Cat()
    {
    	this("");
    }
    
    void eat()
    {
    	System.out.println("Cat eating");
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
    	System.out.println("Cat is playing");
    }
}


class Fish extends Animal implements Pet
{
    private String name;
 
    Fish()
    {
    	super(0);
    }
    
    public void eat()
    {
    	System.out.println("Fish eating");
    }
    
    public String getName()
    {
    	return this.name;
    }
    
    public void setName(String name)
    {
    	this.name = name;
    }
    
    public void play()
    {
    	System.out.println("Fish is playing");
    }
    
    public void walk(){
        System.out.println("鱼不能走路");
    }    
}
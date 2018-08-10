package HOW2J.类和对象;

public class SupportHeal extends Hero1
{
   public void heal()
   {
	   System.out.println("SupportHeal heal");
   }
   
   public void heal(Hero1 h)
   {
	   System.out.println("SupportHeal Hero heal");
   }
   
   public void heal(Hero1 h,int hp)
   {
	   System.out.println("SupportHeal Hero heal:HP+");
   }
   
   public static void main(String args[])
   {
       Hero1 spt = new SupportHeal();
       SupportHeal spt1 = new SupportHeal();
       
       spt.heal();
       //(SupportHeal)spt.heal(new Hero1());
       //(SupportHeal)spt.heal(new Hero1(),11);
       
       spt1.heal();
       spt1.heal(new Hero1());
       spt1.heal(new Hero1(),11);   
       new Hero1();
    }
}

class Hero1
{
	Hero1()
	{
        System.out.println("Hero!");		
	}
	
	public void heal()
	{
		System.out.println("Hero heal");
	}
}

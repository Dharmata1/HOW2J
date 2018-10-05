package HOW2J.异常处理;

public class Comprehensive2 
{
    public static void main(String args[])
    {
    	CheckingAccount testAccount = new CheckingAccount(300,100);
    	
    	try
    	{
    		testAccount.withdraw(401);
    	}
    	catch(OverDraftException e)
    	{
    		System.err.println("超限透支金额："+e.getDeficit());
    		e.printStackTrace();
    	}
    }
}

class Account1
{
    protected double balance;
    
    Account1()
    {
    	
    }
    
    Account1(double init)
    {
    	balance = init;
    }
    
    public double getBalance()
    {
    	return balance;
    }
    
    public void deposit(double amt)
    {
    	balance += amt;
    }
    
    public void withdraw(double amt)throws OverDraftException
    {
    	if (0 > (balance - amt))
    	{
    		throw new OverDraftException("test",(balance-amt));
    	}
    	else
    	{
    		balance -= amt;	
    	}
    	
    }

}

class CheckingAccount extends Account1
{
	protected double overdraftProtection;
	
	CheckingAccount(double balance)
	{
		super(balance);
	}
	
	CheckingAccount(double balance,double overdraftProtection)
	{
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}
	
	public void withdraw(double amt)throws OverDraftException
	{
		if ( amt > (super.balance + overdraftProtection))
		{
			double deficit = amt - (super.balance + overdraftProtection);
            throw new OverDraftException("透支额度超标", deficit);
		}
		
		super.balance -= amt;
	}
}


package HOW2J.�쳣����;

public class Comprehensive 
{
    public static void main(String args[])
    {
    	Account testAccount = new Account(300);
    	
    	try
    	{
    		testAccount.withdraw(301);
    	}
    	catch(OverDraftException e)
    	{
    		System.err.println("͸֧��"+e.getDeficit());
    		e.printStackTrace();
    	}
    }
}

class OverDraftException extends Exception
{
	double deficit;
	
	public OverDraftException(String msg, double deficit)
    {		
		super(msg);
		this.deficit = deficit;
    }
	
	public double getDeficit()
	{
		return deficit;
	}
}

class Account
{
    private double balance;
    
    Account(double init)
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

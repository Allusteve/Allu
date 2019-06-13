package banking.domain;

public class CheckingAccount extends Account
{
	private double overdraftProtection=-1;

	public CheckingAccount(double balance)
	{
		this(balance,0);
	}

	public CheckingAccount (double balance,double protect)
	{
		super(balance);
		overdraftProtection = protect;
	}

	public double getOverdraftProtection()
	{
		return overdraftProtection;
	}

	public void withdraw(double amt) throws OverdraftException
	{
		if (getBalance()>= amt )
		{
			balance-= amt;
			
		}
		else if ((overdraftProtection>0) && (overdraftProtection>= amt - balance))
		{
			balance = 0;
			overdraftProtection -= amt -balance;
			
		}
		else
			 throw new OverdraftException("Óà¶î²»×ã", amt - balance);
	}
}
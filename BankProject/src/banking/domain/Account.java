package banking.domain;

public class Account {

	protected double balance;
	
	public Account(double init_balance){	
		this.balance = init_balance;
	}

	public double getBalance (){
		return balance;
	}

	public boolean deposit (double amt){
		balance +=amt;
		return true;
	}

	public void withdraw (double amt) throws OverdraftException{
		if (balance<amt)
		{
			throw new OverdraftException("Óà¶î²»×ã", (amt - balance)); 
		}
		this.balance-=amt;
	}

}





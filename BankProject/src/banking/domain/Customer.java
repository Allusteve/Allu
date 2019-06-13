package banking.domain;

import java.util.ArrayList;


public class Customer
 implements Comparable<Customer>
{
	private String firstName;
	private String lastName;
	private ArrayList<Account> accounts;
	private int NumOfAccounts;

	public Customer(String f,String l)
	{
		firstName=f;
		lastName=l;
		accounts= new ArrayList<Account>();
		NumOfAccounts =0;
	}
	
	@Override
	public int compareTo(Customer ob) {
		
		String st1,st2;
		st1=getLastName();
		st2=ob.getLastName();
		if(st1.charAt(0)>=st2.charAt(0))
			return 1;
		else
			return -1;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public ArrayList getAccounts()
	{
		return accounts;
	}

	public Account getAccount(int index)
	{
		if (index < accounts.size())
		{
			return (Account)accounts.get(index);
		}
		else
			return null;
	}

	public void addAccount(Account acct)
	{
		accounts.add(acct);
		NumOfAccounts++;
	}

	public int getNumOfAccounts()
	{
		return NumOfAccounts;
	}

}
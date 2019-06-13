package banking.domain;

public class Bank
{
	//singleton static attribute
	private static Bank bankInstance;

	private Customer[] customers;
	private int numOfCustomers;

	//singleton static method
	public static synchronized Bank getBank()
	{
		if (bankInstance == null)
		{
			bankInstance = new Bank();
		}
		return bankInstance;
	}

	//constructor
	private Bank(){
		customers = new Customer[10]; 
	}
	
	public void sortCustomers() {
		
		for(int i=0;i<numOfCustomers;i++) {
			for(int j=0;j<i;j++) {
				if(customers[j].compareTo(customers[j+1])==1) {
					Customer temp=customers[j];
					customers[j]=customers[j+1];
					customers[j+1]=temp;
				}
				
			}
				
	}
	}
	
	/*public Customer searchCustomers() {
	
	}*/
	
	public void addCustomer(String f,String l)
	{
		Customer c= new Customer(f,l);
		customers[numOfCustomers++]= c;
	}

	public int getNumOfCustomers()
	{
		return numOfCustomers;
	}

	public Customer getCustomer(int index)
	{
		if (index < numOfCustomers)
		{
		return customers[index];
		}
		else
		{
			return null;
		}
		
	}

}
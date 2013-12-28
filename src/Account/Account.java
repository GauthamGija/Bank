package Account;

public class Account 
{
	private int balance;
	private static int Counter = 1000;
	private int accountNumber;
	private String Name;
	private String gender;

	public int getBalance()
	{
		return this.balance;
	}

	public int getAccountNumber()
	{
		return this.accountNumber;
	}

	public String getName()
	{
		return this.Name;
	}

	public Account(int openingBalance, String customerName,String gen)
	{
		Counter++;
		balance = openingBalance;
		Name = customerName;
		gender=gen;
		accountNumber = Counter;
	}

	public int depositAmount(int amount)
	{
		if(amount > 0)
		{
			balance += amount;
		}
		return balance;
	}

	public int withdrawAmount(int amount)
	{
		if(amount > 0 && balance > 0)
		{
			balance -= amount;
		}
		return balance;
	}

}



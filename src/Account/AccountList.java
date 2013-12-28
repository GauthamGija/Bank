package Account;

public class AccountList 
{
	private static Account[] accountList;
	private static int arrayCount = 0;

	static
	{
		accountList = new Account[10];
	}

	public static void addAccountToList(Account account)
	{
		if(arrayCount < 10)
		{
			accountList[arrayCount] = account;
			arrayCount++;
		}
	}

	public static Account getAccountDetails(int accountNumber)
	{
		Account account = null;

		for(int i = 0 ; i < 10; i++)
		{
			if(accountList[i].getAccountNumber() == accountNumber)
			{
				account = accountList[i];
				break;
			}
			else
			{
				continue;
			}
		}

		return account;
		
	}
	
	
}

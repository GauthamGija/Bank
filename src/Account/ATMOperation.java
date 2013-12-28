package Account;

public class ATMOperation {

	private int accountNumber;
	private Account customerAccount;

	
	public ATMOperation(int accNum,String name){
		
		accountNumber = accNum;
		customerAccount = AccountList.getAccountDetails(this.accountNumber);
	}
	
	public int getbalance(){
		return customerAccount.getBalance();
	}
	public String getCustomerName()
	{
		return customerAccount.getName();
	}
	
	public int withdrawAmount(int amount){
		System.out.println("The withdraw amount is :"+amount);
		return customerAccount.withdrawAmount(amount);
	}

}


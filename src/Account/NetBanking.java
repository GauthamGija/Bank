package Account;

public class NetBanking {
	private int accountNumber;
	private Account customerAccount;
	
	public NetBanking(int accNum){
		this.accountNumber = accNum;
		customerAccount = AccountList.getAccountDetails(this.accountNumber);
	}
	
	public int getbalance(){
		return customerAccount.getBalance();
	}
	
	public int withdrawAmount(int amount){
		System.out.println("The withdraw amount is :"+amount);
		return customerAccount.withdrawAmount(amount);
	}
	
	public int depositAmount(int amount){
		System.out.println("The amount to be deposited:"+amount);
		return customerAccount.depositAmount(amount);
	}

}

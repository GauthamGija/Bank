package SampleBank;

import Account.*;

public class SampleBank 
{
	public static void main(String[] args) 
	{
		
		Account acc=new Account(10000,"Gautham","Male");
		AccountList.addAccountToList(acc);
		Account acc1=new Account(50000,"Firoz","Male");
		AccountList.addAccountToList(acc1);
		Account acc2=new Account(60000,"Kadhar","Male");
		AccountList.addAccountToList(acc2);
		ATMOperation atm =  new ATMOperation(1002,"Kadhar");
		atm.withdrawAmount(2000);
		System.out.println(String.format("Name:%S Account Number: %d Balance: %d",atm.getCustomerName() ,1002, atm.getbalance()));

	}

}

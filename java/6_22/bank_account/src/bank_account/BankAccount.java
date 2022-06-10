package bank_account;

import java.util.Random;

// void Deposit(Double amount,Boolean accountType);

public class BankAccount
{
	private static int numAccounts=0;
	private static double totalMoney=0.0D;	
	
	private double checking;
	private double savings;
	private Long id;
	
	public BankAccount()
	{
		this.checking=0;
		this.savings=0;
		this.id=genId();
		BankAccount.numAccounts++;
	}
	
	public BankAccount(double checking,double savings)
	{
		this.checking=checking;
		this.savings=savings;
		this.id=genId();
		BankAccount.numAccounts++;
		BankAccount.totalMoney+=checking+savings;
	}

	public Long genId()
	{
//		double rnd=Math.random();
//		Long _id=(long) (100000000.0D+(rnd*999999999-100000000.0D));
//		return _id;
		String _id="";
		for(int i=0;i<9;i++)
		{
			long num=(long) Math.floor(Math.random()*9);
			_id+=num+"";
		}
		System.out.println(_id);
		return Long.parseLong(_id);
	}
	
	public void Deposit(Double amount,Boolean accountType)
	{
		if(accountType)
		{
			savings+=amount;
		}
		else
		{
			checking+=amount;
		}

		totalMoney+=amount;
	}
	
	public double Withdraw(Double amount,Boolean accountType)
	{		
		if(accountType)
		{
			if((savings-amount)<0)
			{
				System.out.println("Insufficient Funds!");
				return 0;
			}
			savings-=amount;
		}
		else
		{
			if((checking-amount)<0)
			{
				System.out.println("Insufficient Funds!");				
				return 0;
			}
			checking-=amount;
		}
		return amount;
	}
	
	public double getTotal()
	{
		return checking+savings;
	}
	
	public double getChecking() {
		return checking;
	}

	public void setChecking(double checking) {
		this.checking = checking;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public static int getNumAccounts() {
		return numAccounts;
	}

	public static void setNumAccounts(int numAccounts) {
		BankAccount.numAccounts = numAccounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}
};
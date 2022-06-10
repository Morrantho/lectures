package bank_account;

public class Program
{
	public static void main(String[] args)
	{
		BankAccount account1=new BankAccount();
		BankAccount account2=new BankAccount(100.23D,4000.0D);
		
		account1.Deposit(400.0D,false);
		System.out.println(account1.getChecking());
		
		account2.Deposit(123.456,true);
		System.out.println(account2.getSavings());		
		
		account1.Withdraw(200.0D,false);
		System.out.println(account1.getChecking());
		
		account2.Withdraw(10000.0D,true);
		System.out.println(account2.getSavings());
	}
}

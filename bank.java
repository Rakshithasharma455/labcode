 package assigment3;

class bankaccount {
	private String accountHolderName;
	private String bankName;
	private double accountBalance;
	// creating a constructor
	public bankaccount(String accountHolderName,String bankName,double initialBalance) {
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.accountBalance = initialBalance;	
	}
	//methods interfacing
	public double getBalance()
	{
		return accountBalance;
	}
	public void deposit(double amount)
	{
		if(amount > 0) 
		{
			accountBalance += amount;
			System.out.println(amount +"deposited. new balance:"+accountBalance);
		}
		else
		{
			System.out.println("Deposite amount must be positive.");
		}
	}
	public void withdraw(double amount)
	{
		if(amount > 0 && amount <= accountBalance)
		{
			accountBalance -= amount;
			System.out.println(amount +"withdraw.New balance:"+ accountBalance);
		}
		else if (amount > accountBalance)
		{
			System.out.println("insufficient funds.");
		}
		else
		{
			System.out.println("withdrawal amount must be positive.");
		}
	}	
}

public class bank {

	public static void main(String[] args) {
		bankaccount a1 = new bankaccount("Aryan","ICICI",4000);
		bankaccount a2 = new bankaccount("Poornima","HDFC",6000);
		bankaccount a3 = new bankaccount("Rakshitha","SBI",8000);
		a1.deposit(1000);
		a1.withdraw(1500);
		a1.getBalance();
		System.out.println("Aryan's balance:"+ a1.getBalance());
		
		a2.deposit(1500);
		a2.withdraw(500);
		a2.getBalance();
		System.out.println("Poornima's balance:"+ a2.getBalance());
		
		a3.deposit(2000);
		a3.withdraw(1500);
		a3.getBalance();
		System.out.println("Rakshitha's balance:"+ a3.getBalance());
	}

}

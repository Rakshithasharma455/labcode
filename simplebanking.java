package day4;
class Bankaccount
{
	double balance;
	//constructor creating
	public Bankaccount(double initialbalance)
	{
		if(initialbalance >= 0)
		{
			this.balance = initialbalance;
		}
		else
		{
			throw new IllegalArgumentException("Initial balance cannot br negative");
		}
	}
	//method to deposit 
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance +=amount;
			System.out.println("deposited:"+amount);
		}
		else
		{
			System.out.println("deposit amount must be positive");
		}
	}
	//method to withdraw
	public void withdraw(double amount)
	{
		try 
		{
			if(amount <= 0)
			{
				throw new IllegalArgumentException("withdrawal amount must be positive");
			}
				else if (amount > balance)
				{
					throw new IllegalArgumentException("insufficient balance.withdrawal amount exceeds balance");
				}
				else
				{
					balance -= amount;
					System.out.println("withdraw:"+ amount);
				}
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public double getBalance()//method to check balance
	{
		return balance;
	}
	
}
public class simplebanking {

	public static void main(String[] args) {
		Bankaccount ba = new Bankaccount(10000);
		ba.deposit(2000);
		System.out.println("current balance:"+ba.getBalance());
		ba.withdraw(5000);
		System.out.println("current balance:"+ba.getBalance());
		

	}

}

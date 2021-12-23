package javaCode;

public class BankingInterface implements Bank {
	public void deposit()
	{
		System.out.println("Deposit the amount");
	}
	public void withdraw()
	{
		System.out.println("withdraw the amount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingInterface obj=new BankingInterface();
		obj.deposit();
		obj.withdraw();
	}

}
interface Bank
{
	void deposit();
	void withdraw();
	
}
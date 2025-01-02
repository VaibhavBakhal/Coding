class Account
{
	private static float int_rate;
	private int accNo;
	private double balance;

	static{
		int_rate=7.5f;	
	}

	public Account()
	{
		accNo=0;
		balance=0.0;
	}

	public Account(int a,double b)
	{
		accNo=a;
		balance=b;
	}

	public static void UpdateIntRate(float rn)
	{
		int_rate=rn;	
	}

	public double ModifyIntRate()
	{
		balance+=(int_rate*balance/100);
		return balance;
	}

	public void CurrentRate()
	{
		System.out.println("Current interest rate="+int_rate+"\tcurrent Balance="+balance);
	}

	public void Display()
	{
		System.out.println("Account number="+accNo+"\nBalanace="+balance+"\nInterest rate="+int_rate);
	}
}
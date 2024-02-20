import java.util.*;
class account
{
	String name;
	int accnum;
	String typeacc;
	double balance;
	account(String name,int accnum,String typeacc,double balance)
	{
		this.name=name;
		this.accnum=accnum;
		this.typeacc=typeacc;
		this.balance=balance;
	}
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("The balance after depositing is:"+balance);
	}
	public void withdraw(double amount)
	{
		if(balance-amount>=0)
		{
			balance-=amount;
			System.out.println("The balance after withdrawing is:"+balance);
		}
		else
			System.out.println("Insufficient value");
	}
	public void display()
	{
		System.out.println("Name: "+name+" Account number: "+accnum+" Type: "+typeacc+"Balance:"+balance);
	}
}
class savacct extends  account
{
	private double rate=10;
	savacct(String name,int accnum,String typeacc,double balance)
	{	
		super(name,accnum,typeacc,balance);
	}
	public void interest()
	{
		balance+=balance*(rate/100);
		System.out.println("The balance after interest is: "+balance);
	}
}
class curracct extends  account
{
	private double minbal=500;
	private double service=10;
	curracct(String name,int accnum,String typeacc,double balance)
	{
		super(name,accnum,typeacc,balance);
	}
	public void check(double balance)
	{
		if(balance<minbal)
		{
			balance-=service;
			System.out.println("Service charge is imposd since your balance is below min bal of 500");
			System.out.println("balance after service charge:"+balance);
		}
		else
			System.out.println("No service charge imposed");
	}
}
class bank
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your account nnumber: ");
		int accnum=s.nextInt();
		System.out.println("Enter the type of account (Savings/Current)");
		String typeacc=s.next();
		System.out.println("Enter the current balance value");
		double balance=s.nextDouble();
		
		double depamt,withamt;
		account acc= new account(name,accnum,typeacc,balance);
		savacct sa=new savacct(name,accnum,typeacc,balance);
		curracct cur=new curracct(name,accnum,typeacc,balance);
		while(true)
		{
			if(acc.typeacc.equals("Savings"))
			{
				System.out.println("\nMenu\n1.deposit 2.withdraw 3.compute interest 4.display 5.endloop");
				System.out.println("Enter the choice");
				int ch=s.nextInt();
				switch(ch)
				{
					case 1:
						{System.out.println("enter the amount:");
						depamt=s.nextInt();
						sa.deposit(depamt);
						break;}
					case 2:
						{System.out.println("enter the amount:");
						withamt=s.nextInt();
						sa.withdraw(withamt);
						break;}
					case 3:
						{sa.interest();	
						break;}
					case 4:
						{sa.display();
						break;}
					case 5:{System.exit(0);}
					
					default:
						{System.out.println("invalid input");
						break;}

				}
			}
			else
			{
				System.out.println("\nMenu\n 1.Check penalty 2.end loop");
				System.out.println("Enter the choice");
				int ch=s.nextInt();
				switch(ch)
				{
					case 1:
						{cur.check(balance);break;}
					case 2:
						{System.exit(0);}
					default:
						{System.out.println("invalid input");
						break;}
				}
			}
		}
	}
}
						
						
						
				

					
		
		




	
import java.util.Scanner;
class RedBusDriver 
{
	RedBus r;
AccountR a;
Scanner sc=new Scanner(System.in);
public void login()
	{
if(a==null)
		{
			System.out.println("Enter Name");
			String n=sc.next();
			System.out.println("Enter Address");
			String ad=sc.next();
			System.out.println("Enter Vaccination Status");
String v=sc.next();
a=new AccountR(n,ad,v);
System.out.println("login Completed");
		}
		else
System.out.println("Account Is Already Exists");
	}
	public void logout()
	{
		if(a==null)
			System.out.println("Please Make A Login Process");
		else
		{
			a=null;
			System.out.println("Logout Completed");
		}
	}
public void bookTicket()
	{
	if(a==null)
System.out.println("Please Make A Login Process");
	else
		{
System.out.println("1.National Travel 2.VRL Travel 3.Sea Bird Travel");
switch(sc.nextInt())
			{
				case 1:
				{
System.out.println("Enter From");					
String f=sc.next();
System.out.println("Enter To");					
String t=sc.next();
System.out.println("Enter Date");					
String d=sc.next();
System.out.println("Enter Kilometer");					
int k=sc.nextInt();
r=new NationalTravel(f,t,d,k);
System.out.println("You Have Choosed National Travel");
System.out.println("1.Confirmation 2.Cancel");
if(sc.nextInt()==1)
payment();
else
					{
						r=null;
						System.out.println("Bus Is Cancelled");
					}
				}
				break;
				case 2:
				{
System.out.println("Enter From");					
String f=sc.next();
System.out.println("Enter To");					
String t=sc.next();
System.out.println("Enter Date");					
String d=sc.next();
System.out.println("Enter Kilometer");					
int k=sc.nextInt();
r=new VrlTravel(f,t,d,k);
System.out.println("You Have Choosed VRL Travel");
System.out.println("1.Confirmation 2.Cancel");
if(sc.nextInt()==1)
payment();
else
					{
						r=null;
						System.out.println("Bus Is Cancelled");
					}
				}
				break;
				case 3:
				{
System.out.println("Enter From");					
String f=sc.next();
System.out.println("Enter To");					
String t=sc.next();
System.out.println("Enter Date");					
String d=sc.next();
System.out.println("Enter Kilometer");					
int k=sc.nextInt();
r=new SeaBirdTravel(f,t,d,k);
System.out.println("You Have Choosed Sea Bird Travel");
System.out.println("1.Confirmation 2.Cancel");
if(sc.nextInt()==1)
payment();
else
					{
						r=null;
						System.out.println("Bus Is Cancelled");
					}
				}
				break;
			}
		}
	}
	public void cancelTicket()
	{
		if(r==null)
			System.out.println("Please First Book Ticket");
		else
		{
			r=null;
			System.out.println("Ticket Is Cancelled");
		}
	}
	public void changeDate()
	{
		if(r==null)
			System.out.println("Please First Book Ticket");
		else
		{
		System.out.println("Which date Do You Want?");	
		r.d=sc.next();
		}
	}
	public void payment()
	{
		if(r instanceof NationalTravel)
		{
			NationalTravel nt=(NationalTravel)r;
			double money=nt.k*nt.price;
			System.out.println(nt.f);
			System.out.println(nt.t);
			System.out.println(nt.d);
			System.out.println("Total = "+money);
			System.out.println("1.Payment 2.Cancel");
			if(sc.nextInt()==1)
			{
				System.out.println("Enter Amount");
				int amount=sc.nextInt();
				if(amount>=money)
					System.out.println("Bus Is Confirmed");
			else
			{
				r=null;
				System.out.println("Bus Is Cancelled");
			}
		}
		else
			System.out.println("Bus Is Cancelled");
		}
		else if(r instanceof VrlTravel)
		{
			VrlTravel nt=(VrlTravel)r;
			double money=nt.k*nt.price;
			System.out.println(nt.f);
			System.out.println(nt.t);
			System.out.println(nt.d);
			System.out.println("Total = "+money);
			System.out.println("1.Payment 2.Cancel");
			if(sc.nextInt()==1)
			{
				System.out.println("Enter Amount");
				int amount=sc.nextInt();
				if(amount>=money)
					System.out.println("Bus Is Confirmed");
			else
			{
				r=null;
				System.out.println("Bus Is Cancelled");
			}
		}
		else
			System.out.println("Bus Is Cancelled");
		}
		else if(r instanceof SeaBirdTravel)
		{
			SeaBirdTravel nt=(SeaBirdTravel)r;
			double money=nt.k*nt.price;
			System.out.println(nt.f);
			System.out.println(nt.t);
			System.out.println(nt.d);
			System.out.println("Total = "+money);
			System.out.println("1.Payment 2.Cancel");
			if(sc.nextInt()==1)
			{
				System.out.println("Enter Amount");
				int amount=sc.nextInt();
				if(amount>=money)
					System.out.println("Bus Is Confirmed");
			else
			{
				r=null;
				System.out.println("Bus Is Cancelled");
			}
		}
		else
			System.out.println("Bus Is Cancelled");
		}
		else
			System.out.println("Please First Book Ticket");
	}
}
//RTE
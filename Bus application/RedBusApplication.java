import java.util.Scanner;
class RedBusApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		RedBusDriver rbd=new RedBusDriver();
		for(;;)
			{
			System.out.println("1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit");
			switch(sc.nextInt())
			{
				case 1:
					rbd.login();
				break;
								case 2:
					rbd.logout();
				break;
								case 3:
					rbd.bookTicket();
				break;
								case 4:
					rbd.cancelTicket();
				break;
								case 5:
					rbd.changeDate();
				break;
								case 6:
					rbd.payment();
				break;
								case 7:
System.out.println("Application Is Closed");
System.exit(2);
			}
	
			}
	}
}
/*
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
1
Enter Name
SUKHADA
Enter Address
PUNE
Enter Vaccination Status
YES
login Completed
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
1
Account Is Already Exists
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
2
Logout Completed
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
2
Please Make A Login Process
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
3
Please Make A Login Process
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
4
Please First Book Ticket
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
5
Please First Book Ticket
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
7
Application Is Closed
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
6
Please First Book Ticket
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
3
1.National Travel 2.VRL Travel 3.Sea Bird Travel
2
Enter From
PUNE
Enter To
AHMEDNAGAR
Enter Date
30MARCH2023
Enter Kilometer
120
You Have Choosed VRL Travel
1.Confirmation 2.Cancel
2
Bus Is Cancelled
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
3
1.National Travel 2.VRL Travel 3.Sea Bird Travel
3
Enter From
PUNE
Enter To
AHMEDNAGAR
Enter Date
2APRIL2023
Enter Kilometer
120
You Have Choosed Sea Bird Travel
1.Confirmation 2.Cancel
1
PUNE
AHMEDNAGAR
2APRIL2023
Total = 2040.0
1.Payment 2.Cancel
1
Enter Amount
2030
Bus Is Cancelled
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
3
1.National Travel 2.VRL Travel 3.Sea Bird Travel
2
Enter From
PUNE
Enter To
AHMEDNAGAR
Enter Date
1APRIL2023
Enter Kilometer
120
You Have Choosed VRL Travel
1.Confirmation 2.Cancel
1
PUNE
AHMEDNAGAR
1APRIL2023
Total = 1680.0
1.Payment 2.Cancel
1
Enter Amount
1681
Bus Is Confirmed
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
3
1.National Travel 2.VRL Travel 3.Sea Bird Travel
1
Enter From
PUNE
Enter To
AHMEDNAGAR
Enter Date
29MARCH2023
Enter Kilometer
120
You Have Choosed National Travel
1.Confirmation 2.Cancel
1
PUNE
AHMEDNAGAR
29MARCH2023
Total = 1440.0
1.Payment 2.Cancel
2
Bus Is Cancelled
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
5
Which date Do You Want?
30MARCH2023
1.Login 2.Logout 3.Book Ticket 4.Cancel Ticket 5.Change Date 6.Payment 7.Exit
6
PUNE
AHMEDNAGAR
30MARCH2023
Total = 1440.0
1.Payment 2.Cancel
1
Enter Amount
2000
Bus Is Confirmed
*/
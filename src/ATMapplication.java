import java.util.Scanner;

// the account number, user name, balance,PIN. Deposits and withdraws must update the balance.
public class ATMapplication {

	public void runATM() {
		double deposit = 0.00, withdraws = 0.00;
		int i,d;
		String m;
		double currentBalance = 0.00;
		Account saving = new Account();
		Account checking = new Account();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input your pin");
			i = keyboard.nextInt();
			if (i == 123) {
			System.out.print("How can we help you today");

			System.out.println("========================\n"
							 +"ATM Menu: \n \n"
							 + "1. Deposit Money \n"
							 + "2. Withdraw Money \n"
							 + "3. Check Account Balance\n"
							 + "4. End Session\n"
							 + "========================\n"
							 + "\nEnter selection: ");
			
			i = keyboard.nextInt();
			if (i == 1) {
				// deposit Money
				System.out.println("Enter (1) for checking or enter (2) for saving");
				d = keyboard. nextInt();
				System.out.println("How much do you want to deposit?");
				deposit = keyboard.nextDouble();
				if (d == 1) {
					currentBalance = checking.getBalance() + deposit;
					System.out.println("Your balance is " + currentBalance);
					System.out.println("your session ended");
					
				}
				else if (d == 2) {
					currentBalance = saving.getBalance() + deposit;
					System.out.println("Your balance is " + currentBalance);
					System.out.println("your session ended");
				}
			}
			else if (i == 2) {
				// withdraw Money
				System.out.println("Enter (1) for checking or enter (2) for saving");
				d = keyboard. nextInt();
				System.out.println("How much do you want to withdraw");
				withdraws = keyboard.nextDouble();
				if (d == 1) {
					currentBalance = checking.getBalance() - withdraws;
					System.out.println("Your balance is " + currentBalance);
					System.out.println("your session ended");
				}
				else if (d == 2) {
					currentBalance = saving.getBalance() - withdraws;
					System.out.println("Your balance is " + currentBalance);
					System.out.println("your session ended");
			}
			else if (i == 3) {
				// Check Account Balance
				System.out.println("Your Account Balance is " + currentBalance);
				System.out.println("your session ended");
				
			}
			else if (i == 4) {
				// End Session
				System.out.println("Do you want to end session? \n Yes or No");
				m = keyboard.next();
				if (m.equals("Yes")) {
					System.out.println("Goodbye!");
				}
				else {
					System.out.println("What else do you need?");
					System.out.println("your session ended");
				}
			}
			}
			
    	}
	}
}

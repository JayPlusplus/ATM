
public class Account {
	private int accNumber;
	private String userName;
	private double balance;
	private int pin;
	private double deposits, withdraws;
	
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getDeposits() {
		return deposits;
	}
	public void setDeposits(double deposits) {
		this.deposits = deposits;
	}
	public double getWithdraws() {
		return withdraws;
	}
	public void setWithdraws(double withdraws) {
		this.withdraws = withdraws;
	}

}

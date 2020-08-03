package ex;

public class Account {
	private String ownerName;
	private int accountNumber;
	private int balance;

	Account() {

	}

	Account(String owerName, int accountNumber, int balance) {
		this.ownerName = owerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void setOwnerName(String owerName) {
		this.ownerName = owerName;

	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;

	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		if (this.balance < amount) {
			System.out.println("잔고가 충분하지 않소이다.");
		} else {
			this.balance -= amount;
		}
	}

	@Override
	public String toString() {
		String resultString;
		resultString = "예금주 이름 : " + getOwnerName() + "\n계좌번호 : " + getAccountNumber() + "\n잔고 : " + getBalance();
		return resultString;
	}

}

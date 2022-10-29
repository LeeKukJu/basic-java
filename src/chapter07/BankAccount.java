package chapter07;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		if (amount >= 0) {
			this.balance += amount;
		} // else if는 왜 오류가 날까???

	}

	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else {
			System.out.println("잔액이 부족합니다.");
			return false;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (getBalance() >= amount) {
			balance -= amount;
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
	}
}

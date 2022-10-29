package chapter07;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] account;
	private int numberOfAccounts;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		account = new BankAccount[5];
	}

	public BankAccount getAccount(int index) {
		return account[index];
	}

	public void addAccount(BankAccount account) {
		for (int i = 0; i < this.account.length; i++) {
			if (this.account[i] == null) {
				this.account[i] = account;
				numberOfAccounts++;
				break;
			}
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@Override
	public String toString() {
		return String.format("이름: %s %s, 계좌의 갯수: %d \n", firstName, lastName, numberOfAccounts);
	}
}

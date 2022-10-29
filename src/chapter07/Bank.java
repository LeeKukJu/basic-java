package chapter07;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;

	public Bank() {
		this.customers = new Customer[10];
	}

	public void addCustomer(Customer customer) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == null) {
				customers[i] = customer;
				numberOfCustomers++;
				break;
			}
		}
	}

	public int getNumberOfCustomers() {
		return this.numberOfCustomers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}
}

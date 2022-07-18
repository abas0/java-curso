package bankAccount;

public class AccountDetails {
	private long number;
	private String name;
	private double balance;
	private static double TAX = 5.00;
	
	public AccountDetails(long number, String name) {
		this.number = number;
		this.name = name;
	}

	public AccountDetails(long number, String name, double balance) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public long getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double deposite(double deposite) {
		return balance += deposite;
	}
	
	public double withdraw(double withdraw) {
		return balance -= (withdraw + TAX);
	}
	
	public void details() {
		System.out.printf("Account data:\r\n"
				+ "Account %d, Holder: %s, Balance: $ %.2f%n", number, name, balance);
	}
}

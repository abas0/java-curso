package application;

import java.util.Locale;
import java.util.Scanner;

import bankAccount.AccountDetails;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //padrao de escrita do US
		Scanner sc = new Scanner(System.in); //inicializar a variável para a entrada de dados
		AccountDetails accountDetails;
		double balance;
		System.out.println("Enter account number: ");
		long number = sc.nextLong();
		System.out.println("Enter account holder: ");
		String name = sc.next();
		System.out.println("Is there na initial deposit (y/n)?");
		char answer = sc.next().charAt(0);
		if(answer == 'y') {
			System.out.println("Enter initial deposit value: ");
			balance = sc.nextDouble();
			accountDetails = new AccountDetails(number, name, balance);
		}
		else {
			accountDetails = new AccountDetails(number, name);
		}
		accountDetails.details();
		
		System.out.println("Enter a deposit value: ");
		balance = sc.nextDouble();
		System.out.printf("Updated account data:\r\n"
				+ "Account %d, Holder: %s, Balance: $ %.2f%n", accountDetails.getNumber(), accountDetails.getName(), accountDetails.deposite(balance));
		System.out.println("Enter a withdraw value: ");
		balance = sc.nextDouble();
		System.out.printf("Updated account data:\r\n"
				+ "Account %d, Holder: %s, Balance: $ %.2f%n", accountDetails.getNumber(), accountDetails.getName(), accountDetails.withdraw(balance));
		sc.close();
	}

}

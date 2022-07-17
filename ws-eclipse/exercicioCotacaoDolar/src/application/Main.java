package application;

import java.util.Locale;
import java.util.Scanner;

import coin.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //inicializar a vari�vel para a entrada de dados
		System.out.println("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double dollarPrice = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.currencyconverter(dollarPrice, dollar));
		sc.close(); //para quando n�o precisar mais da vari�vel scanner
	}

}

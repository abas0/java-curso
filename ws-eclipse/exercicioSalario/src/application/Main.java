package application;

import java.util.Locale;
import java.util.Scanner;

import employee.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //padrao de escrita do US
		Scanner sc = new Scanner(System.in); //inicializar a variável para a entrada de dados
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Gross salary: ");
		double grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		double tax = sc.nextDouble();
		Employee employee = new Employee();
		employee.name = name;
		employee.grossSalary = grossSalary;
		employee.tax = tax;
		System.out.printf("Employee: %s, $ $%.2f%n", employee.name, employee.netSalary());
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		System.out.printf("Updated data: %s, $ %.2f%n", employee.name, employee.increaseSalary(percentage));
	}

}

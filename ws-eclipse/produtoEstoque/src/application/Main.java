package application;

import java.util.Locale;
import java.util.Scanner;

import products.Inventory;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
		String name = sc.next();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		Inventory product = new Inventory();
		product.name = name;
		product.price = price;
		product.quantity = quantity;
		double total = product.totalValueInStock(product.quantity);
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, total);
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		quantity = product.addProducts(quantity);
		product.quantity = quantity;
		total = product.totalValueInStock(product.quantity);
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, total);
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		quantity = product.removeProducts(quantity);
		product.quantity = quantity;
		total = product.totalValueInStock(product.quantity);
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, total);
		sc.close();
	}

}

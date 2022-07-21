package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numbers;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		Numbers numbers = new Numbers();
		int n = sc.nextInt();
		double number;
		double[] vect = new double[n];
		for(int i = 0; i< vect.length; i++) {
			System.out.println("Digite um numero: ");
			number = sc.nextDouble();		
			vect[i] = number;
		} 
		double sum = numbers.sum(n, vect);
		double avarage = numbers.avarage(n, vect);
		System.out.println("SOMA: " + sum);
		System.out.println("MEDIA: " + avarage);
		
		sc.close();
	}

}

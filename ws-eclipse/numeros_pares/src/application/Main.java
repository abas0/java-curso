package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import calculation.EvenNumber;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		ArrayList<Integer> pares = new ArrayList<>(size);
		//int pares [] = new int[size];
		EvenNumber number = new EvenNumber();
		for(int i = 0; i < size; i++) {
			System.out.println("Digite um numero: ");
			numbers[i] = sc.nextInt();
			number = new EvenNumber(numbers[i]);
			
			//numbers[i] = number.getNumber();
		}
		System.out.println(number.numerosPares(numbers));
		System.out.println(number.numerosPares(numbers).size());
		
		sc.close();
		
	}

}

package application;

import java.util.Scanner;

import biggerSize.BiggerSize;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar?");
		int size = sc.nextInt();
		BiggerSize number = new BiggerSize();
		int vect[] = new int[size];
		for(int i = 0; i< size; i++) {
			System.out.println("Digite um numero:");
			vect[i] = sc.nextInt();
			number = new BiggerSize(vect[i]);			
		}
		number.biggestSize(vect);
		sc.close();

	}

}

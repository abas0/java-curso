package application;

import java.util.Scanner;

import entities.Negatives;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		Negatives[] vect = new Negatives[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			int numero =  sc.nextInt();
			if(numero < 0) {
				vect[i] = new Negatives(numero);
			}
			else
			{
				n--;
			}
		}
		System.out.println("n: " + n);
		System.out.println("Vetor negativo: ");
		for(int i = 0; i < n; i++) {
			System.out.print(vect[i].getNum());
		}
		sc.close();
	}

}

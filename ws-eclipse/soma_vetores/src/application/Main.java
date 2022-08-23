package application;

import java.util.Scanner;

import somatorio.Somatorio;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vai ter cada vetor?");
		int size = sc.nextInt();
		int a[][] = new int[2][size];
		Somatorio somatorio = new Somatorio();
		char vect = ' ';
		for(int i =0; i < 2; i++) {
			if(i == 0) {
				vect = 'A';
			}
			else if (i == 1) {
				vect = 'B';
			}
			for(int j = 0; j < size; j++) {
				System.out.println("Digite os valores do vetor " + vect + ": ");
				a[i][j] = sc.nextInt();
				somatorio = new Somatorio(a[i][j]);
			}
		}
		somatorio.soma(a, size);
		sc.close();
	}
}

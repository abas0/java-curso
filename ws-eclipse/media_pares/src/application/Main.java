package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MediaPares;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor?");
		int size = sc.nextInt();
		float num [] = new float [size];
		MediaPares mediaPares = new MediaPares();
		for(int i = 0; i < size; i++) {
			System.out.println("Digite um numero: ");
			num[i] = sc.nextFloat();
			//mediaPares = new MediaPares(num[i]);
		}
		if(mediaPares.mediaPares(num) == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			System.out.println("MEDIA DOS PARES = " +  mediaPares.mediaPares(num));
		}
		sc.close();

	}

}

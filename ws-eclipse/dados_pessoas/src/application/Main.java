package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPessoas;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas?");
		int size = sc.nextInt();
		float [] altura = new float [size];
		char [] sexo = new char [size]; 
		for(int i = 0; i < size; i++) {
			System.out.printf("Altura da %da pessoa:", i+1);
			altura[i] = sc.nextFloat();
			System.out.printf("Sexo biológico da %da pessoa:", i+1);
			sexo[i] = sc.next().charAt(0);
			
		}
		DadosPessoas dadosPessoas = new DadosPessoas(altura, sexo);
		float menor = dadosPessoas.menorAltura(altura);
		float maior = dadosPessoas.maiorAltura(altura);
		float media = dadosPessoas.mediaMulher(altura, sexo);
		int homens = dadosPessoas.qntdHomens(sexo);
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.println("Media das alturas das mulheres = " + media);
		System.out.println("Numero de homens = " + homens);
		sc.close();
	}

}

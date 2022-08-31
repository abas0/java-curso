package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MaisVelho;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas voce vai digitar?");
		int size = sc.nextInt();
		MaisVelho dados[] = new MaisVelho[size];
		String nome = "";
		int idade = 0;	
		int idades[] = new int [size];
		
		String nomes[] = new String [size];
		for(int i = 0; i < size; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			nome = sc.next();
			idade = sc.nextInt();
			dados[i] = new MaisVelho(idade, nome);
			idades[i] = dados[i].getIdade();
			nomes[i] = dados[i].getNome();
		}
		MaisVelho maisVelho = new MaisVelho();
		int auxIdade = 0;
		System.out.println(maisVelho.nomeVelho(idades, nomes, auxIdade));
		
		sc.close();

	}

}

/*import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
	    double maior;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    double[] vetor = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextDouble();
	    }

	    maior = vetor[0];
	    posmaior = 0;

	    for (int i=1; i<n; i++) {
	        if (vetor[i] > maior) {
	            maior = vetor[i];
	            posmaior = i;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

		sc.close();
	}
}*/


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Media;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos serao digitados?");
		int size = sc.nextInt();
		int qntdNotas = 2;
		float notas[][] = new float [size][2];
		String nome[] = new String [size];
		for(int i = 0; i < size; i++) {
			System.out.printf("Digite nome, e as %d notas do %do aluno:%n", qntdNotas, i+1);
			nome[i] = sc.next();
			for(int j = 0; j<qntdNotas; j++) {
				notas[i][j] = sc.nextFloat();
			}
		}
		Media media = new Media(nome, notas);
		media.aprovados(notas, nome);
		
		sc.close();
	}

}

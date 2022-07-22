package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Height;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas?");
		int size = sc.nextInt();
		double[] vectHeight = new double[size];
		Height[] vect = new Height[size];
		String name;
		int age;
		double height;
		Height data = new Height();
		for(int i = 0; i< vect.length; i++) {
			System.out.printf("Dados da %da pessoa: ", i+1);
			System.out.print("Nome: ");
			name = sc.next();
			System.out.println(" ");
			System.out.print("Idade: ");
			age = sc.nextInt();
			System.out.println(" ");
			System.out.print("Altura: ");
			height = sc.nextDouble();
			System.out.println(" ");
			data = new Height(name, height, age);
			vectHeight[i] = data.getHeight();
		}
		double heightAvarage = data.heightAverage(vect.length, vectHeight);
		System.out.printf("Altura média: " + heightAvarage);
		//porcentagem
		
		sc.close();
	}

}

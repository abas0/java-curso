package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Height;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas?");
		int size = sc.nextInt();
		//double[] vectHeight = new double[size];
		//double[] minor = new double[size];
		ArrayList<Double> vectHeight = new ArrayList<>(size);
		ArrayList<Double> minor = new ArrayList<>(size);
		ArrayList<String> nameMinor = new ArrayList<>(size);
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
			vectHeight.add(data.getHeight());
			if(age < 16) {
				minor.add(data.getHeight());
				nameMinor.add(data.getName());
			}
		}
		double heightAvarage = data.heightAverage(vect.length, vectHeight);
		System.out.printf("Altura média: %.2f%n", heightAvarage);
		double percentage = data.percentage(minor.size(), vectHeight.size());
		System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%\n", percentage);
		for(int i = 0; i < nameMinor.size(); i++) {
			System.out.println(nameMinor.get(i));
		}
		sc.close();
	}

}

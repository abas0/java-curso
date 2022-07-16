package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //padrao de escrita do US
		Scanner sc = new Scanner(System.in); //inicializar a variável para a entrada de dados
		System.out.println("Enter rectangle width and height: ");
		double ladoA = sc.nextDouble();
		double ladoB = sc.nextDouble();
		Triangle triangle = new Triangle();
		triangle.ladoA = ladoA;
		triangle.ladoB = ladoB;
		System.out.printf("AREA: %.2f%n", triangle.area());
		//System.out.printf("PERIMETER: %.2f%n", triangle.perimeter());
		//System.out.printf("DIAGONAL: %.2f%n", triangle.diagonal());
		sc.close();
	}

}

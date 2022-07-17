package application;

import java.util.Locale;
import java.util.Scanner;

import student.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //inicializar a variável para a entrada de dados
		System.out.println("Insert the student's name: ");
		String name = sc.next();
		Student student = new Student();
		student.name = name;
		double grade[] = new double[3];
		for(int i = 0; i< student.grade.length; i++) {
			System.out.printf("Insert the grade %d: ", i+1);
			grade[i] = sc.nextDouble();
			student.grade[i] = grade[i];
		}
		double finalGrade = student.finalGrade(student.grade);
		System.out.println(finalGrade);
		student.isApproved();
		
		sc.close(); //para quando não precisar mais da variável scanner
	}

}

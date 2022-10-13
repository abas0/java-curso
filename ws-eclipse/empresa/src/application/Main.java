package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import empregados.Empregados;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //padrao de escrita do US
		Scanner sc = new Scanner(System.in); //inicializar a variável para a entrada de dados
		System.out.println("Quantos empregados serão registrados? ");
		int size = sc.nextInt();
		ArrayList<Empregados> empregados = new ArrayList<>(); 
		for(int i = 1; i <= size; i++) {
			System.out.println("Empregado #" + i + ": ");
			System.out.println("Id: ");
			int id = sc.nextInt();
			if(jaExiste(empregados, id)) {
				System.out.println("Já existe esse ID!");
			}
			else {
				System.out.println("Nome: ");
				String nome = sc.next();
				System.out.println("Salário: ");
				float salario = sc.nextFloat();
				Empregados empregado = new Empregados(id,nome,salario);
				empregados.add(empregado);
			}
		}
		System.out.println("Insira o ID do empregado que receberá um aumento: ");
		int idDigitado = sc.nextInt();
		Empregados e = empregados.stream().filter(x -> x.getId() == idDigitado).findFirst().orElse(null);
		if(e != null) {
			System.out.println("Insira a porcentagem desejada: ");
			float porcentagem = sc.nextFloat();
			e.aumento(porcentagem);
		}
		else {
			System.out.println("Id inexistente");
		}
		System.out.println("Lista de empregados: ");
		for(Empregados empregado : empregados) {
			System.out.println(empregado.getId());
			System.out.println(empregado.getNome());
			System.out.println(empregado.getSalario());
			System.out.println();
		}
		
		sc.close();
	}

	public static boolean jaExiste(ArrayList<Empregados> empregados, int id) {
		Empregados e = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return e != null;
	}
}



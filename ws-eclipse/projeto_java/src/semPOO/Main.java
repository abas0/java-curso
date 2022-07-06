package semPOO;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ladoA;
		double ladoB;
		double ladoC;
		do {
			ladoA = sc.nextFloat();
			ladoB = sc.nextFloat();
			ladoC = sc.nextFloat();
			if(trianguloValido(ladoA, ladoB, ladoC)) {
				System.out.println("Tri�ngulo v�lido");
				double area = calculoArea(ladoA, ladoB, ladoC);
				System.out.println("C�lculo da �rea: " + area);
			}
			else {
				System.out.println("Tri�ngulo inv�lido. Tente novamente");
			}
		}while(!trianguloValido(ladoA, ladoB, ladoC));
		
		sc.close();	
	} 
	
	public static boolean trianguloValido (double a, double b, double c) {
		if(a + b > c && a + c > b && b + c > a) {
			return true;
		}
		return false;
	}
	public static double calculoArea (double a, double b, double c) {
		double p = (a + b + c)/2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}
	

}

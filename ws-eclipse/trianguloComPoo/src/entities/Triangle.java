package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		// n�o recebe par�mtro porque os par�mtros j� s�o as vari�veis declaradas acima
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}

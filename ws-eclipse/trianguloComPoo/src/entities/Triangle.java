package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		// não recebe parâmtro porque os parâmtros já são as variáveis declaradas acima
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}

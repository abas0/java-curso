package entities;

public class Triangle {
	public double ladoA;
	public double ladoB;
	
	public double diagonal() {
		return Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
	}
	
	public double area() {
		double p = (ladoA + ladoB + diagonal()) / 2.0;
		return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - diagonal()));
	}
	
	public double perimeter() {
		return ladoA + ladoB + diagonal();
	} 

}

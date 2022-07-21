package entities;

public class Numbers {
	private double [] number;
	private int size;

	public Numbers() {
	}
	
	public Numbers(double[] number, int size) {
		this.number = number;
		this.size = size;
	}

	public double[] getNumber() {
		return number;
	}

	public void setNumber(double[] number) {
		this.number = number;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public double sum(int size, double[] vect) {
		double sum = 0;
		for(int i = 0; i< vect.length; i++) {
			sum += vect[i];
		}
		return sum;
	} 
	
	public double avarage(int size, double[] vect) {
		return sum(size, vect)/size;
	}
	
}

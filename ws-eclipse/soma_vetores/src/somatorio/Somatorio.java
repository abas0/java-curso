package somatorio;

public class Somatorio {
	int number;

	public Somatorio() {
	}
	
	public Somatorio(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void soma(int a[][], int size) {
		System.out.println("a.length " + a.length);	
		int soma[]= new int[size];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < size; j++) {
				soma[j] += a[i][j];
			}
		}
		for(int i = 0; i < size; i++) {
			System.out.println("Soma[i] " + soma[i]);
		}
	}
	
}

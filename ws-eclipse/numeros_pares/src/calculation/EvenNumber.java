package calculation;

import java.util.ArrayList;

public class EvenNumber {
	int number;

	public EvenNumber() {
	}
	
	public EvenNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public ArrayList<Integer> numerosPares(int [] numbers) {
		ArrayList<Integer> par = new ArrayList<>();
		//int par[] = new int[size];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2 == 0) {
				par.add(numbers[i]);
				//System.out.println("par: " + par);
			}
		}	
		return par;
	}
	
	/*public void imprimePares() {
		int [] par = numerosPares(number);
		for(int i = 0; i < par.length; i++) {
			System.out.println(par[i]);
		}
	}*/
}

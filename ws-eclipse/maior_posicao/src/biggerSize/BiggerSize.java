package biggerSize;

public class BiggerSize {
	private int number;

	public BiggerSize() {
	}
	
	public BiggerSize(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void biggestSize(int numbers[]) {
		int aux = 0;
		int pos = -1;
		for(int i = 0; i< numbers.length; i++) {
				for(int j = 0; j< i; j++) {
					if(numbers[j] >= numbers[i] && aux < numbers[j]) {
						aux = numbers[j];
						pos = j;
					}
					else if(numbers[i] > numbers[j] && i == numbers.length - 1){
						aux = numbers[i];
						pos = i;
					}
			}
		}
		System.out.println("Valor máximo: " + aux);
		System.out.println("Posição: " + pos);
	}
	
}

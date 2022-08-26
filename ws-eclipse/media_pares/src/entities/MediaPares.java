package entities;

public class MediaPares {
	float num;
	
	public MediaPares() {
	} 

	public MediaPares(float num) {
		super();
		this.num = num;
	}

	public float getNum() {
		return num;
	}

	public void setNum(float num) {
		this.num = num;
	} 
	
	public float mediaPares(float num[]) {
		float mediaPares = 0;
		float somatorio = 0;
		int qtd = 0;
		for(int i = 0; i< num.length; i++){
			if(num[i]%2 == 0) {
				somatorio += num[i];
				qtd++;
			}
		}
		if(qtd != 0) {
			mediaPares = somatorio/qtd;
		}
		
		return mediaPares;
		
	}
}

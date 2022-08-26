package entities;

import java.util.ArrayList;

public class AbaixoMedia {
	private float num;
	
	public AbaixoMedia() {
	}

	public AbaixoMedia(float num) {
		this.num = num;
	}

	public float getNum() {
		return num;
	}

	public void setNum(float num) {
		this.num = num;
	}
	
	public float media(float num[]) {
		float somatorio = 0;
		for(int i = 0; i < num.length; i++) {
			somatorio += num[i];
		}
		return somatorio/num.length;
	}
	
	public ArrayList<Float> elementosAbaixo(float num[], float media) {
		ArrayList<Float> abaixo = new ArrayList<Float>();
		for(int i = 0; i < num.length; i++) {
			if(num[i] < media) {
				abaixo.add(num[i]);
			}
		}
		return abaixo;
	}
}

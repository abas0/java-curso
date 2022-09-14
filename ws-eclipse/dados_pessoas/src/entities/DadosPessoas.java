package entities;

public class DadosPessoas {
	private float [] altura;
	private char [] sexo;
	
	public DadosPessoas(float [] altura, char [] sexo) {
		this.altura = altura;
		this.sexo = sexo;
	}

	public float[] getAltura() {
		return altura;
	}

	public void setAltura(float altura[]) {
		this.altura = altura;
	}

	public char[] getSexo() {
		return sexo;
	}

	public void setSexo(char sexo[]) {
		this.sexo = sexo;
	}
	
	public float menorAltura(float[] altura) {
		float menor = 999;
		for(int i = 0; i < altura.length; i++) {
			if(altura[i] < menor) {
				menor = altura[i];
			}
		}
		return menor;
	}
	
	public float maiorAltura(float[] altura) {
		float maior = 0;
		for(int i = 0; i < altura.length; i++) {
			if(altura[i] > maior) {
				maior = altura[i];
			}
		}
		return maior;
	}
	
	public float mediaMulher(float[] altura, char[] sexo) {
		float somatorio = 0;
		float media = 0;
		float divisor = 0;
		for(int i = 0; i < altura.length; i++) {
			if(sexo[i] == 'F' || sexo[i] == 'f') {
				somatorio += altura[i];
				divisor++;
			}	
		}
		if(divisor > 0) {
			media = somatorio/divisor;
		}
		else {
			media = somatorio/altura.length;
		}
		
		return media;
	}
	public int qntdHomens(char[] sexo) {
		int homens = 0;
		for(int i =0; i < sexo.length; i++) {
			if(sexo[i] == 'M' || sexo[i] == 'm') {
				homens++;
			}
		}
		return homens;
	}
	
}

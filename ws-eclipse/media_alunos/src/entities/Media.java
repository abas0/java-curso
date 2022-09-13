package entities;

import java.util.ArrayList;

public class Media {
	private String nome[];
	private float nota[][];
	
	public Media(String nome[], float nota[][]) {
		this.nome = nome;
		this.nota = nota;
	}

	public String[] getNome() {
		return nome;
	}

	public void setNome(String nome[]) {
		this.nome = nome;
	}

	public float[][] getNota() {
		return nota;
	}

	public void setNota(float nota[][]) {
		this.nota = nota;
	}
	
	private float[] calculoMedia(float nota[][], String nome[]) {
		float media[] = new float[nota.length];
		for(int i = 0; i < nota.length; i++) {
			float somatorio = 0;
			for(int j = 0; j < nota[i].length; j++) {
				somatorio += nota[i][j];
			}
			media[i] = somatorio/nota[i].length;
		}
		return media;
	}
	
	public void aprovados(float nota[][], String nome[]) {
		float media [] = calculoMedia(nota, nome);
		ArrayList<String> aprovados = new ArrayList<String>();
		for(int i = 0; i < media.length; i++) {
			System.out.println("Nome: " + nome[i]);
			System.out.println("Media: " + media[i]);
			if(media[i] >= 7.0) {
				aprovados.add(nome[i]);
			}
		}
		System.out.println("Alunos aprovados: " + aprovados);
	}
	
}

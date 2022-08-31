package entities;

public class MaisVelho {
	private int idade;
	private String nome;
	
	public MaisVelho() {
	}
	
	public MaisVelho(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String nomeVelho (int idade[], String nome[], int auxIdade) {
		String auxNome = "default";
		auxIdade = idade[0];
		for(int i = 0; i < idade.length; i++) {
			System.out.println("auxIdade " + auxIdade);
			if(idade[i] >= auxIdade) {
				auxNome = nome[i];
				auxIdade = idade[i];
			}
		}
		System.out.println("AUX: " + auxNome);
		return auxNome;
	}
	
}

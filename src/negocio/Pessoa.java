package negocio;

import auxiliar.Constante;

public abstract class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(){
		this.nome = Constante.NOME;
		this.idade = Constante.IDADE;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public abstract float calcularSalarioLiquido();
	
	@Override
	public String toString() {
		return String.format("Nome: %s - Idade: %d",
				this.nome,
				this.idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

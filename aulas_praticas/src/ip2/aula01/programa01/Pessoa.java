package ip2.aula01.programa01;

public class Pessoa {
	
	// ATRIBUTOS
	private String nome;
	private int idade;
	
	// Construtores
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	// METODOS
	public String getNome() {
		return this.nome;
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
	
	public void fazerAniversario() {
		this.idade++;
	}
	
	

}

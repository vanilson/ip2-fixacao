package ip2.aula12.heranca;

public class Funcionario {
	
	protected String cpf;
	private String nome;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}

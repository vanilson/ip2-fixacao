package ip2.aula13.heranca.model;

import java.time.LocalDate;

public class Funcionario {
	
	private int codigo;
	private String nome;
	private double salario;
	private LocalDate dataAdmissao;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int codigo, String nome, double salario, LocalDate dataAdmissao) {
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	
	

}

package ip2.aula13.heranca.model;

import java.time.LocalDate;

public class Gerente extends Funcionario {
	
	private String departamento;
	
	public Gerente() {
		
	}
	
	public Gerente(int codigo, 
			String nome, 
			double salario, 
			LocalDate dataAdmissao,
			String departamento) {

		super(codigo, nome, salario, dataAdmissao);
		
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}

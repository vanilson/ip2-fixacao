package ip2.aula13.heranca.model;

import java.time.LocalDate;

public class Vendedor extends Funcionario {
	
	private double percentualComissao;
	
	public Vendedor() {
		
	}
	
	public Vendedor(int codigo, 
			String nome, 
			double salario, 
			LocalDate dataAdmissao,
			double percentualComissao) {
		
		super(codigo, nome, salario, dataAdmissao);
		
		this.percentualComissao = percentualComissao;
		
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	
	

}

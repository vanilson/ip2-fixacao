package ip2.aula12.heranca;

public class Engenheiro extends Funcionario {
	
	public Engenheiro(String cpf, String nome, String CREA) {
		
		super(cpf, nome);
		
		this.CREA = CREA;
		this.cpf = cpf;
	}
	
	private String CREA;

	public String getCREA() {
		return CREA;
	}

	public void setCREA(String cREA) {
		CREA = cREA;
	}

}

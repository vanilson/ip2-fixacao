package ip2.aula12.heranca;

import java.util.List;

public class Medico extends Funcionario {
	
	
	private String CRM;
	private List<String> especialidades;

	public List<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}
	
	

}

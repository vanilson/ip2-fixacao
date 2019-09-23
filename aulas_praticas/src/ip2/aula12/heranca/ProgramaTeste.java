package ip2.aula12.heranca;

public class ProgramaTeste {

	public static void main(String[] args) {
		
		Medico m = new Medico();
		m.setCpf("123");
		m.setNome("Joao");
		m.setCRM("121297");
		
		Engenheiro e = new Engenheiro("12345", "Maria", "1212971212");
		
		System.out.println("CRM do Medico: " + m.getCRM());

	}

}

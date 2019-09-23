package ip2.aula01.programa01;

import ip2.aula04.Conta;

public class Programa01 {

	public static void main(String[] args) {
		Conta c = new Conta("1234-5", 50);
		double saldo = c.getSaldo();
		
		
		System.out.println("Instanciando uma pessoa...");
		
		Pessoa p = new Pessoa();
		
		Pessoa p2 = new Pessoa("Maria Jose", 25);
		
		System.out.println("Pessoa criada!");
		
		p.setNome("Jose Silva");
		
		System.out.println("Nome informado: " + p.getNome());
		
		System.out.println("P2 - Idade: " + p2.getIdade());
		p2.fazerAniversario();
		p2.fazerAniversario();
		p2.fazerAniversario();
		p2.fazerAniversario();
		System.out.println("P2 - Idade: " + p2.getIdade());

	}

}

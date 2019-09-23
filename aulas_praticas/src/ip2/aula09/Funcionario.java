package ip2.aula09;

import java.time.LocalDate;

public class Funcionario {
	
	// CONSTANTES
	public static final String GERENTE = "Gerente";
	public static final String VENDEDOR = "Vendedor";
	public static final String MOTORISTA = "Motorista";
	
	// ATRIBUTOS
	private int codigo;
	private String nome;
	private double salario;
	private String cargo;
	private LocalDate dataAdmissao;
	
	// CONSTRUTOR DEFAULT
	public Funcionario() {
		
	}

	// CONSTRUTOR RECEBENDO VALORES PARA TODOS OS ATRIBUTOS
	public Funcionario(int codigo, String nome, double salario, String cargo, LocalDate dataAdmissao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
	}
	
	
	// GET / SET
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
		
		if (nome == null) {
			throw new IllegalArgumentException("Nome inválido!!");
		}
		
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		
		if (!GERENTE.equals(cargo) && 
			!VENDEDOR.equals(cargo) && 
			!MOTORISTA.equals(cargo)) {
			
			throw new IllegalArgumentException("Cargo inválido!!");
		}
		
		this.cargo = cargo;
	}
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public boolean equals(Funcionario obj) {

		if (obj == null) {
			return false;
		}
		
		return obj.codigo == this.codigo;
	}
	
	

	
}

package ip2.aula13.heranca.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ip2.aula13.heranca.model.Funcionario;
import ip2.aula13.heranca.model.Gerente;
import ip2.aula13.heranca.model.Vendedor;

public class RepositorioFuncionariosArray {
	
	private ArrayList <Funcionario> funcionarios;
	
	public RepositorioFuncionariosArray() {
		this.funcionarios = new ArrayList();
	}
	
	public boolean inserir(Funcionario funcionario) {
		if (funcionario == null) {
			return false;
		}
		
		if (existe(funcionario)) {
			return false;
		}
		
		this.funcionarios.add(funcionario);
		return true;
	}

	private boolean existe(Funcionario funcionario) {
		
		if(funcionario == null) {
			return false;
		}
		
		return existe(funcionario.getCodigo());
		
	}
	
	private boolean existe(int codigo) {
		return buscar(codigo) != null;
	}
	
	public Funcionario buscar(int codigo) {
		
		for(Funcionario f: this.funcionarios) {
			if(f.getCodigo() == codigo) {
				return f;
			}
		}
		
		return null;
	}
	
	public boolean remover(int codigo) {
		Funcionario funcionario = buscar(codigo);
		
		if (funcionario == null) {
			return false;
		}
		
		return this.funcionarios.remove(funcionario);
	}
	
	public double somarTodosOsSalarios() {

		return this.funcionarios.stream()
				.map(Funcionario::getSalario)
				.mapToDouble(Double::doubleValue)
				.sum();
	}
	
	public int calcularTotalVendedores () {
		
		int totalVendedores = 0;
		
		for (Funcionario funcionario : funcionarios) {
			if (funcionario instanceof Vendedor) {
				totalVendedores++;
			}
		}
		
		return totalVendedores;
	}

	public double calcularMediaSalarialGerentes() {
		
		double totalSalario = 0;
		int totalGerentes = 0;
		
		for (Funcionario funcionario : funcionarios) {
			
			if (funcionario instanceof Gerente) {
				totalSalario += funcionario.getSalario();
				totalGerentes++;
			}
		}
		
		return totalGerentes > 0 ? totalSalario / totalGerentes : 0;
		
	} 
	

}

package ip2.aula13.heranca.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ip2.aula13.heranca.model.Funcionario;

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

}

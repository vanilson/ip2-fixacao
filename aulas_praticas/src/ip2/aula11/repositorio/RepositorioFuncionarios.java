package ip2.aula11.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ip2.aula11.negocio.Funcionario;

public class RepositorioFuncionarios {
	private ArrayList <Funcionario> funcionarios;
	
	public RepositorioFuncionarios() {
		this.funcionarios = new ArrayList();
	}
	
	
	boolean inserir(Funcionario funcionario) {
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
	
	public List<Funcionario> listarPorCargo(String cargo) {
		
		if (cargo == null) {
			return this.funcionarios;
		}
		
		return funcionarios.stream()
				.filter(f -> cargo.equals(f.getCargo()))
				.collect(Collectors.toList());
		
//		ArrayList<Funcionario> retorno = new ArrayList();
//		
//		// se for nao filtra por ninguem! Retorna todos os funcionarios
//		if (cargo == null) {
//			return this.funcionarios;
//		}
//		
//		for (Funcionario f : this.funcionarios) {
//			if (cargo.equals(f.getCargo())) {
//				retorno.add(f);
//			}
//		}
//		
//		return retorno;
	}
	

}

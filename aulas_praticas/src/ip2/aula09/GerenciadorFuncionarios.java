package ip2.aula09;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionarios {
	private ArrayList <Funcionario> funcionarios;
	
	public GerenciadorFuncionarios() {
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
	
	public List<Funcionario> listarPorCargo(String cargo) {
		ArrayList<Funcionario> retorno = new ArrayList();
		
		// se for nao filtra por ninguem! Retorna todos os funcionarios
		if (cargo == null) {
			return this.funcionarios;
		}
		
		for (Funcionario f : this.funcionarios) {
			if (cargo.equals(f.getCargo())) {
				retorno.add(f);
			}
		}
		
		return retorno;
	}
	

}

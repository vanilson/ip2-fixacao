package ip2.aula13.heranca;

import java.time.LocalDate;

import ip2.aula13.heranca.model.Funcionario;
import ip2.aula13.heranca.model.Gerente;
import ip2.aula13.heranca.model.Vendedor;
import ip2.aula13.heranca.repositorio.RepositorioFuncionariosArray;

public class Programa {

	public static void main(String[] args) {
		
		
		Funcionario f = new Gerente();
		
		Vendedor v = new Vendedor();
		v.setPercentualComissao(0.5);
		v.setNome("Joao");
		
		f = v;
		
		if (f instanceof Vendedor) {
			System.out.println("Percentual comissao de f: " + ((Vendedor) f).getPercentualComissao());
		}
		
		RepositorioFuncionariosArray repositorio = new RepositorioFuncionariosArray();

		LocalDate dataAdmissao = LocalDate.of(2019, 04, 21);
		
		Funcionario f1 = new Funcionario(1, "Joao", 1000, dataAdmissao);
		Funcionario f2 = new Funcionario(2, "Maria", 1000, dataAdmissao);
		
		Gerente g1 = new Gerente(3, "Jose", 1000, dataAdmissao, "Compras");
		Gerente g2 = new Gerente(4, "Maria Jose", 2000, dataAdmissao, "Informatica");
		
		Vendedor v1 = new Vendedor(5, "Joao da Silva", 2000, dataAdmissao, 0.5d);
		Vendedor v2 = new Vendedor(6, "Ana da Silva", 2500, dataAdmissao, 0.7d);		
		
		repositorio.inserir(f1);
		repositorio.inserir(f2);
		
		repositorio.inserir(g1);
		repositorio.inserir(g2);

		repositorio.inserir(v1);
		repositorio.inserir(v2);
		
		Funcionario func = repositorio.buscar(5);
		System.out.println("Funcionario retornado: " + func.getNome());
		
		if (func instanceof Gerente) {
			Gerente gerente = (Gerente) func;
			System.out.println("Departamento: " + gerente.getDepartamento());
		
		} else if (func instanceof Vendedor) {
			Vendedor vendedor = (Vendedor) func;
			System.out.println("Vendedor retornado! | Comissão: " + vendedor.getPercentualComissao() + "%");	
		}
	}

}

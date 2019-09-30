package ip2.aula15;

public class Programa {

	public static void main(String[] args) {
//		Crie um array de pessoas de tamanho qualquer (variável local)
		Pessoa[] pessoas = new Pessoa[10];

//		Crie dois estudantes com pelo menos dois cursos e suas respectivas notas de cada curso, e adicione no array
		Estudante e1 = new Estudante();
		e1.setNome("João");
		e1.setCursos(new String[] { "IP2", "Introducao a Computacao" });

		Estudante e2 = new Estudante();
		e2.setNome("Maria");
		e2.setCursos(new String[] { "IP2", "Metodologia Cientifica" });

		pessoas[0] = e1;
		pessoas[1] = e2;

//		Crie dois professores com pelo menos dois cursos e adicione no array
		Professor prof1 = new Professor("Jose", "Rua A", new String[] { "IP2", "Desenv. Apps Moveis", "Desenv. aplicacoes Web" });
		Professor prof2 = new Professor("Cesar", "Rua B", new String[] { "IP2", "Desenvolvimento de jogos" });

		pessoas[2] = prof1;
		pessoas[3] = prof2;

//		Polimorficamente, varra o array de pessoas e imprima todas elas.
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null) {
				System.out.println("Pessoa: " + pessoas[i]);
			}
		}

//		Crie um método estático nesta classe que receba um Array de pessoas como parâmetro e retorne uma String contendo todos os alunos de um determinado curso de um dado Professor no seguinte formato:
//		Curso: programação
//		Professor: Leandro
//		Alunos: 
//		Maria
//		João
//		José

	}

}

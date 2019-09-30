package ip2.aula15;

import java.util.Arrays;

public class Professor extends Pessoa {

	int numCursos;
	String[] cursos;

	public Professor(String nome, String endereco, String[] cursos) {
		super(nome, endereco);
		
		this.cursos = cursos;
		this.numCursos = cursos.length;
		
	}
	
	public int getNumCursos() {
		return numCursos;
	}

	public void setNumCursos(int numCursos) {
		this.numCursos = numCursos;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Professor [cursos=" + Arrays.toString(cursos) + ", nome=" + getNome() + ", endereco=" + getEndereco() + "]";
	}
	
	
}

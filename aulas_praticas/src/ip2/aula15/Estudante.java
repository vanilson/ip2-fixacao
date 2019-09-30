package ip2.aula15;

import java.util.Arrays;

public class Estudante extends Pessoa {
	
	int numCursos;
	String[] cursos;
	int[] notas;
	
	
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
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	@Override
	public String toString() {
		return "Estudante [cursos=" + Arrays.toString(cursos) + ", notas=" + Arrays.toString(notas) + ", nome="
				+ getNome() + ", endereco=" + getEndereco() + "]";
	}
	
	

}

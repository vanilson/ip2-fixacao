package ip2.aula14;

public abstract class Mamifero extends Animal {
	protected boolean temPelos = true;

	public abstract int tempoGestacaoEmDias();

	void mamar() {
		System.out.println("Tomou leite!");
	}
}

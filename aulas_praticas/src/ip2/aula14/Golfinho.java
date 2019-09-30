package ip2.aula14;

public class Golfinho extends Mamifero implements Carnivoro, Peixe {
	public boolean contemGuelras() {
		return false;
	}

	public int tempoGestacaoEmDias() {
		return 322;
	}

	public boolean temSangueQuente() {
		return true;
	}

	public void comerCarne() {
		System.out.println("Golfinhos comem outros peixes");
	}
}

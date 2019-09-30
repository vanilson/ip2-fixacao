package ip2.aula14;

public class Cachorro extends Mamifero implements Carnivoro, Herbivoro {
	public void comerVegetais() {
		System.out.println("Cachorros também comem vegetais");
	}

	public void comerCarne() {
		System.out.println("Cachorros gostam de carne");
	}

	public int tempoGestacaoEmDias() {
		return 59;
	}

	public boolean temSangueQuente() {
		return true;
	}
}

package ip2.aula14;

public class Jacare extends Animal implements Carnivoro {
	public void comerCarne() {
		System.out.println("Jacarés são exímios caçadores");
	}

	public boolean temSangueQuente() {
		return false;
	}
}

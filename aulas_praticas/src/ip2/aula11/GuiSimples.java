package ip2.aula11;

import java.util.ArrayList;

public class GuiSimples {

	public static void main(String[] args) {
		
		double pi = Math.PI;

		ArrayList<String> nomesArrayList = new ArrayList();

		nomesArrayList.add("João");
		nomesArrayList.add("Pedro");

		String[] nomes = new String[2];
		nomes[0] = "Joao";
		nomes[1] = "Pedro";
		
		nomes[2] = "maria";
		
		
		for (int i = 0; i < nomesArrayList.size(); i++) {
			  System.out.println(nomesArrayList.get(i));
			 
			}


		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

		for (String nome : nomes) {
			  System.out.println(nome);
			}

	}

}

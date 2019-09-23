package ip2.aula04;

public class ProgramaAula04 {

	public static void main(String[] args) {
		Conta c; 
		Conta d;
		Conta e = null;
		Conta f = new Conta();
		
		c = new Conta("1234-5", 50);
		d = new Conta("1234-6", 300);
		
		c = d.clonar();

		System.out.println("Conta c: " + c);
		System.out.println("Conta d: " + d);
		
		System.out.println("Resultado de (c == d): " + (c == d));
		System.out.println("Resultado de c.equals(d): " + c.equals(d));
		System.out.println("Resultado de c.equals(e): " + c.equals(e));
		System.out.println("Resultado de c.equals(f): " + c.equals(f));
		System.out.println("Resultado de f.equals(c): " + f.equals(c));
		
		String s1 = new String("texto");
		String s2 = new String("texto");
		System.out.println("Resultado de s1 == s2 " + (s1 == s2));
		
		String s3 = "texto";
		String s4 = "texto";
		System.out.println("Resultado de s3 == s4 " + (s3 == s4));
		System.out.println("Resultado de s1.equals(s2)" + (s1.equals(s2)));
		System.out.println("Resultado de s3.equals(s4) " + (s3.equals(s4)));
		
		
	}

}

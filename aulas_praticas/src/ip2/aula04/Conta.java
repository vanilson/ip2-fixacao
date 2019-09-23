package ip2.aula04;

public class Conta {

	// ATRIBUTOS
	private String numero;
	protected double saldo;
	
	// GETs e SETs	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// CONSTRUTOR
	public Conta() {
	
	}
	
	public Conta(String num, double saldo) {
		this.numero = num;
		this.saldo = saldo;
	}
	
	public boolean equals(Conta c) {
		
		if (c == null || this.numero == null) {
			return false;
		}
		
		return this.numero.equals(c.numero);
	}
	
	public Conta clonar() {
		return new Conta(this.numero, this.saldo);
	}
	
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	

}

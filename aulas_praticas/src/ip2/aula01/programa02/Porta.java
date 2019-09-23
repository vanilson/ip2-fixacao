package ip2.aula01.programa02;

public class Porta {
	
	private String cor;
	private boolean aberta;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	
	
	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public void fechar() {
		this.aberta = false;
	}

	public void abrir() {
		this.aberta = true;
	}
	
	public void pintar (String cor) {
		if (cor == null) {
			return;
		}
		
		this.cor = cor;
	}
	
	public boolean estaAberta() {
		return this.aberta;
	}
	
	
}

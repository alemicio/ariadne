package it.ariadne.shapes;

public class Quadrato implements Forma{
	
	private Punto p;
	private int lato;

	public Quadrato(Punto p, int lato) {

		this.p = p;
		this.lato = lato;
	}

	public Punto getP() {
		return p;
	}

	public void setP(Punto p) {
		this.p = p;
	}

	public int getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}


	@Override
	public double calcolaperimetro() {
		// TODO Auto-generated method stub
		return lato * 4;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

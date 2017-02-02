package it.ariadne.shapes;

public class Cerchio implements Forma {
	private Punto p;
	private int raggio;

	public Cerchio(Punto p, int raggio){
		
		this.p = p;
		this.raggio = raggio;
	}

	public Punto getP() {
		return p;
	}

	public void setP(Punto p) {
		this.p = p;
	}

	public int getRaggio() {
		return raggio;
	}

	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}

	public double calcolaperimetro() {
		
		return 2 * 3 * raggio;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

package it.ariadne.test.shapes;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.shapes.Cerchio;
import it.ariadne.shapes.Mycanvas;
import it.ariadne.shapes.Punto;
import it.ariadne.shapes.Quadrato;

public class TestCanvas {
	
	private Mycanvas canvas;
	private Quadrato q;
	private Cerchio c;
	
	@Before
	public void setup(){
		canvas = new Mycanvas();
		Punto p = new Punto(12,31);
		int lato = 2;
		int raggio = 2;
		q = new Quadrato(p,lato);
		c = new Cerchio(p, raggio);
		canvas.add(q);
		canvas.add(c);
	}

	@Test
	public void dimensioneCanvas() {
		int canvasSize = canvas.size();
		Assert.assertEquals("il canvas contiene 2 forme", 2, canvasSize);
	}
	
	@Test
	public void controlloAreePerimetri(){
		
		double perimetroQuadrato = q.calcolaperimetro();
		double perimetroCerchio = c.calcolaperimetro();
		double perimetroTotale = canvas.calcolaPerimetro();
		Assert.assertEquals("il canvas contiene 2 forme", perimetroTotale, perimetroCerchio+perimetroQuadrato,0);
	}
	
	@Test
	public void bastard(){
		
		Quadrato q = new Quadrato(null, 0);
		
	}

}

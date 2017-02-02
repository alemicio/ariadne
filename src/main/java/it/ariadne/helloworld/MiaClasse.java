package it.ariadne.helloworld;

public class MiaClasse implements AutoCloseable {

	@Override
	public void close() throws Exception {
		
		System.out.println("miaclasse");

	}

}

package it.ariadne.helloworld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		
	List<String> lista = new LinkedList<>();
	
	lista.add("uno");
	lista.add("due");
	lista.add("tre");
	
	System.out.println(lista);
	
	Map<String, Persona> rubrica = new HashMap<>();
	Persona p1 = new Persona();
	Persona p2 = new Persona();
	Persona p3 = new Persona();
	
	p1.setCodicefiscale("GTTLSN91E09G388U");
	p2.setCodicefiscale("PPPLSN91E09G388U");
	p3.setCodicefiscale("CCCLSN91E09G388U");
	
	p1.setNome("Emily");
	p1.setCognome("pene");
	
	rubrica.put("adriana", p1);
	rubrica.put("simo", p2);
	
	rubrica.forEach( (k,v) -> System.out.println(k + ": " + v));
	
	for (Iterator iterator = rubrica.keySet().iterator(); iterator.hasNext();) {
		String key = (String) iterator.next();
		Persona value = rubrica.get(key);
		System.out.println(value);
	}
	
	}

}

class Persona{
	private String cognome;
	private String nome;
	private String codicefiscale;
	
	
	
	@Override
	public String toString() {
		return "Persona [cognome=" + cognome + ", nome=" + nome + ", codicefiscale=" + codicefiscale + "]";
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodicefiscale() {
		return codicefiscale;
	}
	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
}
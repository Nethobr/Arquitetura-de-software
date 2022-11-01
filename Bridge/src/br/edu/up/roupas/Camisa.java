package br.edu.up.roupas;

import br.edu.up.RoupaAbstrata;
import br.edu.up.RoupaImplementation;

public class Camisa extends RoupaAbstrata
{
	String tam = "";
	public Camisa (RoupaImplementation r, String tam)
	{
		super(r);
		this.tam = tam;
	}

	@Override
	public void criarRoupa() 
	{
		setRoupa("Camisa");
		setTamanho(tam);
		setCor();
	}	
}
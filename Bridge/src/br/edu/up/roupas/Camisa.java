package br.edu.up.roupas;

import br.edu.up.MarcaImplementation;
import br.edu.up.RoupaAbstrata;
import br.edu.up.RoupaImplementation;

public class Camisa extends RoupaAbstrata
{
	String tam = "";
	MarcaImplementation marca;
	public Camisa (RoupaImplementation r, MarcaImplementation marca, String tam)
	{
		super(r);
		this.marca = marca;
		this.tam = tam;
	}

	@Override
	public void criarRoupa() 
	{
		setRoupa("Camisa");
		setMarca(marca.getNome());
		setTamanho(tam);
		setCor();
	}	
}
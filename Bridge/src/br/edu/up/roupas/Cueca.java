package br.edu.up.roupas;

import br.edu.up.MarcaImplementation;
import br.edu.up.RoupaAbstrata;
import br.edu.up.RoupaImplementation;

public class Cueca extends RoupaAbstrata
{
	String tam = "";
	MarcaImplementation marca;
	public Cueca (RoupaImplementation r, MarcaImplementation marca, String tam)
	{
		super(r);
		this.tam = tam;
		this.marca = marca;
	}

	@Override
	public void criarRoupa() {
		setRoupa("Cueca");
		setMarca(marca.getNome());
		setTamanho(tam);
		setCor();
	}
}
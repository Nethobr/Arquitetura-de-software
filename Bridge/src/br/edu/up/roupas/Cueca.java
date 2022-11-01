package br.edu.up.roupas;

import br.edu.up.RoupaAbstrata;
import br.edu.up.RoupaImplementation;

public class Cueca extends RoupaAbstrata
{
	String tam = "";
	public Cueca (RoupaImplementation r, String tam)
	{
		super(r);
		this.tam = tam;
	}

	@Override
	public void criarRoupa() {
		setRoupa("Cueca");
		setTamanho(tam);
		setCor();
	}
}
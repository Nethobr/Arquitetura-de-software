package br.edu.up.roupas;


import br.edu.up.CorAbstrata;
import br.edu.up.EstampaAbstrata;
import br.edu.up.MarcaAbstrata;
import br.edu.up.RoupaAbstrata;
import br.edu.up.RoupaImplementation;

public class Cueca extends RoupaAbstrata
{
	String tam = "";
	MarcaAbstrata marca;
	EstampaAbstrata estampa;
	CorAbstrata cor;
	public Cueca (CorAbstrata cor, MarcaAbstrata marca, EstampaAbstrata estampa, String tam, RoupaImplementation r)
	{
		super(r);
		this.marca = marca;
		this.tam = tam;
		this.estampa = estampa;
		this.cor = cor;
	}

	@Override
	public void criarRoupa()
	{
		setRoupa("Cueca");
		setMarca(marca);
		setEstampa(estampa);
		setTamanho(tam);
		setCor(cor);
	}	
}
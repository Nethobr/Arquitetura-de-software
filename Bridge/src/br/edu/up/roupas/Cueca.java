package br.edu.up.roupas;


import br.edu.up.abstracoes.CorAbstrata;
import br.edu.up.abstracoes.EstampaAbstrata;
import br.edu.up.abstracoes.MarcaAbstrata;
import br.edu.up.abstracoes.RoupaAbstrata;
import br.edu.up.abstracoes.TamanhoAbstrato;
import br.edu.up.interfaces.RoupaImplementation;

public class Cueca extends RoupaAbstrata
{
	String tam = "";
	MarcaAbstrata marca;
	EstampaAbstrata estampa;
	CorAbstrata cor;
	TamanhoAbstrato tamanho;
	public Cueca (CorAbstrata cor, MarcaAbstrata marca, EstampaAbstrata estampa, TamanhoAbstrato tamanho, RoupaImplementation r)
	{
		super(r);
		this.marca = marca;
		this.tamanho = tamanho;
		this.estampa = estampa;
		this.cor = cor;
	}

	@Override
	public void criarRoupa()
	{
		setRoupa("Cueca");
		setMarca(marca);
		setEstampa(estampa);
		setTamanho(tamanho);
		setCor(cor);
	}	
}